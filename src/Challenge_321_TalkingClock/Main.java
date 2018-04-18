package Challenge_321_TalkingClock;

import java.util.Scanner;

public class Main {

	private static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] hours= {"twelve","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
		String[] tenNineteen= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens= {"ten","twenty","thirty","fourty","fifty"};
		String[] amPm= {"am","pm"};
		
		System.out.println("Please put in a time in the formate: hh:mm");
		String input= INPUT.next();
		String[] inputArray= input.split(":");
		
		String first="";
		String second="";
		String amOrPm=" am";
		if(Integer.parseInt(inputArray[0])<=12){
			first= hours[Integer.parseInt(inputArray[0])];
		}else
			if(Integer.parseInt(inputArray[0])>=13){
				first= hours[Integer.parseInt(inputArray[0])-12];
			}
		
		String[] split=inputArray[1].split("");
		
		if(Integer.parseInt(inputArray[1])<=9){
			second= "oh "+hours[Integer.parseInt(split[1])];			
		}else
			if(Integer.parseInt(inputArray[1])<=19){
				second= tenNineteen[Integer.parseInt(split[1])-10];
			}else
				if(Integer.parseInt(inputArray[1])<=59){
					
					second= tens[Integer.parseInt(split[0])-1];
					
					if(Integer.parseInt(split[1])==0){
						
					}else
							if(Integer.parseInt(split[0])!=0)
								second= second+" "+hours[Integer.parseInt(split[1])];
					}
		
		if(Integer.parseInt(inputArray[0])>=12){
			amOrPm= " pm";
		}
		if(Integer.parseInt(inputArray[1])==0)
			System.out.println("It's "+first+amOrPm);
		else
			System.out.println("It's "+first+" "+second+amOrPm);
	}
}