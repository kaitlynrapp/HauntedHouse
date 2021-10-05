import java.util.ArrayList;
import java.util.Scanner;

public class RunSimulation
	{
		static ArrayList<Character> myChar = new ArrayList<Character>();
		static ArrayList<Room> createRoom = new ArrayList<Room>();
		public static void main(String[] args)
			{
				myChar.add(new Character("Default", "Mini Vampire", 66, false));
				createRoom.add(new Room("Hallway", "Clown", 10, false, false));
				createRoom.add(new Room("Indoor Garden", "Giant Spider", 10, true, false));
				createRoom.add(new Room("Basement", "The Nun", 99, true, false));
				createRoom.add(new Room("Kitchen", "Doll", 10, true, false));
				createRoom.add(new Room("Backyard", "ScareCrow", 0, true, true));
				
				//createCharacter();
				//startPlaying();
				//hallway();
				indoorGarden();
				//Room.scared();
			}
		
		public static void startPlaying()
			{
				hallway();
			}
		
		public static void createCharacter()
		{
			//set character name and introduction
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
			System.out.println("Alright " + myChar.get(0).getName() + ". Lets get you and " + myChar.get(0).getSideKick() + " started.\n \nYou slowly get up off the floor and make your way to the door where \nyour only goal is to escape the house. \nYou have to complete each challange against the spooky character you are put up against.");
			System.out.println("Ready to begin?");
			System.out.println("(1) Yes \n(2) No");
			int userStart = userInput.nextInt(); 
			if (userStart == 1)
				{
					startPlaying();
				}
			else 
				{
					createRoom.get(0).setExit(true);
					System.out.println("You died and didn't make it out!!");
				}
		
		}
		
		
		public static void hallway()
		{
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("You leave the room and walk into the hallway. Oh shoot! \nYou are confronted with a clown!!!!");
		System.out.println("Good thing you aren't scared of clowns.");
		System.out.println("The clown tells you a joke: WHAT ROOM DO GHOSTS AVOID?");
		String userAnswer = userInput1.nextLine(); 
		if (userAnswer.equals("The living room."))
			{
				System.out.println("Congrats the clown lets you move on.");
			}
		else
			{
		System.out.println("THE LIVING ROOM! Unfortuantly you loose 10 points in health.");
		myChar.get(0).setFavoriteNum(myChar.get(0).getFavoriteNum()-10);
		System.out.println("Your health is now: " + myChar.get(0).getFavoriteNum());
			}
		
		if (myChar.get(0).getFavoriteNum() > 0)
			{
				if (createRoom.get(0).isExit() == false)
					{
						System.out.println("You move onto the next room: " + createRoom.get(1).getNameRoom());
						indoorGarden();
					}
				else
					{
						System.out.println("You died and didn't make it out!!");
					}
			}
		else
				{
				createRoom.get(0).setExit(true);
				System.out.println("You died and didn't make it out!!");
				}
			}
		
		
		public static void indoorGarden()
		{
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("You open a door at the end of the hallway and you you look up to glass \ncielings and a creepy dark indoor garden.");
			System.out.println("Ahhh! A Giant Spider drops from the cieling and scares you! \nPress enter.");
			String userScaredNow = userInput2.nextLine(); 
			Room.scared();
			if (myChar.get(0).getSideKick().equals("Dracula"))
				{
					System.out.println("Luckily you chose " + myChar.get(0).getSideKick() + " the mini vampire as a sidekick. \nHe sneaks up behind him and bites the spider to kill him. Phew.");
					System.out.println("Your health is still: " + myChar.get(0).getFavoriteNum());
				}
			else if (myChar.get(0).getSideKick().equals("Ed"))
				{
					System.out.println("Unfortunatley you chose " + myChar.get(0).getSideKick() + " as a sidekick. He is useless against the spider. You get attacked and loose 10 points in health.");
				}
			else if (myChar.get(0).getSideKick().equals("Casper"))
				{
					System.out.println("Hi");
				}
			else if (myChar.get(0).getSideKick().equals("Stephen"))
				{
					System.out.println("Luckily you chose " + myChar.get(0).getSideKick() + " the bat as a sidekick. \nHe flies around and flusters the spider. Now the spider is wrapped in its own web and can't get to you.\nPhew.");
					System.out.println("Your health is still: " + myChar.get(0).getFavoriteNum());
				}
						
		}
	}
		
	
