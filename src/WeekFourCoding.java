import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeekFourCoding {

	static Scanner scanner = new Scanner(System.in);
	static List<String> friends = new ArrayList<String>();
	public static void main(String[] args) {
		
		/* Create a new menu driven application using a List instead of an array. 
		 * The application should allow the user to manage a friends list.
		 * The application should have the following options:
		 * 1) Display All Friends
		 * 2) Add New Friend
		 * 3) Delete All Friends
		 * 4) Delete A Friend
		 */
		
		int choice = 0;
		
		while (choice != 5) {
			
			viewMenu();
			
			choice = getUserChoice();
			if (choice == 1) {
				displayAllFriends();
			} else if (choice == 2) {
				addNewFriend();
			} else if (choice == 3) {
				deleteAFriend();
			} else if (choice == 4) {
				deleteAllFriends();
			} else if (choice == 5) {
				System.out.println("See Ya!");
			} else {
				System.out.println("Please choose a valid option.");
			}
		}
	}

	public static void viewMenu() {
		System.out.println("1) Display All Friends");
		System.out.println("2) Add New Friend");
		System.out.println("3) Delete A Friend");
		System.out.println("4) Delete All Friends");
		System.out.println("5) Exit");
		System.out.println("________________________");
	}
	
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void displayAllFriends() {
		for (String friend : friends) {
			System.out.println(friend);
		}
	}
	
	public static void addNewFriend() {
		System.out.println("Enter a new friend:");
		String name = scanner.next();
		friends.add(name);
		System.out.println("Friend added: " + name);
	}
	
	public static void deleteAFriend( ) {
		System.out.println("Enter the index of the friend you want to delete:");
		int index = getUserChoice();
		if (index < friends.size()) {
		friends.remove(index);
		}
	}
	
	public static void deleteAllFriends() {
		friends.removeAll(friends);
		System.out.println("All freinds deleted.");
		}
	}

