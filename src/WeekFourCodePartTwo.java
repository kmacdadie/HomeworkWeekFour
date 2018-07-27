import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WeekFourCodePartTwo {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	/* In a different class, create an ArrayList, HashSet, and HashMap.
	 * Add at least three entries to each collection.
	 * Iterate over each collection and print out the contents.
	 */
		List<String> trucks = new ArrayList<String>();
		trucks.add("Ford Raptor");
		trucks.add("Ford F150");
		trucks.add("Ford F250");
		trucks.add("Ford F350");
				
			for (String ford : trucks) {
			System.out.println(ford);
		}
			
		Set<String> fordCars = new HashSet<String>();
		fordCars.add("Mustang");
		fordCars.add("Focus");
		fordCars.add("Escort");
		fordCars.add("Fusion");
			
		System.out.println(fordCars.size());
		
		for (String cars : fordCars) {
			System.out.println(cars);
		}
	
		Map<Integer, String>  monsterJamWinners = new HashMap<Integer,String>();
		monsterJamWinners.put(1, "Grave Digger");
		monsterJamWinners.put(2, "Bro Dozer");
		monsterJamWinners.put(3, "Gas Monkey Garage");
		monsterJamWinners.put(4, "Blue Thunder");
		
		System.out.println(monsterJamWinners.get(3));	
		
		Set<Integer> racerKeys = monsterJamWinners.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + monsterJamWinners.get(key));
			
		}
		
	}
}			