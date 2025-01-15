import java.util.Scanner;

public class IT24104353Lab5Q2 {
	
	public static void main (String[] args) {
		
		// Declare the variables
		int numMembers;
		
		// Create a Scanner object to read input
		Scanner scanner = new Scanner(System.in);
		
		    // Prompt user for input
			System.out.print("Enter the number of new members introduced: ");
			numMembers = scanner.nextInt();
			
			// Determine the prize on the number of new members
			switch (numMembers) {
				
				case 0:
			System.out.println();
			System.out.println("No prize");
			
			       break;
				   
				case 1:
			System.out.println();
            System.out.println("Prize is a : Pen");

                    break;

                case 2:
            System.out.println();
            System.out.println("prize is a : umbrella");

                    break;
           
                case 3:
            System.out.println();
            System.out.println("prize is a bag");

                    break;

                case 4:
            System.out.println();
            System.out.println("prize is a : Travelling Chair");

                    break;

                default:
                    if (numMembers >= 5){
                System.out.println();
                System.out.println("prize is a : Headphone");
					}
            else {
                // Invalid input (Negative Number)
                            System.out.println("Input must be a number 0or greater");
			}

                    break;
            }
	}
}
