package com.example.tucil3_13522061be.model;

import java.util.List;

public record ResponseClass(
        String message,
        Long runtime,
        List<String> solution,
        int nodeTraversed,
        int pathLength
) {}
