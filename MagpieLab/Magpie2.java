/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	public String getResponse(String statement)
	{
		String response = "";

		if (statement.indexOf("no") >= 0 || statement.indexOf("No") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("Shivali") >= 0 || statement.indexOf("shivali") >= 0) {
			response = "Yes, Shivali is good at sleeping.";
		} else if (statement.indexOf("Mehak") >= 0 || statement.indexOf("mehak") >= 0) {
			response = "Mehak is good at eating";
		} else if (statement.indexOf("Schletz") >= 0 || statement.indexOf("schletz") >= 0) {
			response = "Schletz should go on more food adventures with his fav buddies";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
	    	response = "Tell me more about your pets.";
	    } else if (statement.indexOf("Mr. Castleman") >= 0) {
	    	response = "He sounds like a good teacher.";
	    } else if (statement.trim().length() == 0) {
	    	response = "Say something, please.";
	    } else {
			response = getRandomResponse();
		}
		return response;
	}
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			 response = "You are great.";
		}
		else if (whichResponse == 5)
		{
			response = "You should think about this.";
		}
		else if (whichResponse == 6)
		{
			response = "You shouldn't think about this.";
		}
		return response;
	}
}
