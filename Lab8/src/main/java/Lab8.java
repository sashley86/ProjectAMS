import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;


public class Lab8 {
    //main method
    public static void main(String[] args){
        String inFile = "pay.csv";
        String outFile = "output.csv";
        
        //try catch block for ioexceptions to be called
        try {
            //Reading pay.csv file and Writing to output.csv
            BufferedReader tp = new BufferedReader(new FileReader(inFile));
            BufferedWriter tpw = new BufferedWriter(new FileWriter(outFile));
            String header = tp.readLine();
            String line;
            //new headers in output.csv file
            tpw.write("EmpID, Pay Rate, Hours, Weekly Pay");
            //Reading pay.csv file
            while((line = tp.readLine()) != null) {
                String[] vals = line.split(",");
                String values = Arrays.toString(vals);
                System.out.println(values + "\t");
                
                //Perform weekly pay calculations
                DecimalFormat df = new DecimalFormat("0.00");
                double payRate = Double.parseDouble(vals[1]);
                double hoursWorked = Double.parseDouble(vals[2]);
                double weekPay;
                double otHours = hoursWorked - 40;
                double otPay = payRate * 1.5;
                
                if(hoursWorked <= 40) {
                    weekPay = hoursWorked * payRate;
                    System.out.println(df.format(weekPay));
                }else {
                    weekPay = (hoursWorked * payRate) + (otHours * otPay);
                    System.out.println(df.format(weekPay));
                }
                //Writing to new output.csv file
                tpw.newLine();
                tpw.write(vals[0] + "\t" + vals[1] + "\t" + vals[2] + "\t" + df.format(weekPay));   
            }
            tpw.close();
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}    
