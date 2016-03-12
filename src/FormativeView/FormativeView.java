package FormativeView;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Version 1.0
 * @author htha9587
 *3-10-16
 */

public class FormativeView 
{
	private String windowMessage;
	private ImageIcon formativeIcon;
	
	
	/**
	 * Gets answer and then displays Message using JOptionPane library.
	 * @param input
	 * @return
	 */
	
	public FormativeView()
	{
		windowMessage = "Formative Message.";
		formativeIcon = new ImageIcon(this.getClass().getResource("/images/Dolan.jpg"));
		
	}
	
	public String getAnswer(String input)
	{
		
		String answer = "";
		answer = JOptionPane.showInputDialog(null, input, windowMessage, JOptionPane.INFORMATION_MESSAGE, formativeIcon, null, "Type here please!").toString();
		return answer;
	}
	
	public void displayMessage(String input)
	{
		JOptionPane.showMessageDialog(null, input, windowMessage, JOptionPane.PLAIN_MESSAGE, formativeIcon);
	}

	
	
}
