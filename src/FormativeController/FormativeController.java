package FormativeController;

import FormativeController.FormativeRunner;
import FormativeView.FormativeView;

/**
 * Version 1
 * @author htha9587
 * 3-10-16
 */

public class FormativeController 
{
	private FormativeView formativePopup;
	
	public FormativeController()
	{
		formativePopup = new FormativeView();
	}
	
	/**
	 * Goes through and has user input character and number.
	 */
	
	
	public void start()
	{
		String name = formativePopup.getAnswer("Type in one character and number.");
		formativePopup.getAnswer("Integers from 1-4, and M, C, I as characters.");
		
		int Character;
		String fCharacter = formativePopup.getAnswer("Type in one of the four numbers.");
	
			if(isInteger(fCharacter))
			{
				Character = Integer.parseInt(fCharacter);
			}
			else
			{
				Character = 12345678;
			}
			formativePopup.displayMessage("You typed in" + Character);
			formativePopup.displayMessage("Now type in one of the three characters.");
			}

		
		
		/**
		 * Checks to see if integer input is legit.
		 * @param fCharacter
		 * @return
		 */
		
		private boolean isInteger(String fCharacter) {
			// TODO Auto-generated method stub
			return false;
		}
		
		/** 
		 * Once user hits ok, then the program closes.
		 */
		
	public void end()
	
	{
		String name = formativePopup.getAnswer("Thank you for typing, goodbye!");
	}
	
			
	}