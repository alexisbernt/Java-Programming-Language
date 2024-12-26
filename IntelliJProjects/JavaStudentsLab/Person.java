public class Person {
    // Class variables
    private String firstName;
    private String lastName;
    // private makes it only accessible within declared class

    // Constructors
    // Default constructor (1)
    public Person(){
        // "this" is a reference to the current object
        this.firstName = "None"; // take no arguments
        this.lastName = "None";
    }
    // Setting constructors
    // Regular constructor (2) wants value for each class variable
    public Person(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName -- return type is always void
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override // override provides specific implementation for a method
    public String toString() {
        return "Name is [" + this.getFirstName() + " " + this.getLastName() + "]";
    }

}
