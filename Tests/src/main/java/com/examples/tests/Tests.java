package com.examples.tests;
/**
 *
 * @author AM
 */
public class Tests {

    public static void main(String[] args) {
        // declare 3 variables
        double myTest1 = 88.2;
        double myTest2 = 78.9;
        double myTest3 = 97.6;
        
        System.out.println("Test Score 1: " + myTest1); // display test 1
        System.out.println("Test Score 2: " + myTest2); // display test 2
        System.out.println("Test Score 3: " + myTest3); // display test 3
        
        // adding 3 test scores and dividing the sum by 3
         double myScores = (myTest1 + myTest2 + myTest3) /3;
         
        // format myScores to display 2 digits after decimal
         String myScore = String.format("%.2f", myScores);
        
        // displaying the average of 3 tests
        System.out.print("The average of 3 test scores is: " + myScore);
    }
}
