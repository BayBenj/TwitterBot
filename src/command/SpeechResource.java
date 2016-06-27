package command;

import java.util.ArrayList;
import java.util.Random;

import enumerations.Tag;
import enumerations.Frequency;
import speech.*;
import enumerations.PoS;

public class SpeechResource {//SpeechResource
	
	public static DictionaryManager manager;
	public static Random rnd = new Random();
	
	protected final PoS nou = PoS.NOUN;
	protected final PoS ver = PoS.VERB;
	protected final PoS adj = PoS.ADJECTIVE;
	protected final PoS inj = PoS.INTERJECTION;
	protected final PoS adv = PoS.ADVERB;
	protected final PoS pro = PoS.PRONOUN;
	protected final PoS con = PoS.CONJUNCTION;
	protected final PoS pre = PoS.PREPOSITION;
	protected final PoS det = PoS.DETERMINER;
	
	public static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			return true;
		return false;
	}
	
	public static String aOrAn(String nextWord) {
		if (isVowel(nextWord.charAt(0)))
			return "an";
		else 
			return "a";
	}
	
	public static Frequency chooseFreq() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(101);
		if (randomInt >= 0 && randomInt < 60) {
			return Frequency.COMMON;
		}
		else if (randomInt >= 60 && randomInt < 101) {
			return Frequency.UNCOMMON;
		}
		return null;
	}
			
	public static Word w(PoS part, Tag... tags) {
		ArrayList<Word> entries = manager.getDict(part).getEntries(tags);
		return switchPart(part, entries);
	}
	
	public static Word w(PoS part, String s) {
		ArrayList<Word> result = new ArrayList<Word>(); 
		result.add(manager.getDict(PoS.NOUN).getWord(s));
		return switchPart(part, result);
	}
	
	private static Word switchPart(PoS part, ArrayList<Word> entries) {
		switch(part) {
		case NOUN:
			return (NounInfo)getWord(entries, part);
		case VERB:
			return (VerbInfo)getWord(entries, part);
		case ADJECTIVE:
			return (AdjectiveInfo)getWord(entries, part);
		case INTERJECTION:
			return (InterjectionInfo)getWord(entries, part);
		case ADVERB:
			return (AdverbInfo)getWord(entries, part);
		case PRONOUN:
			return (PronounInfo)getWord(entries, part);
		case PREPOSITION:
			return (PrepositionInfo)getWord(entries, part);
		case CONJUNCTION:
			return (ConjunctionInfo)getWord(entries, part);
		case DETERMINER:
			return (DeterminerInfo)getWord(entries, part);
		default:
			return null;
		}
	}
		
	public static NounInfo not1noun(Tag not1, Tag... tags) {
		ArrayList<Word> entries = manager.getDict(PoS.NOUN).getEntriesNot1(not1, tags);
		return (NounInfo)getWord(entries, PoS.NOUN);
	}

	public static VerbInfo not1verb(Tag not1, Tag... tags) {
		ArrayList<Word> entries = manager.getDict(PoS.VERB).getEntriesNot1(not1, tags);
		return (VerbInfo)getWord(entries, PoS.VERB);
	}

	public static AdjectiveInfo not1adjective(Tag not1, Tag... tags) {
		ArrayList<Word> entries = manager.getDict(PoS.ADJECTIVE).getEntriesNot1(not1, tags);
		return (AdjectiveInfo)getWord(entries, PoS.ADJECTIVE);
	}
	
	private static Word getWord(ArrayList<Word> entries, PoS part) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(entries.size());
		switch(part) {
		case NOUN:
			return (NounInfo)entries.get(randomInt);
		case VERB:
			return (VerbInfo)entries.get(randomInt);
		case ADJECTIVE:
			return (AdjectiveInfo)entries.get(randomInt);
		case INTERJECTION:
			return (InterjectionInfo)entries.get(randomInt);
		case ADVERB:
			return (AdverbInfo)entries.get(randomInt);
		case PRONOUN:
			return (PronounInfo)entries.get(randomInt);
		case PREPOSITION:
			return (PrepositionInfo)entries.get(randomInt);
		case CONJUNCTION:
			return (ConjunctionInfo)entries.get(randomInt);
		case DETERMINER:
			return (DeterminerInfo)entries.get(randomInt);
		default:
			return null;
		}
	}
				
	public static Object orO(Object... objects) {
		ArrayList<Object> actuals = new ArrayList<Object>();
		for (int i = 0; i < objects.length; i++) {
			Object temp = objects[i];
			i++;
			Integer frequency = (Integer) objects[i];
			for (int j = 0; j < frequency; j++) {
				actuals.add(temp);
			}
		}
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(actuals.size());
		return actuals.get(randomInt);
	}
	
	public static String or(Object... objects) {
		ArrayList<Object> actuals = new ArrayList<Object>();
		for (int i = 0; i < objects.length; i++) {
			Object temp = objects[i];
			i++;
			Integer frequency = (Integer) objects[i];
			for (int j = 0; j < frequency; j++) {
				actuals.add(temp);
			}
		}
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(actuals.size());
		return actuals.get(randomInt).toString();
	}
	
	public static Word orW(Object...objects) {
		ArrayList<Word> actuals = new ArrayList<Word>();
		for (int i = 0; i < objects.length; i += 2) {
			for (int j = 0; j < ((Integer) objects[i + 1]); j++) {
				actuals.add((Word)objects[i]);
			}
		}
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(actuals.size());
		return actuals.get(randomInt);
	}
	
	public static ArrayList<String>rndElement(ArrayList<ArrayList<String>> lists) {
		int randomInt = rnd.nextInt(lists.size());
		return lists.get(randomInt);
	}
	
	public  static String arrayToString(ArrayList<String> array) {
		String result = "";
		for (int i = 0; i < array.size(); i++) {
			result += array.get(i);
		}
		return result;
	}
	
}
