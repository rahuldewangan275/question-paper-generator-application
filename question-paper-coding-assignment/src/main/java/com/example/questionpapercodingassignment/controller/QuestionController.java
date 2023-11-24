package com.example.questionpapercodingassignment.controller;

import com.example.questionpapercodingassignment.model.GeneratePaperRequest;
import com.example.questionpapercodingassignment.model.Question;
import com.example.questionpapercodingassignment.repository.QuestionRepository;
import com.example.questionpapercodingassignment.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @Autowired
    QuestionRepository questionRepository;

    @PostMapping("/add-question")
    public String addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
        return "Question added Successfully";
    }


    @GetMapping("/get-all-questions")
    public List<Question> getQuestions(){
        return questionRepository.getQuestions();
    }

    @GetMapping("/generate-paper")
    public List<Question> generateQuestionPaper(@RequestBody GeneratePaperRequest request) {
        return questionService.generateQuestionPaper(request.getTotalMarks(), request.getEasyPercentage(), request.getMediumPercentage(), request.getHardPercentage());
    }
}
