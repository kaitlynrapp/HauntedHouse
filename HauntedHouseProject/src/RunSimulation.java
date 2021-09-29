import java.util.ArrayList;
import java.util.Scanner;

public class RunSimulation
	{
		static ArrayList<Character> myChar = new ArrayList<Character>();
		static ArrayList<Room> createRoom = new ArrayList<Room>();
		public static void main(String[] args)
			{
				myChar.add(new Character("Default", "Mini Vampire", 66, false));
				createRoom.add(new Room("Spawn Dark Room", "None", 0, false, false));
				createRoom.add(new Room("Hallway", "Clown", 10, false, false));
				createRoom.add(new Room("indoorGarden", "Granny", 10, true, false));
				createRoom.add(new Room("Library", "Skeleton", 10, true, false));
				createRoom.add(new Room("Basement", "The Nun", 99, true, false));
				createRoom.add(new Room("Kitchen", "Doll", 10, true, false));
				createRoom.add(new Room("Backyard", "ScareCrow", 0, true, true));
				
				createCharacter();
				
			}
		
		public static void createCharacter()
		{
			//set character name and intro
			Scanner userInput = new Scanner(System.in);
			System.out.println("Oh no! \nYou wake up in a dark room alone in a haunted house.\nNo idea how you got here.");
			 System.out.println("   _____\\_____");
			 System.out.println("  |'  __   __ ` | ");
			 System.out.println(" |   ( o` 'o )   |");
			 System.out.println(" |  .----_----,  |");
			 System.out.println("  |  `-------'  |");
			 System.out.println("   `----------'");
			System.out.println("Before you can try and get out- Give me your Character Name.");
			String userCharacter = userInput.nextLine(); 
			myChar.get(0).setName(userCharacter);
			
			//set side kick play choice
			System.out.println("You can choose from the following sidekicks: Dracula, Casper, Stephen, Ed");
			String userPower = userInput.nextLine(); 
			myChar.get(0).setSideKick(userPower);
			                              //System.out.println(myChar.get(0).getSideKick());
			if (userPower.equals("Dracula"))
				{
					System.out.println("You choose the Mini Vampire: Dracula.");
				}
			else if (userPower.equals("Casper"))
				{
					System.out.println("You choose the Mini Ghost: Casper.");
				}
			else if (userPower.equals("Stephen"))
				{
					System.out.println("You choose the Bat: Stephen.");
				}
			else if (userPower.equals("Ed"))
				{
					System.out.println("You choose the Mini Zombie: Ed");
				}
			else
				{
					System.out.println("That is not a choice");
				}
			
			//set user health using favorite number
			System.out.println("Tell me your favorite number between 1-100. I'll tell you what its for after.");
			int userHealth = userInput.nextInt(); 
			myChar.get(0).setFavoriteNum(userHealth);
			
			System.out.println("You have " + userHealth + " health starting off trying to escape the house. Good Luck!");
			
			//scary default = false
			System.out.println("You aren't scared quite yet. When seomthing scary happens you will see something scary!\n \n ");
			System.out.println("Alright " + myChar.get(0).getName() + ". Lets get you and " + myChar.get(0).getSideKick() + " started. You slowly get up off the floor and make your way to the door where you will randomly enter into any start room.\n There are dead ends, and you have to complete each challange against the spooky character you are put up against.  ");
		}
		
		
	}
