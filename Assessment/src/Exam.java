import java.lang.Exception;
/** This class determines the grade for an exam */

public class Exam extends Assessment {
    // Private fields
    final int pointsEach;
    final int numMissed;
    
    /** The constructor sets the number of questions on the 
     exam and the number of questions missed. 
     @param questions the number of questions.
     @param missed the number of questions missed. 
     */
    
    public Exam (int questions, int missed) {
        int numScore = 0; // hold the exam score
        
        // Set the fields for questions and missed.
        numMissed = missed;
        
        // Calculating the points for each questions on the exam.
        pointsEach = 100 / questions;
        try {
            numScore = (questions - missed) * pointsEach;
            if(questions == 0 && missed == 0) {
                throw new ArithmeticException("Can't divide by zero.");
            }else {
                System.out.println(numScore);
            }
        }catch(ArithmeticException e) {
            System.out.println("Can't divide by zero.");
        }
        
        // Inhertited setScore method from class Assessment.
        setScore(numScore);
    }
    // The getPointsEach method to return the number of points each question is worth on the exam.
    public int getPointsEach() {
        return pointsEach;
    }
    // The getNumMissed method to return the number of missed questions on the exam. 
    public int getNumMissed() {
        return numMissed;
    }
}
