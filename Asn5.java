import java.util.ArrayList;

public class Asn5 {
    
    // main method
    public static void main(String args[]) {
        // Create a List of fruits
        ArrayList<String> wordList = new ArrayList <>();
        wordList.add("strawberry");
        wordList.add("blue berry");
        wordList.add("cherry");
        wordList.add("grape");
        // Create a List of numbers
        ArrayList<Integer> numList = new ArrayList <> ();
        numList.add(27);
        numList.add(11);
        numList.add(15);
        numList.add(9);
        // Using basic for loop to display list of fruits
        for (int i = 0; i < wordList.size(); i++) {
            String words = wordList.get(i);
            System.out.println(words);
        }
        // Using enchanced for loop to display list of numbers
        for (int numbers : numList) {
            System.out.println(numbers);
        }
    }
}
