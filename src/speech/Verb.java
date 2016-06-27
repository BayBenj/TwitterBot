package speech;

import enumerations.Mood;
import enumerations.Person;
import enumerations.Number;
import enumerations.Tense;

public class Verb extends VerbInfo {
	
	private VerbInfo verbInfo;
	private Mood mood;
	private Person person;
	private Number number;
	private Tense tense;
	private String text;
	
	public Verb(VerbInfo verbInfo, Mood mood, Person person, Number number, Tense tense) {
		super(  verbInfo.infinitive,
				verbInfo.gerund,
				verbInfo.imperative,
				verbInfo.participle,
				verbInfo.indicativePresentFirstSing,
				verbInfo.indicativePresentFirstPlur,
				verbInfo.indicativePresentSecond,
				verbInfo.indicativePresentThirdSing,
				verbInfo.indicativePresentThirdPlur,
				verbInfo.indicativePastFirstSing,
				verbInfo.indicativePastFirstPlur,
				verbInfo.indicativePastSecond,
				verbInfo.indicativePastThirdSing,
				verbInfo.indicativePastThirdPlur);
		this.verbInfo = verbInfo;
		this.mood = mood;
		this.person = person;
		this.number = number;
		this.tense = tense;
		if (this.mood == Mood.INDICITAVE) {
			if (this.person == Person.SECOND) {
				if (this.tense == Tense.PAST) {
					this.text = this.indicativePastSecond;
				}
				else if (this.tense == Tense.PRESENT) {
					this.text = this.indicativePresentSecond;
				}
				else if (this.tense == Tense.FUTURE) {
					
				}
			}
			else if (this.person == Person.FIRST) {
				if (this.tense == Tense.PAST) {
					if (this.number == Number.SINGULAR) {
						this.text = this.indicativePastFirstSing;
					}
					else if (this.number == Number.PLURAL) {
						this.text = this.indicativePastFirstPlur;
					}
				}
				else if (this.tense == Tense.PRESENT) {
					if (this.number == Number.SINGULAR) {
						this.text = this.indicativePresentFirstSing;
					}
					else if (this.number == Number.PLURAL) {
						this.text = this.indicativePresentFirstPlur;
					}
				}
				else if (this.tense == Tense.FUTURE) {
					
				}
			}
			else if (this.person == Person.THIRD) {
				if (this.tense == Tense.PAST) {
					if (this.number == Number.SINGULAR) {
						this.text = this.indicativePastThirdSing;
					}
					else if (this.number == Number.PLURAL) {
						this.text = this.indicativePastThirdPlur;
					}
				}
				else if (this.tense == Tense.PRESENT) {
					if (this.number == Number.SINGULAR) {
						this.text = this.indicativePresentThirdSing;
					}
					else if (this.number == Number.PLURAL) {
						this.text = this.indicativePresentThirdPlur;
					}
				}
				else if (this.tense == Tense.FUTURE) {
					
				}
			}
		}
		else if (this.mood == Mood.GERUND) {
			this.text = this.gerund;
		}
		else if (this.mood == Mood.IMPERATIVE) {
			this.text = this.imperative;
		}
		else if (this.mood == Mood.PARTICIPLE) {
			this.text = this.participle;
		}
		else if (this.mood == Mood.INFINITIVE) {
			this.text = this.infinitive;
		}
		if (text == null || text.equals("")) {
			System.out.println("Error loading a verb!");
		}
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public Mood getMood() {
		return mood;
	}
	
	public void setMood(Mood mood) {
		this.mood = mood;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Number getNumber() {
		return number;
	}
	
	public void setNumber(Number number) {
		this.number = number;
	}
	
	public Tense getTense() {
		return tense;
	}

	public void setTense(Tense tense) {
		this.tense = tense;
	}

	public VerbInfo getVerbInfo() {
		return verbInfo;
	}

	public void setVerbInfo(VerbInfo verbInfo) {
		this.verbInfo = verbInfo;
	}
	
}
