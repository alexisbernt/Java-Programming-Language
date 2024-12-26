public class Employee extends Person { // extends signals = inheritance
    // Class variables
    private String jobTitle;
    private Double salary;

    // Default constructor (1)
    public Employee() {
        super();  // Calls the default constructor of Person
        this.setJobTitle("None"); // take no arguments
        this.setSalary(0.0); // set default salary to a double
    }

    // Regular constructor: Constructor with firstName, lastName, salary, and jobTitle (2)
    public Employee(String firstName, String lastName, String jobTitle, Double salary) {
        super(firstName, lastName);  // Calls the parameterized constructor of Person
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.setJobTitle(jobTitle);
        this.setSalary(salary);
    }

    // Getter for jobTitle
    public String getJobTitle() {
        return this.jobTitle;
    }

    // Setter for jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Getter for salary
    public Double getSalary() {
        return this.salary;
    }

    // Setter for salary
    public void setSalary(Double salary) {
        this.salary = salary;

    }

    // Override toString() to include jobTitle and salary
    @Override
    public String toString() {
        String salaryString = salary.toString();
        return super.toString() + ", Job Title = " + getJobTitle() + ", Salary = " + salaryString;
    }
}
