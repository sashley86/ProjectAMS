import java.util.Scanner;

public class Runner {
    
    // main method
    public static void main(String[] args){
        // instantiate 3 pet objects
        Pet myPet1 = new Pet();
        Pet myPet2 = new Pet("Hyleigh", "Dog", 11);
        
        //print out the object state of pet1 and pet2
        System.out.println(myPet1);
        System.out.println(myPet2);
        
        //taking user input for pet3
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter Pet Type: ");
        String type = scann.nextLine();
        System.out.println("Enter Pet Name: ");
        String name = scann.nextLine();
        System.out.println("Enter Pet Age: ");
        int age = scann.nextInt();
        
        //calling custom constructor and print out the object state with user input for pet3
        Pet myPet3 = new Pet(name, type, age);
        System.out.println("\n" + myPet3);
        
    }
}
