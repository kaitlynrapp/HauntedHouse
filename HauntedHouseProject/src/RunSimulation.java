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
				createRoom.add(new Room("Backyard", "Doll", 10, true, true));
				
				createCharacter();
				//startPlaying();
				//hallway();
				//indoorGarden();
				//Room.scared();
				//backyard();
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
			Room.intro();
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
					Room.dracula();
				}
			else if (userPower.equals("Casper"))
				{
					System.out.println("You choose the Mini Ghost: Casper.");
					Room.casper();
				}
			else if (userPower.equals("Stephen"))
				{
					System.out.println("You choose the Bat: Stephen.");
					Room.stephen();
				}
			else if (userPower.equals("Ed"))
				{
					System.out.println("You choose the Mini Zombie: Ed");
					Room.edCharacter();
				}
			else
				{
					System.out.println("That is not a choice");
				}
			
			//set user health using favorite number
			System.out.println("Tell me your favorite number between 1-50. I'll tell you what its for after.");
			int userHealth = userInput.nextInt(); 
			myChar.get(0).setFavoriteNum(userHealth);
			
			System.out.println("You have " + userHealth + " health starting off trying to escape the house. Good Luck!");
			
			//scary default = false
			System.out.println("You aren't scared quite yet. When something scary happens you will see something scary!\n \n ");
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
			//hallway challenge
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("You leave the room and walk into the hallway. Oh shoot! \nYou are confronted with a clown!!!!");
		System.out.println("Good thing you aren't scared of clowns.");
		System.out.println("The clown tells you a joke: WHAT ROOM DO GHOSTS AVOID?");
		String userAnswer = userInput1.nextLine(); 
		if (userAnswer.equals("THE LIVING ROOM"))
			{
				System.out.println("Congrats the clown lets you move on.\n");
			}
		else if (userAnswer.equals("the living room"))
		{
			System.out.println("Congrats the clown lets you move on.\n");
		}
		else
			{
		System.out.println("THE LIVING ROOM! Unfortuantly you loose 10 points in health.");
		myChar.get(0).setFavoriteNum(myChar.get(0).getFavoriteNum()-10);
		System.out.println("Your health is now: " + myChar.get(0).getFavoriteNum());
			}
		//check if move on
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
			System.out.println("You open a door at the end of the hallway and you look up to glass \ncielings. You are in a creepy dark indoor garden.");
			System.out.println("Ahhh! A Giant Spider drops from the cieling and scares you! \nPress enter.");
			String userScaredNow = userInput2.nextLine(); 
			Room.scared();
			if (myChar.get(0).getSideKick().equals("Dracula"))
				{
					System.out.println("Luckily you chose " + myChar.get(0).getSideKick() + " the mini vampire as a sidekick. \nHe sneaks up behind him and bites the spider to kill him. Phew.");
					Room.dracula();
					System.out.println("Your health is still: " + myChar.get(0).getFavoriteNum());
				}
			else if (myChar.get(0).getSideKick().equals("Ed"))
				{
					System.out.println("Unfortunatley you chose " + myChar.get(0).getSideKick() + " as a sidekick. He is useless against the spider. You get attacked and loose 10 points in health.");
					Room.edCharacter();
					myChar.get(0).setFavoriteNum(myChar.get(0).getFavoriteNum()-10);
					System.out.println("Your health is now: " + myChar.get(0).getFavoriteNum());
				}
			else if (myChar.get(0).getSideKick().equals("Casper"))
				{
					System.out.println("Unfortunatley you chose " + myChar.get(0).getSideKick() + " as a sidekick. He is too friendly and useless against the spider.");
					Room.casper();
					myChar.get(0).setFavoriteNum(myChar.get(0).getFavoriteNum()-10);
					System.out.println("Your health is now: " + myChar.get(0).getFavoriteNum());
				}
			else if (myChar.get(0).getSideKick().equals("Stephen"))
				{
					System.out.println("Luckily you chose " + myChar.get(0).getSideKick() + " the bat as a sidekick. \nHe flies around and flusters the spider. Now the spider is wrapped in its own web and can't get to you.\nPhew.");
					Room.stephen();
					System.out.println("Your health is still: " + myChar.get(0).getFavoriteNum());
				}
			//check if move on
			if (myChar.get(0).getFavoriteNum() > 0)
				{
					if (createRoom.get(1).isExit() == false)
						{
							System.out.println("\nYou move onto the next room: " + createRoom.get(2).getNameRoom());
							basement();
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
		
		public static void basement()
		{
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("You accidently took a door and fell down the stairs. As you get up, you see in the dark corner a nun. \n ");
			System.out.println("Oh no, the nun is very scary!! \nPress enter.");
			String userScaredAgain = userInput3.nextLine(); 
			Room.scared();	
			System.out.println("There is a bat on the ground in front of you. You pick it up. \nWould you like to swing (1) left or (2) right at the nun?");
			int userSwing = userInput3.nextInt(); 
			if (userSwing == 1)
				{
					System.out.println("You chose wrong. The nun dodges you and knocks you out losing 99 health!");
					myChar.get(0).setFavoriteNum(myChar.get(0).getFavoriteNum()-99);
					System.out.println("Your health is now: " + myChar.get(0).getFavoriteNum());
				}
				
			else if (userSwing == 2)
				{
					System.out.println("Good job you knocked out the nun! You escape and run out of the basement.");
					System.out.println("Your health is still: " + myChar.get(0).getFavoriteNum());
				}
			else
				{
					System.out.println("That is not an option");
				}
			//check if move on
			if (myChar.get(0).getFavoriteNum() > 0)
				{
					if (createRoom.get(2).isExit() == false)
						{
							System.out.println("You move onto the next room: " + createRoom.get(3).getNameRoom());
							backyard();
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
		
		public static void backyard()
		{
			Scanner userInput4 = new Scanner(System.in);
			System.out.println("You found the door to the backyard. Oh no, there is a doll sitting on the swing. ");
			System.out.println("You grew up playing with dolls so you arent scared this time. \nLets play some hide and seek. \nChoose to hide behind: \n(1) statue \n(2) cornstalk \n(3) scarecrow");
			int userHidingSpot = userInput4.nextInt(); 
			
			if(userHidingSpot == 1)
				{
					System.out.println("You passed the nun.");
				}
			else if(userHidingSpot == 2)
				{
					System.out.println("You chose wrong. The doll sees you clearly behind the cornstalk and attacks you! You loose 10 health.");
					myChar.get(0).setFavoriteNum(myChar.get(0).getFavoriteNum()-10);
					System.out.println("Your health is now: " + myChar.get(0).getFavoriteNum());
				}
			else if(userHidingSpot == 3)
				{
					System.out.println("You chose wrong. The doll went over to the scarecrow thinking it was her friend and attacks you. You loose 10 health.");
					myChar.get(0).setFavoriteNum(myChar.get(0).getFavoriteNum()-10);
					System.out.println("Your health is now: " + myChar.get(0).getFavoriteNum());
				}
			else
				{
					System.out.println("That isn't an option.");
				}
			//check if finish
			if (myChar.get(0).getFavoriteNum() > 0)
				{
					System.out.println("Well done you escaped the haunted house " + myChar.get(0).getName() + ". You and " + myChar.get(0).getSideKick() + " finished with " + myChar.get(0).getFavoriteNum() + " health. I'll see you next time player..." );
				}
			else
					{
					createRoom.get(0).setExit(true);
					System.out.println("You died and didn't make it out!!");
					}
		}
	}
		
	
