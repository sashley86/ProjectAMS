/**
 *
 * @author AM
 */
public class Pet {
    
    //private data field
    private String name;
    
    //public Constructors
    public Pet (String name) {
        this.name = name;
        System.out.println("Pet Information: ");
    }
    //public get or accessor method for every private data field(except if it is a secret)
    public String getName() {
        return name;
    }
    //public set or mutator method for every private data field(except when the data field is read-only)
    public void setName(String newName) {
        this.name = newName;
    }    
    //public toString method that prints out all of the object state(meaning the data in the object instance that you will later instantiate in the main[] method)
    public String toString() {
        String output = "Name: ";
        output += this.getName();
        return output;
    }
    // main
    public static void main (String[] args) {
        //instantiate Pet
        Pet myPet = new Pet("Pet Name");
        System.out.println(myPet);
        Pet myPet2 = new Pet ("Buster");
        System.out.println(myPet2);
    }
}
