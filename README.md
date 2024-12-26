# Java-Programming-Language

## Java Notes

- You must have the javac compiler to compile .java files.
- You must install a Java runtime 
- JVM: All Java runtime packages install a Java Virtual Machine. All Java bytecode runs through the JVM.
- Java is a Typed Langauge which means the data types MUST be stated when creating a variable (this is different from Python)
	DATA TYPES: int, double, Boolean, float, char
- Java has different Methods
	METHODS: Access Modifiers: [public means available to all code, private means available to this code, protected means per package] Static: [per instance or class], Return type: [type of data returned], Name: [name of method], Parameters [data that can be passed in]. 


## SYNTAX: 

system.out.print() - no newline

system.out.println() - added newline

{} Code structures get grouped by braces

All code statements that are not code structures end with a semicolon (ex: int var1;)

// To comment out 

To take input: import java.util.Scanner, then print prompt using System.out.print(), then take user input using scanner, then designate scanner method by type (.nextint(), .nextLine(), .nextFloat()...
	1. import Scanner
	2. Scanner scanner = new Scanner(System.in); // create scanner instance
	3. Prompt with some type of string: System.out.print("Enter the file name: ");
	4. // Read the input as a string
        String fileName = scanner.nextLine();
	5. // NOW YOU DO NOT DO THIS SINCE THE LAST JAVA UPDATE: Close the scanner to avoid resource leaks: scanner.close(); --> NO
 
printf() from printing 
	%d for int, %f for float, %c for character, %x for hex
 
&& means AND
|| means OR

if() {} for the if single decision structure

if() {} else if {} else {} for multiple decision structure

while (i < 10) {i++;}

do {i++;} while (i<10) 

## JAVA IDEs:
- IntelliJ
- Eclipse
- BlueJ
- NetBeans 
- Virtual Studio 
