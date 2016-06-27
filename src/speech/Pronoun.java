package speech;

import enumerations.Case;
import enumerations.Gender;
import enumerations.Number;
import enumerations.Person;

public class Pronoun extends PronounInfo {
	
	private PronounInfo pronounInfo;
	private Gender gender;
	private Number number;
	private Person person;
	private Case case_;
	private String text;
	
	public Pronoun(PronounInfo pronounInfo, Gender gender, Number number, Person person, Case case_) {
		super(	pronounInfo.id,
				pronounInfo.subjectiveFirstSing,
				pronounInfo.subjectiveSecond,
				pronounInfo.subjectiveThirdSingMale,
				pronounInfo.subjectiveThirdSingFemale,
				pronounInfo.subjectiveFirstPlur,
				pronounInfo.subjectiveThirdPlur,
				pronounInfo.objectiveFirstSing,
				pronounInfo.objectiveSecond,
				pronounInfo.objectiveThirdSingMale,
				pronounInfo.objectiveThirdSingFemale,
				pronounInfo.objectiveFirstPlur,
				pronounInfo.objectiveThirdPlur,
				pronounInfo.possessiveFirstSing,
				pronounInfo.possessiveSecond,
				pronounInfo.possessiveThirdSingMale,
				pronounInfo.possessiveThirdSingFemale,
				pronounInfo.possessiveFirstPlur,
				pronounInfo.possessiveThirdPlur,
				pronounInfo.reflexiveFirstSing,
				pronounInfo.reflexiveSecond,
				pronounInfo.reflexiveThirdSingMale,
				pronounInfo.reflexiveThirdSingFemale,
				pronounInfo.reflexiveFirstPlur,
				pronounInfo.reflexiveThirdPlur,
				pronounInfo.specialText);
		this.pronounInfo = pronounInfo;
		this.gender = gender;
		this.number = number;
		this.person = person;
		this.case_ = case_;
		if (this.case_ == Case.SUBJECTIVE) {
			if (this.person == Person.FIRST) {
				if (this.number == Number.SINGULAR) {
					this.text = this.subjectiveFirstSing;
				}
				else if (this.number == Number.PLURAL) {
					this.text = this.subjectiveFirstPlur;
				}
			}
			else if (this.person == Person.SECOND) {
				this.text = this.subjectiveSecond;
			}
			else if (this.person == Person.THIRD) {
				if (this.number == Number.SINGULAR) {
					if (this.gender == Gender.MALE) {
						this.text = this.subjectiveThirdSingMale;
					}
					else if (this.gender == Gender.FEMALE) {
						this.text = this.subjectiveThirdSingFemale;
					}
				}
				else if (this.number == Number.PLURAL) {
					this.text = this.subjectiveThirdPlur;
				}
			}

		}
		else if (this.case_ == Case.OBJECTIVE) {
			if (this.person == Person.FIRST) {
				if (this.number == Number.SINGULAR) {
					this.text = this.objectiveFirstSing;
				}
				else if (this.number == Number.PLURAL) {
					this.text = this.objectiveFirstPlur;
				}
			}
			else if (this.person == Person.SECOND) {
				this.text = this.objectiveSecond;
			}
			else if (this.person == Person.THIRD) {
				if (this.number == Number.SINGULAR) {
					if (this.gender == Gender.MALE) {
						this.text = this.objectiveThirdSingMale;
					}
					else if (this.gender == Gender.FEMALE) {
						this.text = this.objectiveThirdSingFemale;
					}
				}
				else if (this.number == Number.PLURAL) {
					this.text = this.objectiveThirdPlur;
				}
			}
		}
		else if (this.case_ == Case.POSSESSIVE) {
			if (this.person == Person.FIRST) {
				if (this.number == Number.SINGULAR) {
					this.text = this.possessiveFirstSing;
				}
				else if (this.number == Number.PLURAL) {
					this.text = this.possessiveFirstPlur;
				}
			}
			else if (this.person == Person.SECOND) {
				this.text = this.possessiveSecond;
			}
			else if (this.person == Person.THIRD) {
				if (this.number == Number.SINGULAR) {
					if (this.gender == Gender.MALE) {
						this.text = this.possessiveThirdSingMale;
					}
					else if (this.gender == Gender.FEMALE) {
						this.text = this.possessiveThirdSingFemale;
					}
				}
				else if (this.number == Number.PLURAL) {
					this.text = this.possessiveThirdPlur;
				}
			}
		}
		else if (this.case_ == Case.REFLEXIVE) {
			if (this.person == Person.FIRST) {
				if (this.number == Number.SINGULAR) {
					this.text = this.reflexiveFirstSing;
				}
				else if (this.number == Number.PLURAL) {
					this.text = this.reflexiveFirstPlur;
				}
			}
			else if (this.person == Person.SECOND) {
				this.text = this.reflexiveSecond;
			}
			else if (this.person == Person.THIRD) {
				if (this.number == Number.SINGULAR) {
					if (this.gender == Gender.MALE) {
						this.text = this.reflexiveThirdSingMale;
					}
					else if (this.gender == Gender.FEMALE) {
						this.text = this.reflexiveThirdSingFemale;
					}
				}
				else if (this.number == Number.PLURAL) {
					this.text = this.reflexiveThirdPlur;
				}
			}
		}
		else if (this.case_ == Case.SPECIAL) {
			this.text = this.specialText;
		}
		if (this.text == null || this.text.equals("")) {
			System.out.println("Error loading a pronoun!");
		}

	}
	
	@Override
	public String getText() {
		return text;
	}
	
	@Override
	public void setText(String text) {
		this.text = text;
	}

	public PronounInfo getPronounInfo() {
		return pronounInfo;
	}

	public void setPronounInfo(PronounInfo pronounInfo) {
		this.pronounInfo = pronounInfo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Case getCase_() {
		return case_;
	}

	public void setCase_(Case case_) {
		this.case_ = case_;
	}
	
}
