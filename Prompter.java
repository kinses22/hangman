import java.util.Scanner;

public class Prompter {

	private Game mGame;
	Scanner scr = new Scanner (System.in);
	
	
	public Prompter(Game game){
		mGame = game;
	} 
	
	public boolean promptGuess(){
		
		System.out.println("Enter a guess: ");
		String guessAsString = scr.nextLine();
		while(guessAsString.length() > 1 ){
			System.out.println("Please enter in only 1 character");
			System.out.println("Enter a guess: ");
			guessAsString = scr.nextLine();
		}
		char guess = guessAsString.charAt(0);
		return mGame.Guess(guess);
	}
	
	public void showProgress(){
		System.out.printf("Here is your progress: %s\n", mGame.getProgress() );
	}
	
	
}
