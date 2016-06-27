package block;

import java.util.ArrayList;

import speech.Word;

public class WordBlock extends Block {

	protected ArrayList<Word> words;

	public WordBlock() {
		this.words = new ArrayList<Word>();
	}
	
	public String string() {
		return this.recursive(this, "");
	}
	
	@Override
	public String recursive(Block block, String text) {
		for (int i = 0; i < words.size(); i++) {
			if (i >= words.size() - 1 || words.get(i + 1).isPunc()) {
				text += words.get(i).getText();
			}
			else {
				text += words.get(i).getText() + " ";
			}
		}
		return text;
	}
	
	public void addWord(Word w) {
		this.words.add(w);
	}
	
	public void addWords(ArrayList<Word> list) {
		for (int i = 0; i < list.size(); i++) {
			this.words.add(list.get(i));
		}
	}
	
	public ArrayList<Word> getWords() {
		return words;
	}

	public void setWords(ArrayList<Word> words) {
		this.words = words;
	}
	
}
