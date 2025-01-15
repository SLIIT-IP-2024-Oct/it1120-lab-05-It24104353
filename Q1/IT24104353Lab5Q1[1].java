import java.util.Scanner;
public class IT24104353Lab5Q1 { 
 public static void main(String[] args) {
 //Create a scanner object to read input
Scanner scanner = new Scanner(System.in);
//Declare variables
int num1;javac
int num2;
int num3;
int smallest, largest;
// Prompt the user to enter integers
System.out.println("Enter the first integer: ");
num1 = scanner.nextInt();

System.out.println("Enter the second integer: ");
num2 = scanner.nextInt();

System.out.println("Enter the third integer: ");
num3= scanner.nextInt();

//Assign smallest and largest to 'num1' initially
smallest = num1;
largest = num1;
// Compare 'num2' with smallest and largest
if (num2 < smallest){
smallest = num2;
}
if (num2 > largest){
largest = num2;
}
// Compare 'num3' with smallest and largest
if (num3 < smallest){
smallest = num3;
}
if (num3 > largest){
largest = num3;
}
//Display the results
System.out.println();
System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3);
System.out.println("The smallest number is: " + smallest);
System.out.println("The largest number is: " + largest);
      }
}



