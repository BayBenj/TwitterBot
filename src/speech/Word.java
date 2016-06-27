package speech;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import enumerations.AdjType;
import enumerations.Frequency;
import enumerations.Mood;
import enumerations.Number;
import enumerations.Person;
import enumerations.PoS;
import enumerations.Tag;
import enumerations.Tense;

public abstract class Word {

	protected PoS part;
	private Frequency freq;
	private ArrayList<Tag> tags;

	public Word() {
		this.tags = new ArrayList<Tag>();
	}
	
	public Word(Frequency freq, ArrayList<Tag> tags) {
		this.tags = new ArrayList<Tag>();
		this.setFreq(freq);
		this.setTags(tags);
	}
	
	public Word(Frequency freq, ArrayList<Tag> tags, String singText, String plurText) {
		this.tags = new ArrayList<Tag>();
		this.setFreq(freq);
		this.setTags(tags);
	}
		
	public boolean hasTag(Tag target) {
		for (int i = 0; i < tags.size(); i++) {
			if (tags.get(i).toString().equals(target.toString())) 
				return true;
		}
		return false;
	}
	
	public void setTags(JSONObject object) {
		JSONArray tags = (JSONArray) object.get("tags");
		for (int i = 0; i < tags.size(); i++) {
			Tag tag = Tag.valueOf((String)tags.get(i));
			this.addTag(tag);
		}		
	}
	
	public void setFreq(JSONObject object) {
		Frequency freq = Frequency.valueOf(object.get("frequency").toString());
		this.setFreq(freq);
	}

		
	public PoS getPart() {
		return null;
	}
	
	public void setPart(PoS part) {
		//do nothing
	}

	public void addTag(Tag tag) {
		this.tags.add(tag);
	}
	
	public ArrayList<Tag> getTags() {
		return tags;
	}

	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}

	public Frequency getFreq() {
		return freq;
	}

	public void setFreq(Frequency freq) {
		this.freq = freq;
	}
	
	public String getText() {
		return "empty";
	}

	public void setText(String text) {
		//do nothing
	}

	public Word getRegular() {
		return null;
	}

	public void setRegular(String Regular) {
		//do nothing
	}

	
	public Word getInfinitive() {
		return null;
	}

	public void setInfinitive(String infinitive) {
		//do nothing
	}

	public Word getGerund() {
		return null;
	}

	public void setGerund(String gerund) {
		//do nothing
	}

	public Word getParticiple() {
		return null;
	}

	public void setParticiple(String participle) {
		//do nothing
	}

	public Word getIndicativePresentFirstSing() {
		return null;
	}

	public void setIndicativePresentFirstSing(String indicativePresentFirstSing) {
		//do nothing
	}

	public Word getIndicativePresentFirstPlur() {
		return null;
	}

	public void setIndicativePresentFirstPlur(String indicativePresentFirstPlur) {
		//do nothing
	}

	public Word getIndicativePresentSecond() {
		return null;
	}

	public void setIndicativePresentSecond(String indicativePresentSecond) {
		//do nothing
	}

	public Word getIndicativePresentThirdSing() {
		return null;
	}

	public void setIndicativePresentThirdSing(String indicativePresentThirdSing) {
		//do nothing
	}

	public Word getIndicativePresentThirdPlur() {
		return null;
	}

	public void setIndicativePresentThirdPlur(String indicativePresentThirdPlur) {
		//do nothing
	}

	public Word getIndicativePastFirstSing() {
		return null;
	}

	public void setIndicativePastFirstSing(String indicativePastFirstSing) {
		//do nothing
	}

	public Word getIndicativePastFirstPlur() {
		return null;
	}

	public void setIndicativePastFirstPlur(String indicativePastFirstPlur) {
		//do nothing
	}

	public Word getIndicativePastSecond() {
		return null;
	}

	public void setIndicativePastSecond(String indicativePastSecond) {
		//do nothing
	}

	public Word getIndicativePastThirdSing() {
		return null;
	}

	public void setIndicativePastThirdSing(String indicativePastThirdSing) {
		//do nothing
	}

	public Word getIndicativePastThirdPlur() {
		return null;
	}

	public void setIndicativePastThirdPlur(String indicativePastThirdPlur) {
		//do nothing
	}

	public Word getSingular() {
		return null;
	}

	public void setSingular(String singText) {
		//do nothing
	}

	public Word getPlural() {
		return null;
	}
	
	public String getPluralStr() {
		return null;
	}

	public void setPlural(String plural) {
		//do nothing
	}

	public Word getComparative() {
		return null;
	}
	
	public void setComparative(String comparative) {
		//do nothing
	}
	
	public Word getSuperlative() {
		return null;
	}
	
	public void setSuperlative(String superlative) {
		//do nothing
	}

	public Word getImperative() {
		return null;
	}

	public void setImperative(String imperative) {
		//do nothing
	}
	
	public AdjType getAdjType() {
		return null;
	}
	
	public void setAdjType(AdjType adjType) {
		//do nothing
	}

	public Person getPerson() {
		return null;
	}

	public void setPerson(Person person) {
		//do nothing
	}

	public Number getNumber() {
		return null;
	}

	public void setNumber(Number number) {
		//do nothing
	}

	public Tense getTense() {
		return null;
	}

	public void setTense(Tense tense) {
		//do nothing
	}

	public Mood getMood() {
		return null;
	}
	
	public void setMood(Mood mood) {
		//do nothing
	}
	
	public Word getSubjectiveFirstSing() {
		return null;
	}

	public void setSubjectiveFirstSing(String subjectiveFirstSing) {
		//do nothing
	}

	public Word getSubjectiveSecond() {
		return null;
	}

	public void setSubjectiveSecond(String subjectiveSecond) {
		//do nothing
	}

	public Word getSubjectiveThirdSingMale() {
		return null;
	}

	public void setSubjectiveThirdSingMale(String subjectiveThirdSingMale) {
		//do nothing
	}

	public Word getSubjectiveThirdSingFemale() {
		return null;
	}

	public void setSubjectiveThirdSingFemale(String subjectiveThirdSingFemale) {
		//do nothing
	}

	public Word getSubjectiveFirstPlur() {
		return null;
	}

	public void setSubjectiveFirstPlur(String subjectiveFirstPlur) {
		//do nothing
	}

	public Word getSubjectiveThirdPlur() {
		return null;
	}

	public void setSubjectiveThirdPlur(String subjectiveThirdPlur) {
		//do nothing
	}

	public Word getObjectiveFirstSing() {
		return null;
	}

	public void setObjectiveFirstSing(String objectiveFirstSing) {
		//do nothing
	}

	public Word getObjectiveSecond() {
		return null;
	}

	public void setObjectiveSecond(String objectiveSecond) {
		//do nothing
	}

	public Word getObjectiveThirdSingMale() {
		return null;
	}

	public void setObjectiveThirdSingMale(String objectiveThirdSingMale) {
		//do nothing
	}

	public Word getObjectiveThirdSingFemale() {
		return null;
	}

	public void setObjectiveThirdSingFemale(String objectiveThirdSingFeale) {
		//do nothing
	}

	public Word getObjectiveFirstPlur() {
		return null;
	}

	public void setObjectiveFirstPlur(String objectiveFirstPlur) {
		//do nothing
	}

	public Word getObjectiveThirdPlur() {
		return null;
	}

	public void setObjectiveThirdPlur(String objectiveThirdPlur) {
		//do nothing
	}

	public Word getPossessiveFirstSing() {
		return null;
	}

	public void setPossessiveFirstSing(String possessiveFirstSing) {
		//do nothing
	}

	public Word getPossessiveSecond() {
		return null;
	}

	public void setPossessiveSecond(String possessiveSecond) {
		//do nothing
	}

	public Word getPossessiveThirdSingMale() {
		return null;
	}

	public void setPossessiveThirdSingMale(String possessiveThirdSingMale) {
		//do nothing
	}

	public Word getPossessiveThirdSingFemale() {
		return null;
	}

	public void setPossessiveThirdSingFemale(String possessiveThirdSingFemale) {
		//do nothing
	}

	public Word getPossessiveFirstPlur() {
		return null;
	}

	public void setPossessiveFirstPlur(String possessiveFirstPlur) {
		//do nothing
	}

	public Word getPossessiveThirdPlur() {
		return null;
	}

	public void setPossessiveThirdPlur(String possessiveThirdPlur) {
		//do nothing
	}
	
	public Word getReflexiveFirstSing() {
		return null;
	}

	public void setReflexiveFirstSing(String reflexiveFirstSing) {
		//do nothing
	}

	public Word getReflexiveSecond() {
		return null;
	}

	public void setReflexiveSecond(String reflexiveSecond) {
		//do nothing
	}

	public Word getReflexiveThirdSingMale() {
		return null;
	}

	public void setReflexiveThirdSingMale(String reflexiveThirdSingMale) {
		//do nothing
	}

	public Word getReflexiveThirdSingFemale() {
		return null;
	}

	public void setReflexiveThirdSingFemale(String reflexiveThirdSingFemale) {
		//do nothing
	}

	public Word getReflexiveFirstPlur() {
		return null;
	}

	public void setReflexiveFirstPlur(String reflexiveFirstPlur) {
		//do nothing
	}

	public Word getReflexiveThirdPlur() {
		return null;
	}

	public void setReflexiveThirdPlur(String reflexiveThirdPlur) {
		//do nothing
	}

	public Pronoun getSpecialText() {
		return null;
	}
	
	public void setSpecialText(String specialText) {
		//do nothing
	}

	public String getId() {
		return null;
	}
	
	public void setId(String id) {
		// do nothing
		
	}

	public boolean isPunc() {
		return false;
	}

}
