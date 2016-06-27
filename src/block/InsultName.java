package block;

import enumerations.Tag;
import speech.Adjective;
import speech.Noun;
import speech.Word;

public class InsultName extends BlockBlock {

	private Word adje;
	private Word noun;
	
	public InsultName() {
		adje = w(adj, Tag.INSULT).getRegular();
		noun = w(nou, Tag.INSULT).getSingular();
	}
	
	public Word getAdj() {
		return adje;
	}

	public void setAdje(Adjective adje) {
		this.adje = adje;
	}

	public Word getNoun() {
		return noun;
	}

	public void setNoun(Noun noun) {
		this.noun = noun;
	}
	
}
