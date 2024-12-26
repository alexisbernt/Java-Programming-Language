public class Student extends Person {
    // extends signals = inheritance -- private makes it only accessible within declared class
    private String degree;
    private int studentNumber;

    // Default constructor (1)
    public Student() {
        // don't pass parameters in the default constructor when coding Java
        super();  // Calls the default constructor of Person
        // use setters here -- input and output validation
        this.setStudentNumber(-1);
        this.setDegree(null);
    }

    // Regular constructor: Constructor with firstName, lastName, degree, and studentNumber (2)
    public Student(String firstName, String lastName, String degree, int studentNumber) {
        super(firstName, lastName);  // Calls the parameterized constructor of Person
        this.setDegree(degree);
        this.setStudentNumber(studentNumber);
    }

    // Getter for studentNumber
    public String getDegree() {
        return this.degree;
    }

    // Setter for degree
    public void setDegree(String degree) {
        this.degree = degree;
    }

    // Getter for studentNumber
    public int getStudentNumber() {
        return studentNumber;
    }

    // Setter for studentNumber
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    // Override toString() to include studentNumber
    @Override
    public String toString() {
        return super.toString() + ", Student Number = " + this.getStudentNumber() + ", Degree = " + this.getDegree();
    }
}