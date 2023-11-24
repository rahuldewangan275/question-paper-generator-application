package com.example.questionpapercodingassignment.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question {
        private String question;
        private String subject;
        private String topic;
        private String difficulty;
        private int marks;
}

// input format json

//examples
//        {
//        "question": "What is the speed of sound",
//        "subject": "Physics",
//        "topic": "Waves",
//        "difficulty": "Easy",
//        "marks": 4
//        }

//        {
//        "question": "Describe the Doppler effect",
//        "subject": "Physics",
//        "topic": "Waves",
//        "difficulty": "Medium",
//        "marks": 8
//        }

//        {
//        "question": "Explain Huygens' principle",
//        "subject": "Physics",
//        "topic": "Waves",
//        "difficulty": "Hard",
//        "marks": 10
//        }

//        {
//        "question": "What are electromagnetic waves",
//        "subject": "Physics",
//        "topic": "Waves",
//        "difficulty": "Medium",
//        "marks": 6
//        }
//
