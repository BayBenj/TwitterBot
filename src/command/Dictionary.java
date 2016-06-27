package command;

import java.util.ArrayList;

import speech.*;
import enumerations.*;
import enumerations.Frequency;

public class Dictionary {

	private ArrayList<Word> entries;
	
	public Dictionary() {
		entries = new ArrayList<Word>();
	}
	
	public void add(Word w) {
		entries.add(w);
	}

	public ArrayList<Word> getEntries() {
		return entries;
	}
	
	public Word getWord(String s) {
		for (int i = 0; i < entries.size(); i++) {
			Word w = entries.get(i);
			switch(w.getPart()) {
			case NOUN:
				w = (NounInfo) w;
				if (w.getSingular().getText().equals(s)) 
					return w;
				break;
			case VERB:
				w = (VerbInfo) w;
				if (w.getImperative().getText().equals(s)) 
					return w;
				break;
			case ADJECTIVE:
				w = (AdjectiveInfo) w;
				if (w.getRegular().getText().equals(s)) 
					return w;
				break;
			case INTERJECTION:
				InterjectionInfo ii = (InterjectionInfo) w;
				//w = (InterjectionInfo) w;
				if (ii.getText().equals(s)) 
					return w;
				break;
			case ADVERB:
				w = (AdverbInfo) w;
				if (w.getText().equals(s)) 
					return w;
				break;
			case CONJUNCTION:
				w = (ConjunctionInfo) w;
				if (w.getText().equals(s)) 
					return w;
				break;
			case PRONOUN:
				PronounInfo pi = (PronounInfo) w;
				//w = (PronounInfo) w;
				if (w.getId().equals(s))
					return w;
				else if (pi.grabSpecialText().equals(s)) 
					return w;
				break;
			case PREPOSITION:
				w = (PrepositionInfo) w;
				if (w.getText().equals(s)) 
					return w;
				break;
			case DETERMINER:
				w = (DeterminerInfo) w;
				if (w.getText().equals(s)) 
					return w;
				break;
			default: 
				System.out.println("Error in getWord()");
				return null;
			}
		}
		System.out.println("Word not found");
		return null;
	}
	
	public ArrayList<Word> getEntries(Tag... targetTags) {
		ArrayList<Word> result = new ArrayList<Word>();
		for (int i = 0; i < entries.size(); i++) {
			boolean hasAll = true;
			for (Tag target : targetTags) {
				if (!entries.get(i).hasTag(target)) {
					hasAll = false;
					break;
				}	
			}
			if (hasAll) 
				result.add(entries.get(i));
		}
		return result;
	}
	
	public ArrayList<Word> getEntriesNot(Tag... targetTags) {
		ArrayList<Word> result = new ArrayList<Word>();
		for (int i = 0; i < entries.size(); i++) {
			boolean hasNone = true;
			for (Tag target : targetTags) {
				if (entries.get(i).hasTag(target)) {
					hasNone = false;
					break;
				}	
			}
			if (hasNone) 
				result.add(entries.get(i));
		}
		return result;
	}
	
	public ArrayList<Word> getEntriesNot1(Tag not1, Tag... targetTags) {
		ArrayList<Word> result = new ArrayList<Word>();
		for (int i = 0; i < entries.size(); i++) {
			boolean reject = true;
			if (!entries.get(i).hasTag(not1)) {
				reject = false;
				for (Tag target : targetTags) {
					if (!entries.get(i).hasTag(target)) {
						reject = true;
						break;
					}	
				}
			}
			if (!reject) 
				result.add(entries.get(i));
		}
		return result;
	}

	/*
	public ArrayList<Word> getEntries(Tag target1, Tag target2) {
		ArrayList<Word> result = new ArrayList<Word>();
		for (int i = 0; i < entries.size(); i++) {
			if (entries.get(i).hasTag(target1) && entries.get(i).hasTag(target2))
				result.add(entries.get(i));
		}
		return result;
	}
	*/
	public ArrayList<Word> getEntries(Tag target, Frequency freq) {
		ArrayList<Word> result = new ArrayList<Word>();
		for (int i = 0; i < entries.size(); i++) {
			if (entries.get(i).getFreq().toString().equals(freq.toString()) && entries.get(i).hasTag(target))
				result.add(entries.get(i));
		}
		return result;
	}
/*
	public ArrayList<Word> getEntries(String part) {
		ArrayList<Word> result = new ArrayList<Word>();
		for (int i = 0; i < entries.size(); i++) {
			if (entries.get(i).getPart().equals(part.toLowerCase()))
				result.add(entries.get(i));
		}
		return result;
	}
*/
	public void setEntries(ArrayList<Word> entries) {
		this.entries = entries;
	}
	
}
