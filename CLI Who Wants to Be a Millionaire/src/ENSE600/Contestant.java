/*
Author: Nihal Patel
ID: 17998542
Project ID: 78
Who Wants to Be a Millionaire?
Description: The main fuction of this progarm is to run a Who Wants to Be a Millionaire?, by reading/writing the file with the
contestants and reading the file with the quetions.
*/
package ENSE600;

    // Import Packages

    import java.io.*;
    import java.util.*;
    public class Contestant
    {
   	// Static Variable Declarations
        static FileReader file;
        static BufferedReader buffer;
        static String names[] = new String [4];
        static int money[] = new int [4], contestantnum, moneynum;
        static int values [] = new int [] {100, 200, 500, 1000, 2000, 5000, 10000, 20000, 75000, 50000, 100000, 250000, 500000, 750000, 1000000};
        // Methods
    
        public void contestant()
        {
            try {
                file = new FileReader("contestants.txt"); // Initializes a FileReader
                buffer = new BufferedReader(file); // Initializes a BufferedReader
            }
                catch (IOException e) {
            }
        }
      
        
        public String[] getNames() {
            try {
                for (int i = 0; i < 4; i++) { 
                    names[i]=buffer.readLine();
                }
            }
            catch (IOException e) {
            }
            return names; // Returns the array of Names
        }
        
        public int getMoney(int value) {
            int newvalue = 0; // Creates a new variable which will contain the new value
            for (int i = 0; i<15; i++) { // Goes through the 15 possible prize amounts
         
            if (value == values[i]) {// Checks to see if the value the user is at is the same as the value in the array
                newvalue = values[i+1]; // Sets the new value to be the next value in the array
                break; // Ends the program
            }
            else {
               newvalue = value; // Sets the new value to the same value
            }
            }
            return newvalue; // returns the newvalue
        }
        public int getLastValue(int value, boolean Right_Answer) {
            int lastvalue = 0; // Creates a variable to store the value of the last milestone
            for (int i = 0; i<15; i++) { // For loop to go through all the values
            
                if (value == 100) // If the value is the first question
                {
                   lastvalue = 0;  // The milestone becomes zero
                }
                else if (value == 500||value>=500&&value<5000) // If the value is 1000 and they got the question right
                {
                   lastvalue = 500; // The last value is 500
                }
                else if (value ==5000||value>=5000&&value<50000) // If the value is above 5000 and below 50000, The last value is 50000
                {
                   lastvalue = 5000; // The last value is 5000
                }
                else if (value ==50000||value>=50000&&value<500000) // If the value is above 50000 and below 500000, The last value is 50000
                {
                   lastvalue = 50000; // The last value is 50000
                }
                else if (value ==100000||value>=100000&&value<1000000) // If the value is above 100000 and below One Million, The last value is 100000
                {
                   lastvalue = 100000; // The last value is 100000
                }
                else if (value ==1000000 && Right_Answer == false) // If the value is one million and they got it wrong
                {
                   lastvalue = 100000; // The last value is 100000
                }
            }
            return lastvalue; // Returns the lastvalue
        }
        public int getLast_Correct_Value(int value)
        {
            int lastvalue = 0; // Creates a variable to store the value of the value when they decide to leave
            for (int i = 0; i<15; i++) // Goes through all the possible values
            {
                if (value == values[i]&&value!=100) // Checks to see if the value is the same as the one in the and to make sure that it is not 1000 so that there is no error
            {
                    lastvalue = values[i-1];
            }
                else if (value == values[i]&&value==200) // This one checks to see if the value is 1000
            {
                    lastvalue = 100; // The value is set as $100
            }
            }
            return lastvalue; // Returns the lastvalue
        }
        public void setValue (int value, String name)
        {
            int index = 0; // Variable for the index
            for (int i = 0; i<4; i++) // For loop to go through the 4 players
            {
            if (names[i].compareTo(name)==0) // Checks to see if the name of the one in the array is the same as the name of the user we are attempting to give a value won.
            {
               index = i; // Gives the value of the index
            }
        }
         money [index] = value; // Sets the value of the player
        }
        public int[] getArray()
        {
            return money; // Returns the whole Money array
        }
   }
