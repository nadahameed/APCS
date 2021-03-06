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
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if ((statement.trim()).length() == 0){
			response = "Don't be like that; talk to me!";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (findKeyword(statement, "Mykolyk") >= 0)
		{
			response = "Whoa, Mr. Mykolyk sounds amazing!";
		}
		else if (findKeyword(statement, "orange") >= 0)
		{
			response = "Orange is my third favorite color!";
		}
		else if (findKeyword(statement, "school") >= 0)
		{
			response = "I think I stopped listening at 'school,' sorry.";
		}
		else if (findKeyword(statement, "rat") >= 0)
		{
			response = "You should turn back to your rat pack, tell them I'm trash ;)";
		}
		else
		{
			response = getRandomResponse(statement);
		}
		return response;
	}
	//To prioritize responses, order matters - put priority words first!
	//When a keyword is included in another word (ex: smother), you'll still be asked about your mother - the letters are detected; not the word itself.

	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0)
		{

			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1);
			}

			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			psn = phrase.indexOf(goal, psn + 1);

		}

		return -1;
	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse(String statement)
	{
		final int NUMBER_OF_RESPONSES = 7;
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
			response = "Ok.";
		}
		else if (whichResponse == 5)
		{
			response = "If you say so.";
		}
		else if (whichResponse == 6)
		{
			response = statement;
		}

		return response;
	}
}
