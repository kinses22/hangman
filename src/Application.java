
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		Game game = new Game("Death");
		Prompter prompt = new Prompter(game);
		prompt.showProgress();

		while (counter < 10) {
			boolean isValid = prompt.promptGuess();
			if (isValid) {
				System.out.println("Correct guess");
			} else {
				System.out.println("Incorrect!");
			}
			prompt.showProgress();
			counter++;
		}
	}
}
