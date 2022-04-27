//TNPG: Hot Cake: Ariel, Nada, Samantha

/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		//create game
		CelebrityGame a = new CelebrityGame();

		a.prepareGame();

		//create list
		a.addCelebrity("Daniel Radcliffe", "Harry Potter", "actor");
		a.addCelebrity("Harry Styles", "Adore You", "singer");
		a.addCelebrity("Richard Nixon", "Watergate Scandal", "president");
		a.addCelebrity("Dua Lipa", "Don't Start Now", "singer");
		a.addCelebrity("Andy Warhol", "Campbell Soup", "artist");

		//starts game
		a.play();

		
	}
}
