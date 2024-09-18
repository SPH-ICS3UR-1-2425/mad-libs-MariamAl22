import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Mariam
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a month of the year");
		String monthOfyear = in.nextLine();
		System.out.println("Give me a special holiday "); 
		String person1 = in.nextLine(); 
		System.out.println("Give me a name");
		String person2 = in.nextLine();
		System.out.println("Name me a warm drink");
		String person4 = in.nextLine();
		System.out.println("Give me another name");
		String person3 = in.nextLine();
		System.out.println("Give me a decimal number");
		double num1 = in.nextDouble();
		in.nextLine();
		System.out.println("Give me a place"); 
		String person5 = in.nextLine();
		System.out.println("Name me an activity");
		String act1 = in.nextLine();
		System.out.println("Name me a movie");
		String movie1 = in.nextLine(); 
		System.out.println("Name me a comfy thing that keeps you warm");
		String person6 = in.nextLine();
		
		System.out.println("During "+monthOfyear+", "+person2+" and "+person3+ " spend their evening at a resturant and waste more than "+num1+" dollars, then go back "+person5+" and play "+act1+". After that, they put on their favorite movie, "+movie1+", and drink "+person4+" while snuggled in their "+person6+". All that during their favorite holiday, "+person1 ); 
		
		
	}

}
