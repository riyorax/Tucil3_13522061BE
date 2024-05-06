package com.example.tucil3_13522061be.service;

import com.example.tucil3_13522061be.model.RequestClass;
import com.example.tucil3_13522061be.model.ResponseClass;
import com.example.tucil3_13522061be.model.Solver;

import java.util.ArrayList;
import java.util.List;

public class SolverService {
    private final Solver solver = new Solver();

    public ResponseClass process(RequestClass request) {
        if("".equals(request.startWord()) && "".equals(request.endWord())){
            return new ResponseClass("endWord not in Dictionary", 0L, new ArrayList<>(), 0, 0);
        }
        if("".equals(request.startWord())){
            return new ResponseClass("startWord not in Dictionary", 0L, new ArrayList<>(), 0, 0);
        }
        if("".equals(request.endWord())){
            return new ResponseClass("endWord not in Dictionary", 0L, new ArrayList<>(), 0, 0);
        }
        List<String> result = new ArrayList<>();
        long start = System.currentTimeMillis();
        System.out.println(request.startWord());
        System.out.println(request.endWord());
        System.out.println(request.method());
//        if(request.method().equals("ucs")){
//            result = solver.solveUCS(request.startWord(), request.endWord());
//        }
        result = switch (request.method()){
            case "ucs" ->solver.solveUCS(request.startWord(), request.endWord());
            case "gbfs" -> solver.solveGBFS(request.startWord(), request.endWord());
            case "a*" -> solver.solveAStar(request.startWord(), request.endWord());
            default -> new ArrayList<>();
        };
//        System.out.println(solver.getDictionary().getWords());
        System.out.println(result);
        long end = System.currentTimeMillis();
        return new ResponseClass("success processing", (end-start), result, solver.getNodeTraversed(), result.toArray().length );


    }
}
