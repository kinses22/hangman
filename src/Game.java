
public class Game {

	private String mAnswer;
	private String valid;
	private String invalid;
	

	public Game(String answer) {
		mAnswer = answer;
		valid = "";
		invalid = "";
	}

	public boolean Guess(char letter){
		
		boolean isValid = mAnswer.indexOf(letter) >= 0;
		
		if(isValid){
			valid += letter;
		} else{
			invalid += letter;
		}
		
		return isValid;
		
	}

	public String getProgress(){
		String progress = "";
		char [] answer = mAnswer.toCharArray();
		
		for(int i = 0; i < mAnswer.length(); i++){
			char let = answer[i];	
			char display = '-';
			if(valid.indexOf(let) >= 0){
				display = let;
			}
			progress += display;
		}
		
		return progress;
	}
	
	
} 
