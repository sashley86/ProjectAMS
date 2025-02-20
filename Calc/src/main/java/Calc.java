public class Calc {
    private double n1;
    private double n2;
    
    public Calc() {
        
    }
    public Calc(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public double add() {
        return n1 + n2;
    }
    public double subtract() {
        return n1 - n2;
    }
    public double multiply() {
        return n1 * n2;
    }
    public double divide() {
        return (n1 / n2);
    }
    public double getNum1() {
        return n1;
    }
    public double getNum2() {
        return n2;
    }
    public void setNum1(double n1) {
        this.n1 = n1; 
    }
    public void setNum2(double n2) {
        this.n2 = n2;
    }
    public String toString() {
        return "Display private data fields using toString(): " + "\n" + "Num1: " + n1 + "\n" + "Num2: " + n2;
    }
}
