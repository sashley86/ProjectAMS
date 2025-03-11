import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;



public class IntArray {
    // private fields
    private int length;
    private int myArray[];
    
    public IntArray (int l) {
        this.length = l;
        this.myArray = new int [l];
    }
    public void clear() {
        for (int i = 0; i < length; i++) { 
        }
    }
    public void fillRand() {
        Random myRand = new Random();
        for (int i = 0; i < length; i++){
            int raNumber = myRand.nextInt(6)+ 1;
            System.out.println(raNumber);
        }
    }
    public int get(int element ) {
        return element;
    }
    public void set(int element, int newValue) {
        if (element >= 0 && element < length) {
            myArray[element] = newValue;
            System.out.println(newValue);
        }
    }
    public int size() {
        return length;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public void sort() {
        System.out.println(length);
    }
    public String toString() {
        return " IntArray instance data: " +  "\n";
    }
}
