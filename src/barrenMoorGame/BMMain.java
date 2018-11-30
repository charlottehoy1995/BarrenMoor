package barrenMoorGame;

import java.util.Random;
import java.util.Scanner;

public class BMMain {
	
	public static void main(String [] args) {
		
		Player();
		PlayersInput();
		
	}
		
	 public static String Player() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a username: ");
		String username = scanner.nextLine();
		scanner.close();
		System.out.println("Welcome to Barren Moor " + username + ". You have entered into the dreary depths of our"
				+ " swamp! Here, you will find murky mud filled streams that "
				+ "come up to your ankles, grey foggy clouds which make it "
				+ "harder to see and rocks that are completely covered in moss and slime");
		System.out.println("To navigate around the swap we have awarded you with "
				+ "a magical golden compass " + username + "!"
				+ " You will be able to use this to guide your way to the next feature is! Simply "
				+ "pick 'N' for north, 'S' for south, 'E' for east and 'W' for west. "
				+ "Good Luck!" + username);
		return username;	
		
	}
	
	public static String PlayersInput() {
		
		int comp;
		String player_move = "none";
		
		Random r = new Random();
		comp = r.nextInt(4) + 1;
		//System.out.println(comp);
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("The dial reads: " + comp);
		int comp = scanner.nextLine();
		scanner.close();
		return comp;*/
		
		
		int north = 1 ;
		int south = 2;
		int east = 3;
		int west = 4;
		 
		if (comp == 1) {
		 player_move = "north";
		}
		if(comp == 2) {
		 player_move = "south";
		}
		if(comp == 3) {
		 player_move = "east";
		}
		else {
			player_move = "west"; 
			
		
		System.out.println("The dial reads " + comp);
		
		}
		return player_move;

		System.out.println("");
	}
	


}
