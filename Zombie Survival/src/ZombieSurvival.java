import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ZombieSurvival extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static int seaStormCounter;
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
			final String[] genre = { "Big City", "Small Town", "Wilderness", "Beach" };
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
					}
				else if (adventure.equals("Small Town"))
					{
					JOptionPane.showMessageDialog(frame, "Ah that small town life. Good people, good views, and really really good brains!");
					}
				else if (adventure.equals("Wilderness"))
					{
					JOptionPane.showMessageDialog(frame, "Because you're a zombie. You do what you want.");
					}
				else if (adventure.equals("Ocean"))
					{
					JOptionPane.showMessageDialog(frame, "Hey, the undead needs sick tans too dawg!");
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
		else if (storm >= 51 && storm < 100)
			{
			JOptionPane.showMessageDialog(frame, "Lol. Killed by nature. That hasen't happened in like forever.");
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
		else if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "You're feet touch land. Land free of zombies and filled with food. I have to say I'm impressed. You've somehow survived the apocalypse.");
			}
		}
	public static void survivorDeath()
		{
		Object[] options = {"Yes", "No"};
		int userChoice = JOptionPane.showOptionDialog(frame, "You had a good run, but for whatever reason, you gave in and died like a little bitch. Now, would you like to continue playing as a zombie?",
				"RIP",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		if (userChoice == 0)
			{
			className = 1;	
			}
		else if (userChoice == 1)
			{
			JOptionPane.showMessageDialog(frame, "Thanks for playing! Come again soon.");
			}
		}
	}
