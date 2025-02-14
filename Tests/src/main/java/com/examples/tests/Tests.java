package com.examples.tests;
import java.util.Scanner;

/**
 *
 * @author AM
 */
public class Tests {
    private double ave;
    private int count;
    private int score;
    
    public Tests() {
      // default constructor  
    }
    public double getAve() {
        return ave;
    }
    public void getAverage() {
        //declare a local variable for the sum and count of scores
        double sum = 0;
        int counts = 0;
        //declare a scanner variable for user input
        Scanner scans = new Scanner(System.in);
        //prompt user to enter test scores and informing user how to quit
        System.out.println("Enter test scores (enter -1 to quit): ");
        int score = scans.nextInt();
        
        while (score != -1) {
            sum += score;
            count++;
            System.out.println("Enter test scores (enter -1 to quit): ");
            score = scans.nextInt(); 
        }
        //calculate to get the average
        ave = sum / count ;
    }
    public int getCount() {
        return count;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int newScore) {
        this.score = newScore;
    }
    public String toString() {
        // formatting average to display two digits after decimal point
        String aves = String.format("%.2f" , ave);
        // display results
        return "The average of the " + count + " scores entered is " + aves + ".";
    }
}
