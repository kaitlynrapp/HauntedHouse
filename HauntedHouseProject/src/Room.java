
public class Room
	{
		private String nameRoom;
		private String evilCharacter;
		private int damage;
		private boolean isScaryRoom;
		private boolean exit;
		
		public String getNameRoom()
			{
				return nameRoom;
			}
		public void setNameRoom(String nameRoom)
			{
				this.nameRoom = nameRoom;
			}
		public String getEvilCharacter()
			{
				return evilCharacter;
			}
		public void setEvilCharacter(String evilCharacter)
			{
				this.evilCharacter = evilCharacter;
			}
		public int getDamage()
			{
				return damage;
			}
		public void setDamage(int damage)
			{
				this.damage = damage;
			}
		public boolean isScaryRoom()
			{
				return isScaryRoom;
			}
		public void setScaryRoom(boolean isScaryRoom)
			{
				this.isScaryRoom = isScaryRoom;
			}
		public boolean isExit()
			{
				return exit;
			}
		public void setExit(boolean exit)
			{
				this.exit = exit;
			}
		public Room(String nR, String eC, int d, boolean iSR, boolean e)
			{
				nameRoom = nR;
				evilCharacter = eC;
				damage = d;
				isScaryRoom = iSR;
				exit = e;
			}
		public static void scared()
		{
System.out.println("            .--,");
System.out.println("           /  (");
System.out.println("          /    \\");
System.out.println("         /      \\");
System.out.println("        /  0  0  \\          BOO!!");
System.out.println("((()   |    ()    |   ()))");
System.out.println("\\  ()  (  .____.  )  ()  /");
System.out.println(" |` \\_/ \\  ` `  / \\_/ `|");
System.out.println(" |       `.'--'.`       |");
System.out.println("  \\        `  `        /");
System.out.println("   \\                  /");
System.out.println("    `.              .'    ,");
System.out.println("     |`             |  _.'|");
System.out.println("     |              `-'  /");
System.out.println("     \\                 .'");
System.out.println("     `.____________.-'");
		}
		
		public static void stephen()
		{
System.out.println("            \\--/");
System.out.println("         /`-'  '-`\\");
System.out.println("        /          \\");
System.out.println("       /.'|/\\  /\\|'.\\");
System.out.println("             \\/");
		}
		
		public static void casper()
		{
System.out.println("	 .-.");
System.out.println("	(o o) ");
System.out.println("	| O \\");
System.out.println("	 \\   \\");
System.out.println("	  `~~~'");
		}
		
		public static void dracula()
		{
		System.out.println("	(㇏(•̀ᵥᵥ•́)ノ)");
		}
		
		public static void edCharacter()
		{
System.out.println("            ..... ");           
System.out.println("           C C  / ");           
System.out.println("          /<   /  ");           
System.out.println(" ___ __________/_#__=o ");            
System.out.println("/(- /(\\_\\________   \\  ");            
System.out.println("\\ ) \\ )_      \\o     \\ ");            
System.out.println("/|\\ /|\\       |'     | ");            
System.out.println("        |     _|      ");       
System.out.println("        /o   __\\       ");      
System.out.println("       / '     |        ");     
System.out.println("     / /      |       ");      
System.out.println("     /_/\\______|      ");       
System.out.println("    (   _(    <          ");    
System.out.println("     \\    \\    \\            "); 
System.out.println("      \\    \\    |            ");
System.out.println("       \\____\\____\\           ");
System.out.println("       ____\\_\\__\\_\\          ");
System.out.println("     /`   /`     o\\          ");
System.out.println("     |___ |_______|	");
		}
		public static void intro()
		{
			 System.out.println("   _____\\_____");
			 System.out.println("  |'  __   __ `| ");
			 System.out.println(" |   ( o` 'o )  |");
			 System.out.println(" |  .----_----, |");
			 System.out.println("  |  `-------' |");
			 System.out.println("   `----------'");
		}
	}
