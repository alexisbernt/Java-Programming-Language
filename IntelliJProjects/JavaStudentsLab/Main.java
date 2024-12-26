import java.util.Scanner;
// to import classes in Java, you just have to have the different .java files in the same directory and then initialize an instance

// Sources used include: Java OOP Slides, W3 Schools, Professor Adam Office Hours

public class Main {
    public static void main(String[] args) {

        // --- tester code ---
//        Person p1 = new Person("Alexis", "Bernthal");
//        System.out.println(p1);
//        Student s1 = new Student("Alexia", "Jr.", "Art History", 8174309);
//        System.out.println(s1);
//        Employee e1 = new Employee("Adam", "SuperSpanier", "Dr. Teacher", "$10,000,000/hr");
//        System.out.println(e1);
        // ------

        // Step 1 = Create an integer called peopleNum and set it to 3
        int peopleNum = 3;
        // Step 2 = Create a Person array called people and set it to a size of peopleNum
        Person[] people = new Person[peopleNum]; // NOT: Person[] array = new int[peopleNum];
        // Step 3 = Create a for loop that counts from 0 to peopleNum
        for(int i = 0; i < peopleNum; i++){
            //people[i] = new Person("First Name: " + i, "Last Name: " + i);
            addPerson(people, i); // Step 4 = In the loop, call addPerson with the Person array created and the value of i
            System.out.print(people[i] + " ");
        }
        // Step 7 = Call printPeople with the people array
        printPeople(people);
    }

    public static void addPerson(Person[] people, int position) {
        String choice = getChoice();
        if(choice.equals("s")) {
            studentHandler(people, position);
        } else if (choice.equals("e")) {
            employeeHandler(people, position);
        } else {
            System.out.println("Error!");
        }
    }
    //
    public static void printPeople(Person[] people) {
        int length = people.length;
        for(int i = 0; i < length; i++) {
            System.out.print("\n********** NEW PERSON ***********\n");
            System.out.println(people[i]);
            System.out.println("\n********** END PERSON ***********\n");
        }
    }

    public static void studentHandler(Person[] people, int position) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\n\tEnter first name: ");
        String first = keyboard.nextLine();
        System.out.print("\tEnter Last name: ");
        String last = keyboard.nextLine();
        System.out.print("\tEnter Degree: ");
        String degree = keyboard.nextLine();
        System.out.print("\tEnter Student number: ");
        int num = keyboard.nextInt();

        // Step 5 = Create a new Student object with first, last, degree and num and set into the people array at position
        Student s1 = new Student(first, last, degree, num);
        people[position] = s1;  // Place the Student object in the people array at the given position
    }

    public static void employeeHandler(Person[] people, int position) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\n\tEnter first name: ");
        String first = keyboard.nextLine();
        System.out.print("\tEnter Last name: ");
        String last = keyboard.nextLine();
        System.out.print("\tEnter Title: ");
        String title = keyboard.nextLine();
        System.out.print("\tEnter Employee salary: ");
        double sal = keyboard.nextDouble();

        // Step 5 = Create a new Employee object with first, last, title and sal and set into the people array at position
        Employee e1 = new Employee(first, last, title, sal);
        people[position] = e1;

    }

    public static String getChoice() {
        Scanner keyboard = new Scanner(System.in);
        boolean good = false;
        String output = "BAD";
        while(!good) {
            System.out.print("\nEnter a Student or Employee(s for student, e for employee)? ");
            String choice = keyboard.nextLine();
            if (checkInput(choice) && choice.equalsIgnoreCase("s")) {
                output = "s";
                good = true;
            } else if (checkInput(choice) && choice.equalsIgnoreCase("e")) {
                output = "e";
                good = true;
            } else {
                System.out.println("Please enter either e or s!");
            }
        }
        return output;
    }

    public static boolean checkInput(String user_input) {
        boolean good = false;
        if(user_input.equalsIgnoreCase("s")) {
            good = true;
        } else if (user_input.equalsIgnoreCase("e")) {
            good = true;
        }
        return good;
    }

    public static Person[] createPeople(int number) {
        return new Person[number];
    }

}