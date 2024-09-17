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
		System.out.println("Give me another name");
		String person3 = in.nextLine();
		System.out.println("During "+monthOfyear+", "+person2+" and "+person3+ " love speanding their quality time during their favorite holiday," +person1 ); 
		
		
	}

}
