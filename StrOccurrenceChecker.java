package StrOccurrenceChecker;

import java.util.Scanner;

class StrOccurrenceChecker {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        header();

	        do {
	            
	            System.out.println("\n1. Character Occurrence Checker");
	            System.out.println("2. Exit");
	            System.out.print("\nEnter Number: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    counter();
	                    break;
	                case 2:
	                    displayProgrammer();
	                    System.exit(0);
	                    break;
	                default:
	                	System.out.println("Error. Please input number only from 1 - 2.\n");
	            }
	        } while (true);
	    }

	    public static void counter() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("\nEnter Sentence: ");
	        String charSet = sc.nextLine();
	        
	        System.out.print("Enter letter: ");
	        char tocheck = sc.next().charAt(0);
	        
	        charSet = charSet.toLowerCase();
	        int countoccur = 0;

	        for (int a = 0; a < charSet.length(); a++) {
	            if (charSet.charAt(a) == Character.toLowerCase(tocheck)) {
	                countoccur++;
	            }
	        }

	        System.out.println("The letter '" + tocheck + "' occurred " + countoccur + " time/s.\n");

	        
	        System.out.print("Do you want to continue? [Y/N]: ");
	        String continueChoice = sc.next().toLowerCase();
	        if (!continueChoice.equals("y")) {
	        	displayProgrammer();
	            System.exit(0);
	        }
	        
	    }

	    public static void header() {
	        System.out.println("\n\t(============ CHARACTER OCCURRENCE CHECKER ============)");
	        System.out.println("\t(====== Laboratory002 - String Manipulation  =========)");
	        System.out.println("\t-------------------------------------------------------\n");
	        System.out.println("Simply input your sentence and the target letter, and the program "
	                + "\nwill swiftly provide you with the accurate count of occurrences, allowing "
	                + "\nyou to gain valuable insights into your text.\n");
	    }

	    public static void displayProgrammer() {
	    	System.out.println("\n\t\t-----------> Program Terminated <--------------");
			System.out.println("# =========================================================================== #");		
			System.out.println("|                   2023 @ Sharon Grace T. Hangaan                            |");
			System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
			System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
			System.out.println("# =========================================================================== #");	
	        System.exit(0);
	    }

}
