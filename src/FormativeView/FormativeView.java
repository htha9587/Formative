package FormativeView;

import javax.swing.JOptionPane;
/**
 * Version 1.0
 * @author htha9587
 *3-10-16
 */

public class FormativeView 
{

	/**
	 * Gets answer and then displays Message using JOptionPane library.
	 * @param input
	 * @return
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, input);
		return answer;
	}
	
	public void displayMessage(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}

 
	
	
	
}
