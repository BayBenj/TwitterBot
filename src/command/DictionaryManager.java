package command;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import speech.*;
import enumerations.PoS;

public class DictionaryManager {

	private Dictionary nouns = new Dictionary();
	private Dictionary verbs = new Dictionary();
	private Dictionary adjectives = new Dictionary();
	private Dictionary adverbs = new Dictionary();
	private Dictionary articles = new Dictionary();
	private Dictionary interjections = new Dictionary();
	private Dictionary prepositions = new Dictionary();
	private Dictionary pronouns = new Dictionary();
	private Dictionary participles = new Dictionary();
	private Dictionary conjunctions = new Dictionary();
	private Dictionary determiners = new Dictionary();
	private String jsonDictionary;
		
	public DictionaryManager(String jsonDictionary) {
		this.jsonDictionary = jsonDictionary;
	}
	
	public void readJson() {
		try {
			FileReader reader = new FileReader(jsonDictionary);
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
			JSONArray words = (JSONArray) jsonObject.get("words");

			for (int j = 0; j < words.size(); j++) {
				JSONObject word = (JSONObject) words.get(j);
								
				String part = ((String) word.get("partofspeech")).toLowerCase();
				switch(part) {
				case "noun":
					this.setUpNoun(word);
					break;
				case "verb":
					this.setUpVerb(word);
					break;
				case "adjective":
					this.setUpAdjective(word);
					break;
				case "adverb":
					this.setUpAdverb(word);
					break;
				case "interjection":
					this.setUpInterjection(word);
					break;
				case "pronoun":
					this.setUpPronoun(word);
					break;
				case "preposition":
					this.setUpPreposition(word);
					break;
				case "conjunction":
					this.setUpConjunction(word);
					break;
				case "determiner":
					this.setUpDeterminer(word);
					break;
				default:
					throw new ParseException(0, part);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	private void setUpNoun(JSONObject object) {
		String singularText = (String) object.get("singular");
		//((NounInfo) w).setSingular(singularText);
		String pluralText = (String) object.get("plural");
		//((NounInfo) w).setPlural(pluralText);
		NounInfo w = new NounInfo(singularText, pluralText);
		w.setPart(PoS.NOUN);
		w.setTags(object);
		w.setFreq(object);
		nouns.add(w);
	}
	
	private void setUpVerb(JSONObject object) {
		String infinitive = (String) object.get("infinitive");
		String gerund = (String) object.get("gerund");
		String imperative = (String) object.get("imperative");
		String participle = (String) object.get("participle");
		//w.setInfinitive(infinitive);
		//w.setGerund(gerund);
		//w.setImperative(imperative);
		//w.setParticiple(participle);
		String indicativePresentFirstSing =  (String) object.get("indicativepresentfirstsing");
		String indicativePresentFirstPlur =  (String) object.get("indicativepresentfirstplur");
		String indicativePresentSecond =  (String) object.get("indicativepresentsecond");
		String indicativePresentThirdSing =  (String) object.get("indicativepresentthirdsing");
		String indicativePresentThirdPlur =  (String) object.get("indicativepresentthirdplur");
		//w.setIndicativePresentFirstSing(indicativePresentFirstSing);
		//w.setIndicativePresentFirstPlur(indicativePresentFirstPlur);
		//w.setIndicativePresentSecond(indicativePresentSecond);
		//w.setIndicativePresentThirdSing(indicativePresentThirdSing);
		//w.setIndicativePresentThirdPlur(indicativePresentThirdPlur);
		String indicativePastFirstSing =  (String) object.get("indicativepastfirstsing");
		String indicativePastFirstPlur =  (String) object.get("indicativepastfirstplur");
		String indicativePastSecond =  (String) object.get("indicativepastsecond");
		String indicativePastThirdSing =  (String) object.get("indicativepastthirdsing");
		String indicativePastThirdPlur =  (String) object.get("indicativepastthirdplur");
		//w.setIndicativePastFirstSing(indicativePastFirstSing);
		//w.setIndicativePastFirstPlur(indicativePastFirstPlur);
		//w.setIndicativePastSecond(indicativePastSecond);
		//w.setIndicativePastThirdSing(indicativePastThirdSing);
		//w.setIndicativePastThirdPlur(indicativePastThirdPlur);
		VerbInfo w = new VerbInfo(infinitive,
				gerund,
				imperative,
				participle,
				indicativePresentFirstSing,
				indicativePresentFirstPlur,
				indicativePresentSecond,
				indicativePresentThirdSing,
				indicativePresentThirdPlur,
				indicativePastFirstSing,
				indicativePastFirstPlur,
				indicativePastSecond,
				indicativePastThirdSing,
				indicativePastThirdPlur);
		w.setPart(PoS.VERB);
		w.setTags(object);
		w.setFreq(object);
		verbs.add(w);
	}
	
	private void setUpAdjective(JSONObject object) {
		String text = (String) object.get("text");
		String comparative = (String) object.get("comparative");
		String superlative = (String) object.get("superlative");
		AdjectiveInfo w = new AdjectiveInfo(text, comparative, superlative);
		//w.setRegular(text);
		//w.setComparative(comparative);
		//w.setSuperlative(superlative);
		w.setPart(PoS.ADJECTIVE);
		w.setTags(object);
		w.setFreq(object);
		adjectives.add(w);
	}

	private void setUpAdverb(JSONObject object) {
		AdverbInfo w = new AdverbInfo();
		String text = (String) object.get("text");
		w.setText(text);
		w.setPart(PoS.ADVERB);
		w.setTags(object);
		w.setFreq(object);
		adverbs.add(w);
	}

	private void setUpInterjection(JSONObject object) {
		InterjectionInfo w = new InterjectionInfo();
		String text = (String) object.get("text");
		w.setText(text);
		w.setPart(PoS.INTERJECTION);
		w.setTags(object);
		w.setFreq(object);
		interjections.add(w);
	}

	private void setUpPronoun(JSONObject object) {
		String id = (String) object.get("id");
		String subjectiveFirstSing = (String) object.get("subjectiveFirstSing");
		String subjectiveSecond = (String) object.get("subjectiveSecond");
		String subjectiveThirdSingMale = (String) object.get("subjectiveThirdSingMale");
		String subjectiveThirdSingFemale = (String) object.get("subjectiveThirdSingFemale");
		String subjectiveFirstPlur = (String) object.get("subjectiveFirstPlur");
		String subjectiveThirdPlur = (String) object.get("subjectiveThirdPlur");
		String objectiveFirstSing = (String) object.get("objectiveFirstSing");
		String objectiveSecond = (String) object.get("objectiveSecond");
		String objectiveThirdSingMale = (String) object.get("objectiveThirdSingMale");
		String objectiveThirdSingFemale = (String) object.get("objectiveThirdSingFemale");
		String objectiveFirstPlur = (String) object.get("objectiveFirstPlur");
		String objectiveThirdPlur = (String) object.get("objectiveThirdPlur");
		String possessiveFirstSing = (String) object.get("possessiveFirstSing");
		String possessiveSecond = (String) object.get("possessiveSecond");
		String possessiveThirdSingMale = (String) object.get("possessiveThirdSingMale");
		String possessiveThirdSingFemale = (String) object.get("possessiveThirdSingFemale");
		String possessiveFirstPlur = (String) object.get("possessiveFirstPlur");
		String possessiveThirdPlur = (String) object.get("possessiveThirdPlur");
		String reflexiveFirstSing = (String) object.get("reflexiveFirstSing");
		String reflexiveSecond = (String) object.get("reflexiveSecond");
		String reflexiveThirdSingMale = (String) object.get("reflexiveThirdSingMale");
		String reflexiveThirdSingFemale = (String) object.get("reflexiveThirdSingFemale");
		String reflexiveFirstPlur = (String) object.get("reflexiveFirstPlur");
		String reflexiveThirdPlur = (String) object.get("reflexiveThirdPlur");

		String specialText = (String) object.get("specialText");
		PronounInfo w = new PronounInfo(id,
				 subjectiveFirstSing,
				 subjectiveSecond,
				 subjectiveThirdSingMale,
				 subjectiveThirdSingFemale,
				 subjectiveFirstPlur,
				 subjectiveThirdPlur,
				 objectiveFirstSing,
				 objectiveSecond,
				 objectiveThirdSingMale,
				 objectiveThirdSingFemale,
				 objectiveFirstPlur,
				 objectiveThirdPlur,
				 possessiveFirstSing,
				 possessiveSecond,
				 possessiveThirdSingMale,
				 possessiveThirdSingFemale,
				 possessiveFirstPlur,
				 possessiveThirdPlur,
				 reflexiveFirstSing,
				 reflexiveSecond,
				 reflexiveThirdSingMale,
				 reflexiveThirdSingFemale,
				 reflexiveFirstPlur,
				 reflexiveThirdPlur,
				 specialText);
		w.setPart(PoS.PRONOUN);
		w.setTags(object);
		w.setFreq(object);
		pronouns.add(w);
	}

	private void setUpPreposition(JSONObject object) {
		PrepositionInfo w = new PrepositionInfo();
		String text = (String) object.get("text");
		w.setText(text);
		w.setPart(PoS.PREPOSITION);
		w.setTags(object);
		w.setFreq(object);
		prepositions.add(w);
	}
			
	private void setUpConjunction(JSONObject object) {
		ConjunctionInfo w = new ConjunctionInfo();
		String text = (String) object.get("text");
		w.setText(text);
		w.setPart(PoS.CONJUNCTION);
		w.setTags(object);
		w.setFreq(object);
		conjunctions.add(w);
	}
	
	private void setUpDeterminer(JSONObject object) {
		DeterminerInfo w = new DeterminerInfo();
		String text = (String) object.get("text");
		w.setText(text);
		w.setPart(PoS.DETERMINER);
		w.setTags(object);
		w.setFreq(object);
		determiners.add(w);
	}
		
	public Dictionary getDict(PoS part) {
		switch(part) {
		case NOUN:
			return this.nouns;
		case VERB:
			return this.verbs;
		case ADJECTIVE:
			return this.adjectives;		
		case ADVERB:
			return this.adverbs;
		case PREPOSITION:
			return this.prepositions;
		case PRONOUN:
			return this.pronouns;
		case CONJUNCTION:
			return this.conjunctions;
		case INTERJECTION:
			return this.interjections;
		case DETERMINER:
			return this.determiners;
		default:
			System.out.println("ERROR GETTING DICTIONARY");
			return null;
		}
	}
		
}
