package Challenge_340_FirstRecurringCharacter;

import java.util.Scanner;

public class Main {

	private static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {

		String input;
		String[] inputArray;
		
		System.out.println("Please put in some random characters with a atleast one recunning!");
		
		input= INPUT.next();
		
		inputArray= input.split("");
		
		loop: for(int i=0;i<inputArray.length;i++){
			for(int o=0;o<(inputArray.length);o++){
				
				if(inputArray[i].equals(inputArray[o]) && inputArray[i]!=inputArray[o]){
					System.out.println("The first recurring character from the input: "+inputArray[i]);
					System.out.println("First character on position: "+i);
					System.out.println("Second character on position: "+o);
					break loop;
				}
			}
		}
	}
}