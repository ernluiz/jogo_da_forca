package app.com.fag.game;

public class Game {
	private String targetWord;
	private String guessedWord;

	public Game(String targetWord) {
		this.targetWord = targetWord;
		this.guessedWord = "_".repeat(targetWord.length());
	}

	public String getTargetWord() {
		return targetWord;
	}

	public void setTargetWord(String targetWord) {
		this.targetWord = targetWord;
	}

	public String getGuessedWord() {
		return guessedWord;
	}

	public void setGuessedWord(String guessedWord) {
		this.guessedWord = guessedWord;
	}
}
