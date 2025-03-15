import java.util.Random;
import java.util.Arrays;

public class IntArray {
    // private fields
    private int length;
    private int myArray[];
    
    // Constructor
    public IntArray (int l) {
        length = l;
        this.myArray = new int [l];
    }
    // Clears the array
    public void clear() {
        for (int i = 0; i < length; i++) {
            myArray = new int [0];
        }
    }
    // Fills the array with random integers
    public void fillRand() {
        for (int i = 0; i < length; i++) {
            Random myRand = new Random();
            myArray[i] = 1 + myRand.nextInt(6);
        }
    }
    public int get(int element) {
        return myArray[element];
    }
    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }
    public int size() {
        return length;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public void sort() {
        Arrays.sort(myArray);
    }
    public String toString() {
        return "IntArray instance data: " + "\n" + Arrays.toString(myArray);
    }
}
