package com.example.questionpapercodingassignment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GeneratePaperRequest {
    private int totalMarks;
    private double easyPercentage;
    private double mediumPercentage;
    private double hardPercentage;
}
