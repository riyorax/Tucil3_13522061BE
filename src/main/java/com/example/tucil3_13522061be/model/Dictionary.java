package com.example.tucil3_13522061be.model;
import java.util.*;
import java.io.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Dictionary {

    private List<String> words;
    private Map<String, List<String>> patternMap;

    public Dictionary() {
        this.words = createWordList();
        this.patternMap = createPatternMap();
    }

    public List<String> createWordList() {
        List<String> words = new ArrayList<>();
        Resource resource = new ClassPathResource("dictionary.txt");

        try (InputStream inputStream = resource.getInputStream();
             Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim();
                words.add(word);
            }
        } catch (Exception e) {
            System.out.println("Error accessing or reading the file: " + e.getMessage());
        }

        return words;
    }

    public Map<String, List<String>> createPatternMap(){
        Map<String, List<String>> wordPatternMap = new HashMap<>();
        List<String> words = getWords();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String pattern = word.substring(0, i) + "*" + word.substring(i + 1);
                wordPatternMap.computeIfAbsent(pattern, k -> new ArrayList<>()).add(word);
            }
        }
        return  wordPatternMap;
    }

    public List<String> getWords(){
        return this.words;
    }

    public Map<String, List<String>> getPatternMap(){
        return this.patternMap;
    }

    public List<String> getSimilarWords(String originWord){
        List<String> similarWords = new ArrayList<>();
        for (int i = 0; i < originWord.length(); i++) {
            String pattern = originWord.substring(0, i) + "*" + originWord.substring(i + 1);
            List<String> words = this.patternMap.getOrDefault(pattern, new ArrayList<>());
            for (String word : words) {
                if (!word.equals(originWord)) {
                    similarWords.add(word);
                }
            }
        }
        return similarWords;
    }

    public boolean isInDictionary(String word){
        return this.words.contains(word);
    }
}

