package barrenMoorGame;

import java.util.Scanner;

public class Player {
	
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a username: ");
		 String username = scanner.nextLine();
		 scanner.close();
		 System.out.println("Welcome to Barren Moor " + username);
		 return username;

}
