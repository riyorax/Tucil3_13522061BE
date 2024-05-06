package com.example.tucil3_13522061be.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.example.tucil3_13522061be.model.*;
import com.example.tucil3_13522061be.service.SolverService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class SolverController {

    private final SolverService solverService = new SolverService();


    @PostMapping("/api")
    public ResponseEntity<?> processRequestAndSendSolution(@RequestBody RequestClass request) {
        try {
            ResponseClass response = solverService.process(request);
            if (response != null) {
                return ResponseEntity.ok(response);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error processing request: " + e.getMessage());
        }
    }
}
