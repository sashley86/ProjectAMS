import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab8 {
    public static void main(String[] args) {
        String inFile = "pay.csv";
        String outFile = "output.csv";
        
        try {
            BufferedReader tp = new BufferedReader(new FileReader(inFile));
            BufferedWriter tpw = new BufferedWriter(new FileWriter(outFile));
            
            String line;
            String oldHeaders = tp.readLine();
            tpw.write("EmpID, Pay Rate, Hours Worked, Weekly Pay");
            tpw.newLine();
            
            //Reading each line from pay.csv file
            while ((line = tp.readLine()) != null) {
                String[] vals = line.split(",");
                
                // Calculating pay rate and hours data from pay.csv
                double payRate = Double.parseDouble(vals[1]);
                double hoursWorked = Double.parseDouble(vals[2]);
                double toTal;
                double otHours = hoursWorked - 40;
                double otPay = payRate * 1.5;
                if(hoursWorked >= 40) {
                    toTal = (40 * payRate) + (otHours * otPay);
                }
                else {
                    toTal = hoursWorked * payRate;
                }
                String weekPay = String.format("%.2f", toTal);
                
                // Writing to new csv file
                String modFile = myPayroll(vals);
                tpw.write(modFile + "," + weekPay);
                tpw.newLine();
            }
            tpw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    private static String myPayroll(String[] vals) {
        StringBuilder ntp = new StringBuilder();
        for(int i = 0; i < vals.length; i++) {
            ntp.append(vals[i]);
            if(i < vals.length - 1){
                ntp.append(",");
            }
        }
        return ntp.toString();
    }
}
