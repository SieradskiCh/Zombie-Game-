import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ZombieSurvival extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name;
	static int humansKilled = 0;
	static int zombieBearBeat = 0;
	static int className;
	static int gun = 0;
	static int zombieBeat = 0;
	static int bearBeat = 0;
	static int wildNight = 0;
	static int wildStick = 0;
	static int seaStormCounter = 0;
	static int fishCaught = 0;
	static int sharkSurvived = 0;
	static JFrame frame = new JFrame();

	public static void main(String[] args)
	    {
		name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(frame, "Hi, " + name);
		
		Object[] options = {"Survivor", "Zombie", "Average Joe"};
		className = JOptionPane.showOptionDialog(frame, "It's the apocalypse. What do you want to start as?",
				"Set up",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[2]);
		pathAssign();
	    }
	public static void pathAssign()
		{
			switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "Well well well. You made it this far! Now off to a lifetime of pain and struggle!!!");
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "Zombies are pretty chill. Have fun eating brains and whatnot.");
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "Average Joes don't survive the zombie apocalypse. You're a zombie.");
				break;
				}
			}
		if (className == 0)
			{
			final String[] genre = { "Big City", "Small Town", "Wilderness", "Ocean" };
				{
				final JFrame frame = new JFrame();
				String adventure = (String) JOptionPane.showInputDialog(frame, 
				"So, Mr. Bigshot Survivor, where do you want to go?",
				"Headed out",
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				genre, 
				genre[0]);
				if (adventure.equals("Big City"))
					{
					JOptionPane.showMessageDialog(frame, "Psh...good luck surviving zombie-ville. I'll be sure to send some flowers to your funeral.");
					survivorCity();
					}
				else if (adventure.equals("Small Town"))
					{
					JOptionPane.showMessageDialog(frame, "Not a bad choice...you might survive a day or too.");
					survivorTown();
					}
				else if (adventure.equals("Wilderness"))
					{
					JOptionPane.showMessageDialog(frame, "Well there won't be many zombies to worry about...just EVERYTHING ELSE!!!");
					survivorWild();
					}
				else if (adventure.equals("Ocean"))
					{
					JOptionPane.showMessageDialog(frame, "I mean...you'll be on a boat...surrounded by water.......yay?");
					survivorSea();
					}
				}
			}
		else if (className == 1 || className == 2)
			{
			final String[] genre = { "Big City", "Small Town", "Wilderness", };
				{
				final JFrame frame = new JFrame();
				String adventure = (String) JOptionPane.showInputDialog(frame, 
				"So, you mindless brain-eating buffoon, where do you want to wander next?",
				"Zombie wandering",
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				genre, 
				genre[0]);
				if (adventure.equals("Big City"))
					{
					JOptionPane.showMessageDialog(frame, "A social zombie eh?");
					zombieCity();
					}
				else if (adventure.equals("Small Town"))
					{
					JOptionPane.showMessageDialog(frame, "Ah that small town life. Good people, good views, and really really good brains!");
					zombieTown();
					}
				else if (adventure.equals("Wilderness"))
					{
					JOptionPane.showMessageDialog(frame, "Because you're a zombie. You do what you want.");
					zombieWild();
					}
				}
			}
	    }
	public static void survivorCity()
		{
		int path = (int)(Math.random()* 100);
		if (path >= 0 && path < 10)
			{
			survivorCityShelter();
			}
		else if (path >= 10 && path < 35)
			{
			survivorCityFood();
			}
		else if (path >= 35 && path < 60)
			{
			survivorCityWeapons();
			}
		else if (path >= 60 && path <= 100)
			{
			survivorCityZombie();
			}
		}
	public static void survivorCityShelter()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "That looks like a good place to spend the night! Go inside?",
				"Shelter",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 0)
			{
			wildNight = wildNight + 1;
			if (zombieBeat > 5)
				{
				int chance = (int)(Math.random()* 100);
				if (chance > 97 && chance <= 100)
					{
					JOptionPane.showMessageDialog(frame, "Hmm...it looks like this shelter will last a while. Guess you beat the game! You survived " + wildNight + " nights and beat " + zombieBeat + " zombies. You also found " + gun + " guns.");
					System.exit(0);
					}
				else 
					{
					JOptionPane.showMessageDialog(frame, "Guess you're not completely stupid. You've survived " + wildNight + " nights.");
					survivorCity();
					}
				}
			else 
				{
				JOptionPane.showMessageDialog(frame, "Guess you're not completely stupid. You've survived " + wildNight + " nights.");
				survivorCity();
				}
			}
		else if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "........why?");
			survivorCity();
			}
		}
	public static void survivorCityFood()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "An old grocery store. Go inside?",
				"Wow",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 0)
			{
			int choice = (int)(Math.random()* 100);	
			if (choice >= 0 && choice <=50)
				{
				JOptionPane.showMessageDialog(frame, "Oh lordie! There be zombies in here!");
				survivorCityZombie();
				}
			else 
				{
				JOptionPane.showMessageDialog(frame, "Looks like there's nothing here...");
				survivorCity();
				}
			}
		else 
			{
			JOptionPane.showMessageDialog(frame, "Movin on!");
			survivorCity();
			}
		}
	public static void survivorCityWeapons()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "An old sporting goods store. Go inside?",
				"Chance for Weapon",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 0)
			{
			int choice = (int)(Math.random()* 100);	
			if (choice >= 0 && choice <= 20)
				{
				JOptionPane.showMessageDialog(frame, "Oh lordie! There be zombies in here!");
				survivorCityZombie();
				}
			else if (choice > 20 && choice <= 40)
				{
				gun = gun + 1;
				JOptionPane.showMessageDialog(frame, "A gun! That'll help calm some zombies!");
				}
			else 
				{
				JOptionPane.showMessageDialog(frame, "Looks like there's nothing here...");
				survivorCity();
				}
			}
		else 
			{
			JOptionPane.showMessageDialog(frame, "Hey man it's your life. Your short and miserable life...");
			survivorCity();
			}
		}
	public static void survivorCityZombie()
		{
		JOptionPane.showMessageDialog(frame, "A zombie! Fight for your life man!!!");
		int attack = (int)(Math.random()* 100);
		if (gun > 0)
			{
			if (attack >= 0 && attack < 81)
				{
				zombieBeat = zombieBeat + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the zombie with your will and your .45. That's " + zombieBeat + " attacks survived.");
				survivorCity();
				}
			else if (attack >= 81 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've beaten " + zombieBeat + " zombies, found " + gun + " guns, and survived " + wildNight + " nights.");
				survivorDeath();
				}
			}
		else 
			{
			if (attack >= 0 && attack < 41)
				{
				zombieBeat = zombieBeat + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the zombie with your will and your bare hands. That's " + zombieBeat + " attacks survived.");
				survivorCity();
				}
			else if (attack >= 41 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've beaten " + zombieBeat + " zombies, found " + gun + " guns, and survived " + wildNight + " nights.");
				survivorDeath();
				}	
			}
		}
	public static void survivorTown()
		{
		int path = (int)(Math.random()* 100);
		if (path >= 0 && path < 25)
			{
			survivorTownShelter();
			}
		else if (path >= 25 && path < 50)
			{
			survivorTownFood();
			}
		else if (path >= 50 && path < 70)
			{
			survivorTownWeapons();
			}
		else if (path >= 70 && path <= 100)
			{
			survivorTownZombie();
			}
		}
	public static void survivorTownShelter()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "That looks like a good place to spend the night! Go inside?",
				"Shelter",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 0)
			{
			wildNight = wildNight + 1;
			if (zombieBeat > 5)
				{
				int chance = (int)(Math.random()* 100);
				if (chance > 97 && chance <= 100)
					{
					JOptionPane.showMessageDialog(frame, "Hmm...it looks like this shelter will last a while. Guess you beat the game! You survived " + wildNight + " nights and beat " + zombieBeat + " zombies. You also found " + gun + " guns.");
					System.exit(0);
					}
				else 
					{
					JOptionPane.showMessageDialog(frame, "Guess you're not completely stupid. You've survived " + wildNight + " nights.");
					survivorTown();
					}
				}
			else 
				{
				JOptionPane.showMessageDialog(frame, "Guess you're not completely stupid. You've survived " + wildNight + " nights.");
				survivorTown();
				}
			}
		else if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "........why?");
			survivorTown();
			}
		}
	public static void survivorTownFood()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "An old grocery store. Go inside?",
				"Wow",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 0)
			{
			int choice = (int)(Math.random()* 100);	
			if (choice >= 0 && choice <=50)
				{
				JOptionPane.showMessageDialog(frame, "Oh lordie! There be zombies in here!");
				survivorTownZombie();
				}
			else 
				{
				JOptionPane.showMessageDialog(frame, "Looks like there's nothing here...");
				survivorTown();
				}
			}
		else 
			{
			JOptionPane.showMessageDialog(frame, "Movin on!");
			survivorTown();
			}
		}
	public static void survivorTownWeapons()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "An old sporting goods store. Go inside?",
				"Chance for Weapon",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 0)
			{
			int choice = (int)(Math.random()* 100);	
			if (choice >= 0 && choice <= 20)
				{
				JOptionPane.showMessageDialog(frame, "Oh lordie! There be zombies in here!");
				survivorTownZombie();
				}
			else if (choice > 20 && choice <= 40)
				{
				gun = gun + 1;
				JOptionPane.showMessageDialog(frame, "A gun! That'll help calm some zombies!");
				}
			else 
				{
				JOptionPane.showMessageDialog(frame, "Looks like there's nothing here...");
				survivorTown();
				}
			}
		else 
			{
			JOptionPane.showMessageDialog(frame, "Hey man it's your life. Your short and miserable life...");
			survivorTown();
			}
		}
	public static void survivorTownZombie()
		{
		JOptionPane.showMessageDialog(frame, "A zombie! Fight for your life man!!!");
		int attack = (int)(Math.random()* 100);
		if (gun > 0)
			{
			if (attack >= 0 && attack < 81)
				{
				zombieBeat = zombieBeat + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the zombie with your will and your .45. That's " + zombieBeat + " attacks survived.");
				survivorTown();
				}
			else if (attack >= 81 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've beaten " + zombieBeat + " zombies, found " + gun + " guns, and survived " + wildNight + " nights.");
				survivorDeath();
				}
			}
		else 
			{
			if (attack >= 0 && attack < 41)
				{
				zombieBeat = zombieBeat + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the zombie with your will and your bare hands. That's " + zombieBeat + " attacks survived.");
				survivorTown();
				}
			else if (attack >= 41 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've beaten " + zombieBeat + " zombies, found " + gun + " guns, and survived " + wildNight + " nights.");
				survivorDeath();
				}	
			}
		}
	public static void survivorWild()
		{
		int path = (int)(Math.random()* 100);
		if (path >= 0 && path < 5)
			{
			survivorWildShelter();
			}
		else if (path >= 5 && path < 15)
			{
			survivorWildZombie();
			}
		else if (path >= 15 && path < 45)
			{
			survivorWildWeapons();
			}
		else if (path >= 45 && path <= 100)
			{
			survivorWildAttack();
			}
		}
	public static void survivorWildShelter()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "That looks like a good place to spend the night! Go inside?",
				"Shelter",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 0)
			{
			wildNight = wildNight + 1;
			if (zombieBeat > 5 || bearBeat > 7)
				{
				int chance = (int)(Math.random()* 100);
				if (chance > 97 && chance <= 100)
					{
					JOptionPane.showMessageDialog(frame, "Hmm...it looks like this shelter will last a while. Guess you beat the game! You survived " + wildNight + " nights, beat " + zombieBeat + " zombies and " + bearBeat + " bears.");
					System.exit(0);
					}
				else 
					{
					JOptionPane.showMessageDialog(frame, "Guess you're not completely stupid. You've survived " + wildNight + " nights.");
					survivorWild();
					}
				}
			else 
				{
				JOptionPane.showMessageDialog(frame, "Guess you're not completely stupid. You've survived " + wildNight + " nights.");
				survivorWild();
				}
			}
		else if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "........why?");
			survivorWild();
			}
		}
	public static void survivorWildZombie()
		{
		JOptionPane.showMessageDialog(frame, "A zombie?! In the middle of nowhere???");
		int attack = (int)(Math.random()* 100);
		if (wildStick > 0)
			{
			if (attack >= 0 && attack < 61)
				{
				zombieBeat = zombieBeat + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the zombie with your will and your sharp stick. That's " + zombieBeat + " attacks survived.");
				survivorWild();
				}
			else if (attack >= 61 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've beaten " + zombieBeat + " zombies, " + bearBeat + " bears, made " + wildStick + " pointy sticks, and survived " + wildNight + " nights.");
				survivorDeath();
				}
			}
		else 
			{
			if (attack >= 0 && attack < 41)
				{
				zombieBeat = zombieBeat + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the zombie with your will and your bare hands. That's " + zombieBeat + " attacks survived.");
				survivorWild();
				}
			else if (attack >= 41 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've beaten " + zombieBeat + " zombies, " + bearBeat + " bears, made " + wildStick + " pointy sticks, and survived " + wildNight + " nights.");
				survivorDeath();
				}	
			}
		}
	public static void survivorWildWeapons()
		{
		wildStick = wildStick + 1;
		JOptionPane.showMessageDialog(frame, "You had some time on your hands, so you made a weapon. You've crafted " + wildStick + " sharp sticks.");
		survivorWild();
		}
	public static void survivorWildAttack()
		{
		JOptionPane.showMessageDialog(frame, "Oh God! It's a bear attack!");
		int attack = (int)(Math.random()* 100);
		if (wildStick > 0)
			{
			if (attack >= 0 && attack < 61)
				{
				bearBeat = bearBeat + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the bear with the power of your will and your pointy stick. That's " + bearBeat + " attacks survived.");
				survivorWild();
				}
			else if (attack >= 61 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've beaten " + zombieBeat + " zombies, " + bearBeat + " bears, made " + wildStick + " pointy sticks, and survived " + wildNight + " nights.");
				survivorDeath();
				}
			}
		else 
			{
			if (attack >= 0 && attack < 41)
				{
				zombieBeat = zombieBeat + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the bear with your will and your bare hands. That's " + zombieBeat + " attacks survived.");
				survivorWild();
				}
			else if (attack >= 41 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've beaten " + zombieBeat + " zombies, " + bearBeat + " bears, made " + wildStick + " pointy sticks, and survived " + wildNight + " nights.");
				survivorDeath();
				}	
			}
		}
	public static void survivorSea()
		{
		int path = (int)(Math.random()* 100);
		if (path >= 0 && path < 25)
			{
			survivorSeaSharkAttack();
			}
		else if (path >= 25 && path < 75)
			{
			survivorSeaFishing();
			}
		else if (path >= 75 && path <= 99)
			{
			survivorSeaStorm();
			}
		else if (path == 100)
			{
			survivorIslandEnd();
			}
		}
	public static void survivorSeaSharkAttack()
		{
		JOptionPane.showMessageDialog(frame, "It's like 3-D Jaws!");
		int attack = (int)(Math.random()* 100);
		if (fishCaught > 4)
			{
			if (attack >= 0 && attack < 61)
				{
				sharkSurvived = sharkSurvived + 1;
				fishCaught = fishCaught + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the shark with your bare hands, fueled by fish protien. That's " + sharkSurvived + " attacks survived and " + fishCaught + " fish caught.");
				survivorSea();
				}
			else if (attack >= 61 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've survived " + seaStormCounter + " storms, " + sharkSurvived + " shark attacks and you caught " + fishCaught + " fish.");
				survivorDeath();
				}
			}
		else 
			{
			if (attack >= 0 && attack < 41)
				{
				sharkSurvived = sharkSurvived + 1;
				fishCaught = fishCaught + 1;
				JOptionPane.showMessageDialog(frame, "In an epic battle, you defeat the shark with your bare hands, fueled by fish protien. That's " + sharkSurvived + " attacks survived and " + fishCaught + " fish caught.");
				survivorSea();
				}
			else if (attack >= 41 && attack <= 100)
				{
				JOptionPane.showMessageDialog(frame, "You died. You've survived " + seaStormCounter + " storms, " + sharkSurvived + " shark attacks and you caught " + fishCaught + " fish.");
				survivorDeath();
				}
			}
		}
	public static void survivorSeaFishing()
		{
		JOptionPane.showMessageDialog(frame, "Hours on end holding a pole? Sounds fun!");
		int fish = (int)(Math.random()* 100);
		if (fish >= 0 && fish < 33)
			{
			fishCaught = fishCaught + 1;
			JOptionPane.showMessageDialog(frame, "You lucky son of a gun...looks like you reeled one in. That's a total of " + fishCaught + " figh caught.");
			survivorSea();
			}
		else if (fish >= 33 && fish < 66)
			{
			JOptionPane.showMessageDialog(frame, "Wait, hold up...it looks like them clouds are gettin a bit darker");
			survivorSeaStorm();
			}
		else if (fish >= 66 && fish <= 100)
			{
			JOptionPane.showMessageDialog(frame, "Is...is that water red?!");
			survivorSeaSharkAttack();
			}
		}
	public static void survivorSeaStorm()
		{
		JOptionPane.showMessageDialog(frame, "Get your poncho on and your barf bucket ready! I see a storm on the horizon!");
		int storm = (int)(Math.random()* 100);
		if (storm >= 0 && storm < 51)
			{
			seaStormCounter = seaStormCounter + 1;
			JOptionPane.showMessageDialog(frame, "You lucky son of a gun...looks like you lived through this one. That's " + seaStormCounter + " storms survived.");
			survivorSea();
			}
		else if (storm >= 51 && storm <= 100)
			{
			JOptionPane.showMessageDialog(frame, "Lol. Killed by nature. That hasen't happened in like forever.");
			survivorDeath();
			}
		}
	public static void survivorIslandEnd()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "As the boat sloses violently back and forth, you catch sight of an island in the distance. Do you approach?",
				"In the distance...",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "You idiot! Do you know the odds of finding another island?!");
			survivorSea();	
			}
		else if (userChoice == 0)
			{
			JOptionPane.showMessageDialog(frame, "You're feet touch land. Land free of zombies and filled with food. I have to say I'm impressed. You've somehow survived the apocalypse.");
			}
		}
	public static void survivorDeath()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "Would you like to continue playing as a zombie?",
				"RIP",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 0)
			{
			className = 1;
			pathAssign();
			}
		else if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "Thanks for playing! Come again soon.");
			}
		}
	public static void zombieCity()
		{
		int path = (int)(Math.random()* 100);
		if (path >= 0 && path < 71)
			{
			zombieCityHuman();
			}
		else if (path >= 71 && path < 100)
			{
			zombieCityWander();
			}
		}
	public static void zombieCityHuman()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "A human! You feeling hungry??",
				"In the distance...",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "Fine don't then...loser");
			zombieCity();	
			}
		else if (userChoice == 0)
			{
			int attack = (int)(Math.random()* 100);
			if (humansKilled > 9)
				{
				if (attack >= 0 && attack < 80)
					{
					humansKilled = humansKilled + 1;
					JOptionPane.showMessageDialog(frame, "What a fight! You've now killed and eaten " + humansKilled + " humans.");
					zombieCity();
					}
				else 
					{
					zombieDeath();
					}
				}
			else 
				{
				if (attack >= 0 && attack < 60)
					{
					humansKilled = humansKilled + 1;
					JOptionPane.showMessageDialog(frame, "What a fight! You've now killed and eaten " + humansKilled + " humans.");
					zombieCity();
					}
				else 
					{
					zombieDeath();
					}
				}
			}
		}
	public static void zombieCityWander()
		{
		JOptionPane.showMessageDialog(frame, "You know, most of a zombie's job is just waiting around for a human to show up...");
		zombieCity();
		}
	public static void zombieTown()
		{
		int path = (int)(Math.random()* 100);
		if (path >= 0 && path < 61)
			{
			zombieTownHuman();
			}
		else if (path >= 61 && path < 100)
			{
			zombieTownWander();
			}
		}
	public static void zombieTownHuman()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "A human! You feeling hungry??",
				"In the distance...",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "Fine don't then...loser");
			zombieTown();	
			}
		else if (userChoice == 0)
			{
			int attack = (int)(Math.random()* 100);
			if (humansKilled > 9)
				{
				if (attack >= 0 && attack < 80)
					{
					humansKilled = humansKilled + 1;
					JOptionPane.showMessageDialog(frame, "What a fight! You've now killed and eaten " + humansKilled + " humans.");
					zombieTown();
					}
				else 
					{
					zombieDeath();
					}
				}
			else 
				{
				if (attack >= 0 && attack < 60)
					{
					humansKilled = humansKilled + 1;
					JOptionPane.showMessageDialog(frame, "What a fight! You've now killed and eaten " + humansKilled + " humans.");
					zombieTown();
					}
				else 
					{
					zombieDeath();
					}
				}
			}
		}
	public static void zombieTownWander()
		{
		JOptionPane.showMessageDialog(frame, "You know, most of a zombie's job is just waiting around for a human to show up...");
		zombieTown();
		}
	public static void zombieWild()
		{
		int path = (int)(Math.random()* 100);
		if (path >= 0 && path < 31)
			{
			zombieWildHuman();
			}
		else if (path >= 31 && path <61)
			{
			zombieWildBear();
			}
		else if (path >= 61 && path < 100)
			{
			zombieWildWander();
			}
		}
	public static void zombieWildHuman()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "A human! You feeling hungry??",
				"In the distance...",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "Fine don't then...loser");
			zombieWild();	
			}
		else if (userChoice == 0)
			{
			int attack = (int)(Math.random()* 100);
			if (humansKilled > 9)
				{
				if (attack >= 0 && attack < 80)
					{
					humansKilled = humansKilled + 1;
					JOptionPane.showMessageDialog(frame, "What a fight! You've now killed and eaten " + humansKilled + " humans.");
					zombieWild();
					}
				else 
					{
					zombieDeath();
					}
				}
			else
				{
				if (attack >= 0 && attack < 60)
					{
					humansKilled = humansKilled + 1;
					JOptionPane.showMessageDialog(frame, "What a fight! You've now killed and eaten " + humansKilled + " humans.");
					zombieWild();
					}
				else 
					{
					zombieDeath();
					}	
				}
			}
		}
	public static void zombieWildBear()
		{
		JOptionPane.showMessageDialog(frame, "Oh God! A Bear!! Bears are not good for zombies!");
		int attack = (int)(Math.random()* 100);
		if (humansKilled > 9)
			{
			if (attack >= 0 && attack < 80)
				{
				zombieBearBeat = zombieBearBeat + 1;
				JOptionPane.showMessageDialog(frame, "What a fight! You've now defeated " + zombieBearBeat + " bears.");
				zombieWild();
				}
			else 
				{
				zombieDeath();
				}
			}
		else
			{
			if (attack >= 0 && attack < 60)
				{
				zombieBearBeat = zombieBearBeat + 1;
				JOptionPane.showMessageDialog(frame, "What a fight! You've now defeated " + zombieBearBeat + " bears.");
				zombieWild();
				}
			else 
				{
				zombieDeath();
				}	
			}
		}
	public static void zombieWildWander()
		{
		JOptionPane.showMessageDialog(frame, "You know, most of a zombie's job is just waiting around for a human to show up...");
		zombieWild();
		}
	public static void zombieDeath()
		{
		if (humansKilled < 10)
			{
			JOptionPane.showMessageDialog(frame, "You've been killed. It hurts more the second time around.");
			JOptionPane.showMessageDialog(frame, "What a crappy zombie! You only managed to kill " + humansKilled + " humans...");
			}
		else if (humansKilled >= 10 && humansKilled < 20)
			{
			JOptionPane.showMessageDialog(frame, "You've been killed. It hurts more the second time around.");
			JOptionPane.showMessageDialog(frame, "Looks like you're an average zombie! You managed to kill " + humansKilled + " humans.");
			}
		else
			{
			JOptionPane.showMessageDialog(frame, "You've been killed. It hurts more the second time around.");
			JOptionPane.showMessageDialog(frame, "You, my friend, are a god among zombies! You killed " + humansKilled + " humans!");
			}
		}
	}
