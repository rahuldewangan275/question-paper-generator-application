package com.example.questionpapercodingassignment.repository;

import com.example.questionpapercodingassignment.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionRepository {
    List<Question> questions;
    public QuestionRepository(){
        this.questions = new ArrayList<>();
    }
    public void addQuestion(Question question){
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
