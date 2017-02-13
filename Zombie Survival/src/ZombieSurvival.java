import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ZombieSurvival extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
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
					}
				else if (adventure.equals("Small Town"))
					{
					JOptionPane.showMessageDialog(frame, "Not a bad choice...you might survive a day or too.");
					}
				else if (adventure.equals("Wilderness"))
					{
					JOptionPane.showMessageDialog(frame, "Well there won't be many zombies to worry about...just EVERYTHING ELSE!!!");
					}
				else if (adventure.equals("Ocean"))
					{
					JOptionPane.showMessageDialog(frame, "I mean...you'll be on a boat...surrounded by water.......yay?");
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
	}
