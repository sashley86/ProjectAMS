public class Pet {
    
    //private data field
    private String name;
    
    //default constructor
    public Pet(String name) {
        this.name = name;
    }
    //public get(accessor) or set(mutator) method for every private data field(except if it is a secret or read-only)
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    //public toString method that prints out all of the object state(meaning the data in the object instance that you will later instantiate in the main[] method)
    public String toString() {
        return "Pet Information:" + "\n" + "Name: " + name + "\n";
    }
    // main method
    public static void main (String[] args) {
        //instantiate Pet
        Pet myPet1 = new Pet("Pet Name");
        Pet myPet2 = new Pet(" ");
        myPet2.setName("Hyleigh");
        System.out.println(myPet1);
        System.out.println(myPet2);
    }
}
