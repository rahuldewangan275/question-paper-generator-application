package com.example.questionpapercodingassignment.service;

import com.example.questionpapercodingassignment.model.Question;
import com.example.questionpapercodingassignment.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestionService {
   private final Random random;
    @Autowired
  private  QuestionRepository questionRepository;

    public QuestionService() {

        this.random=new Random();
    }

    public void addQuestion(Question question) {
      questionRepository.addQuestion(question);
    }

    public List<Question> generateQuestionPaper(int totalMarks, double easyPercentage, double mediumPercentage, double hardPercentage) {
        List<Question> questionPaper = new ArrayList<>();
        List<Question> easyQuestions = filterQuestionsByDifficulty("Easy");
        List<Question> mediumQuestions = filterQuestionsByDifficulty("Medium");
        List<Question> hardQuestions = filterQuestionsByDifficulty("Hard");

        int easyMarks = (int)(totalMarks*easyPercentage/100);
        int mediumMarks = (int)(totalMarks*mediumPercentage/100);
        int hardMarks = (int)(totalMarks*hardPercentage/100);

        addRandomQuestionsToPaper(questionPaper,easyQuestions,easyMarks);
        addRandomQuestionsToPaper(questionPaper,mediumQuestions,mediumMarks);
        addRandomQuestionsToPaper(questionPaper,hardQuestions,hardMarks);

        return questionPaper;

    }

    // filtering the questions by Difficulty Level
    private List<Question> filterQuestionsByDifficulty(String difficulty) {
        List<Question> filteredQuestions = new ArrayList<>();
        List<Question> allQuestions = questionRepository.getQuestions();

        for(Question question : allQuestions){
            if (question.getDifficulty().equals(difficulty)){
                filteredQuestions.add(question);
            }
        }
        return filteredQuestions;
    }

//     add Random Questions To Paper
    private void  addRandomQuestionsToPaper(List<Question> questionPaper, List<Question>questions, int marks){

        while(!questions.isEmpty() && marks >0){
            Question randomQuestion = getRandomQuestion(questions);
            questionPaper.add(randomQuestion);
            marks-=randomQuestion.getMarks();
            questions.remove(randomQuestion);
        }
    }

    private Question getRandomQuestion(List<Question> questions) {
        Question randomQuestion = questions.get(random.nextInt(questions.size()));
        return randomQuestion;
    }
}
