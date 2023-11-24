# question-paper-generator-application

Design and implement a Question Paper Generator application

This application helps us to implement a Question Paper and also adds new questions.

For this application I have used Java Spring Boot and to verify the API's I used postman tool.

To run this application


## step 1:
* mvn build 
* mvn spring-boot:run


## step 2 : > Open the main file QuestionPaperCodingAssignmentApplication.
## java file and run the application.
Details about the application :
>
1. Model
    > To add anew question and to view the added questions I have created a model for question with attribute names question, subject, topic, difficulty, marks.

2. Controller 
    > In this folder created a java file to run the API's 

3. Service
    > In this folder, where all the logic for the application was written
    
 4. Repository
   > all about database operations here I used ArrayList to store releated datas

## How to run in postman :
> To add a new question 
    POST http://localhost:8080/api/questions/add-question

    and with JSON body which will take input of question, subject, topic, difficulty, marks attributes.

> To view all the questions

    GET http://localhost:8080/questions/get-questions

> To generate a question paper
    POST http://localhost:8080/questions/generate-paper

    and with JSON body which will take input of totalmarks,easypercentage,mediumpercentage,hardpercentage.

