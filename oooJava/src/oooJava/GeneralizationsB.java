package oooJava;
import java.util.*;

public class GeneralizationsB {
	public static void main(String[] args) {

	String Name = System.getProperty("user.name");

	// Initializing a Dictionary 
	Dictionary oooJava = new Hashtable();
	// put() method 
	oooJava.put("1", "!"); 
	oooJava.put("2", "&&");
	oooJava.put("3", "||");
	
	boolean tricky = false;		
	if(tricky) {

			System.out.println("Stuck in the past...");

		}else {

			System.out.println("Upgraded to the future!");

		}
	
	Scanner inp = new Scanner(System.in);
	String priorityNumber;
	System.out.println(Name + ", which priority number of the Java Order of Operations would you like to learn about today?");
	priorityNumber = inp.nextLine();
	int wordnum = Integer.parseInt(priorityNumber);

		switch (wordnum){

			case 1 : System.out.println("The \"" + oooJava.get(priorityNumber) + "\" operator, meaning \"Not\".");
								break; 
			case 2 : System.out.println("The \"" + oooJava.get(priorityNumber) + "\" operator, meaning \"And\".");
								break;
			case 3 : System.out.println("The \"" + oooJava.get(priorityNumber) + "\" operator, meaning \"Or\".");
								break;
			default:
				System.out.println("I'm sorry, what?");
	
		}

	}
}