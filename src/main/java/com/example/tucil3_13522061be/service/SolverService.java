package com.example.tucil3_13522061be.service;

import com.example.tucil3_13522061be.model.RequestClass;
import com.example.tucil3_13522061be.model.ResponseClass;
import com.example.tucil3_13522061be.model.Solver;

import java.util.ArrayList;
import java.util.List;

public class SolverService {
    private final Solver solver = new Solver();

    public ResponseClass process(RequestClass request) {
        if(!solver.getDictionary().isInDictionary(request.startWord().toLowerCase()) && !solver.getDictionary().isInDictionary(request.endWord().toLowerCase())){
            return new ResponseClass("both not in Dictionary", 0L, new ArrayList<>(), 0, 0);
        }
        if(!solver.getDictionary().isInDictionary(request.startWord().toLowerCase())){
            return new ResponseClass("startWord not in Dictionary", 0L, new ArrayList<>(), 0, 0);
        }
        if(!solver.getDictionary().isInDictionary(request.endWord().toLowerCase())){
            return new ResponseClass("endWord not in Dictionary", 0L, new ArrayList<>(), 0, 0);
        }

        List<String> result = new ArrayList<>();
        long start = System.currentTimeMillis();
        result = switch (request.method()){
            case "ucs" ->solver.solveUCS(request.startWord().toLowerCase(), request.endWord().toLowerCase());
            case "gbfs" -> solver.solveGBFS(request.startWord().toLowerCase(), request.endWord().toLowerCase());
            case "a*" -> solver.solveAStar(request.startWord().toLowerCase(), request.endWord().toLowerCase());
            default -> new ArrayList<>();
        };
        long end = System.currentTimeMillis();
        return new ResponseClass("success processing", (end-start), result, solver.getNodeTraversed(), result.toArray().length );


    }
}
