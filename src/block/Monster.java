package block;

import java.util.ArrayList;

import command.SpeechResource;
import enumerations.Tag;
import speech.NounInfo;
import speech.VerbInfo;
import speech.Word;

public class Monster extends SpeechResource {

	private Word type;
	private ArrayList<Tag> tags;
	private VerbInfo verb;
	
	public Monster() {
		type = w(nou, Tag.MONSTER);
		tags = type.getTags();
		int waterMultiplier = 1;
		if (tags.contains(Tag.WATER))
			waterMultiplier = 3;
		verb = (VerbInfo) orW(not1verb(Tag.WATER), 1, w(ver, Tag.WATER), waterMultiplier); 
	}

	public Word getType() {
		return type;
	}

	public void setType(NounInfo type) {
		this.type = type;
	}

	public ArrayList<Tag> getTags() {
		return tags;
	}

	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}

	public VerbInfo getVerb() {
		return verb;
	}

	public void setVerb(VerbInfo verb) {
		this.verb = verb;
	}
	
}
