package ENSE600;
/*
Author: Nihal Patel
ID: 17998542
Project ID: 78
Who Wants to Be a Millionaire?
Description: The main fuction of this progarm is to run a Who Wants to Be a Millionaire?, by reading/writing the file with the
contestants and reading the file with the quetions.
*/
import java.io.*;
   public class Question
   {
   	// Static Variable Declarations
        static FileReader file;
        static BufferedReader buffer;
        static String question , option_a, option_b, option_c, option_d, answer, hint;
        static int value;
        // Methods
        public void question() {
            try{
                file = new FileReader("questions.txt"); // Initializes  the FileReader
                buffer = new BufferedReader(file); // Initializes the BufferedReader
            }
                catch (IOException e){
            }
        }
        public String getQuestion() {
            try {
                question = buffer.readLine(); // Sets the value of question
            }
                catch (IOException e) {
            }
            return question;
        } 
        public String getOption_A() {
            try {
                option_a  = buffer.readLine(); // Sets the value of a
            }
                catch (IOException e) {

            }
            return option_a;
        }
        public String getOption_B() {
            try {
                option_b  = buffer.readLine(); // Sets the value of b
            }
                catch (IOException e){

            }
            return option_b;
        }
        public String getOption_C() // Method to return option c
        {
            try{
                option_c  = buffer.readLine(); // Sets the value of c
            }
                catch (IOException e){

            }
            return option_c;
        }
        public String getOption_D() // Method to return option d
        {
            try{
                option_d  = buffer.readLine(); // Sets the value of d
            }
                catch (IOException e){
            }
            return option_d;
        }
        public String getAnswer() // Method to return the answer
        {
            try{
                answer  = buffer.readLine(); // Sets the value of answer
            }
                catch (IOException e){
            }
            return answer;
        }
        public String getHint() // Method to return the hint
        {
            try{
                hint  = buffer.readLine(); // Sets the value of hint
            }
                catch (IOException e){
            }
            return hint; // returns hint
        }
        
        public void resetBuffer () // Method to reset the buffer so that the question becomes the very first question in the text file everytime a contestant finishes his/her turn
        {
            try {
                file.close(); // Closes the file
                buffer.close(); // Closes the buffer
                file = new FileReader("questions.txt"); // Reinitializes the file
                buffer = new BufferedReader(file); // Reinitializes the buffer
            }
                catch (IOException e) {
            }
        }
   }
