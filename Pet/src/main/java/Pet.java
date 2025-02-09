public class Pet {
    
    //private data field
    private String name;
    private String type;
    private int age;
    
    //default constructor
    public Pet() {
        this.name = "Pet Name";
        this.type = "Animal";
        this.age = 1;
    }
    // Custom constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
    //public get(accessor) or set(mutator) method for every private data field(except if it is a secret or read-only)
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getType() {
        return type;
    }
    public void setType(String newType) {
        this.type = newType;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "woof woof";
        }
        else if (type.equalsIgnoreCase("cat")) {
            return "meow meow";
        }
        else {
            return "grrr grrr";
        }
    }
    //public toString method that prints out all of the object state(meaning the data in the object instance that you will later instantiate in the main[] method)
    public String toString() {
        return "Pet Information:" + "\n" + "Type: " + type + "\n" + "Name: " + name + "\n" + "Sound: " + speak() + "\n" + "Age: " + age + "\n";
    }
}
