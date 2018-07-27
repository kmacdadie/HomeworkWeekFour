import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class PartTwoOfTheResearch { 

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * In addition, include a line of code that shows how to instantiate each of 
		 * the following:
		 * ArrayList of type String
		 * HashSet of type StringBuilder
		 * HashMap of type String, String
		 */
		
		//ArrayList<String>();
		List<String> dogs = new ArrayList<String>();
		dogs.add("Labrador");
		dogs.add("Labradoodle");
		dogs.add("Golden Retriever");
		dogs.add("GoldenDoodle");
						
			for (String dog : dogs) {
				System.out.println(dog);
				}
		
		//HashSet<StringBuilder>();
		Set<StringBuilder> tools = new HashSet<StringBuilder>();	
		//tools.add("Wrench");
		//tools.add("Socket");
		//tools.add("Breaker Bar");
		//tools.add("Screw Driver");
				
		StringBuilder handTools = new StringBuilder("Snap-On");
		handTools.append(" Wrench");
		handTools.append(" Socket");
		handTools.append(" Breaker Bar");
		handTools.append(" Screw Driver");
		System.out.println(handTools.toString());
		
		//System.out.println(tools.size());
					
		//for (String tool : tools) {
			//System.out.println(tool);
			//}
	
		//HashMap<String,String>();
		Map<String, String>  emailAddress = new HashMap<String,String>();
		emailAddress.put("Keith", "kmacdadie@yahoo.com");
		emailAddress.put("Megan", "meberry2@gmail.com");
		emailAddress.put("Brantley", "littlebuckaroo@cox.net");
		emailAddress.put("Shelly Dog", "browndoodle@hotmail.com");
				
		Set<String> userKeys = emailAddress.keySet();
		for (String key : userKeys) {
			System.out.println(key + " : " + emailAddress.get(key));
		}
	}
}
