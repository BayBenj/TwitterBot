package speech;

import enumerations.Case;
import enumerations.Gender;
import enumerations.Number;
import enumerations.Person;
import enumerations.PoS;

	public class PronounInfo extends Word {
	
	protected String id;
		
	protected String subjectiveFirstSing;
	protected String subjectiveSecond;
	protected String subjectiveThirdSingMale;
	protected String subjectiveThirdSingFemale;
	protected String subjectiveFirstPlur;
	protected String subjectiveThirdPlur;
	
	protected String objectiveFirstSing;
	protected String objectiveSecond;
	protected String objectiveThirdSingMale;
	protected String objectiveThirdSingFemale;
	protected String objectiveFirstPlur;
	protected String objectiveThirdPlur;

	protected String possessiveFirstSing;
	protected String possessiveSecond;
	protected String possessiveThirdSingMale;
	protected String possessiveThirdSingFemale;
	protected String possessiveFirstPlur;
	protected String possessiveThirdPlur;
	
	protected String reflexiveFirstSing;
	protected String reflexiveSecond;
	protected String reflexiveThirdSingMale;
	protected String reflexiveThirdSingFemale;
	protected String reflexiveFirstPlur;
	protected String reflexiveThirdPlur;
	
	protected String specialText;
	
	private Pronoun pronoun;
	
	public PronounInfo(	String id,
						String subjectiveFirstSing,
						String subjectiveSecond,
						String subjectiveThirdSingMale,
						String subjectiveThirdSingFemale,
						String subjectiveFirstPlur,
						String subjectiveThirdPlur,
						String objectiveFirstSing,
						String objectiveSecond,
						String objectiveThirdSingMale,
						String objectiveThirdSingFemale,
						String objectiveFirstPlur,
						String objectiveThirdPlur,
						String possessiveFirstSing,
						String possessiveSecond,
						String possessiveThirdSingMale,
						String possessiveThirdSingFemale,
						String possessiveFirstPlur,
						String possessiveThirdPlur,
						String reflexiveFirstSing,
						String reflexiveSecond,
						String reflexiveThirdSingMale,
						String reflexiveThirdSingFemale,
						String reflexiveFirstPlur,
						String reflexiveThirdPlur,
						String specialText) {
		this.setId(id);
		this.setSubjectiveFirstSing(subjectiveFirstSing);
		this.setSubjectiveSecond(subjectiveSecond);
		this.setSubjectiveThirdSingMale(subjectiveThirdSingMale);
		this.setSubjectiveThirdSingFemale(subjectiveThirdSingFemale);
		this.setSubjectiveFirstPlur(subjectiveFirstPlur);
		this.setSubjectiveThirdPlur(subjectiveThirdPlur);
		this.setObjectiveFirstSing(objectiveFirstSing);
		this.setObjectiveSecond(objectiveSecond);
		this.setObjectiveThirdSingMale(objectiveThirdSingMale);
		this.setObjectiveThirdSingFemale(objectiveThirdSingFemale);
		this.setObjectiveFirstPlur(objectiveFirstPlur);
		this.setObjectiveThirdPlur(objectiveThirdPlur);
		this.setPossessiveFirstSing(possessiveFirstSing);
		this.setPossessiveSecond(possessiveSecond);
		this.setPossessiveThirdSingMale(possessiveThirdSingMale);
		this.setPossessiveThirdSingFemale(possessiveThirdSingFemale);
		this.setPossessiveFirstPlur(possessiveFirstPlur);
		this.setPossessiveThirdPlur(possessiveThirdPlur);
		this.setReflexiveFirstSing(reflexiveFirstSing);
		this.setReflexiveSecond(reflexiveSecond);
		this.setReflexiveThirdSingMale(reflexiveThirdSingMale);
		this.setReflexiveThirdSingFemale(reflexiveThirdSingFemale);
		this.setReflexiveFirstPlur(reflexiveFirstPlur);
		this.setReflexiveThirdPlur(reflexiveThirdPlur);
		this.setSpecialText(specialText);
	}
	
	@Override
	public String getText() {
		return this.specialText;
	}
	
	@Override
	public PoS getPart() {
		return PoS.PRONOUN;
	}
	
	@Override
	public void setPart(PoS part) {
		this.part = part;
	}

	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public Pronoun getSubjectiveFirstSing() {
		this.setPronoun(null, Number.SINGULAR, Person.FIRST, Case.SUBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setSubjectiveFirstSing(String subjectiveFirstSing) {
		this.subjectiveFirstSing = subjectiveFirstSing;
	}

	@Override
	public Pronoun getSubjectiveSecond() {
		this.setPronoun(null, null, Person.SECOND, Case.SUBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setSubjectiveSecond(String subjectiveSecond) {
		this.subjectiveSecond = subjectiveSecond;
	}

	@Override
	public Pronoun getSubjectiveThirdSingMale() {
		this.setPronoun(Gender.MALE, Number.SINGULAR, Person.THIRD, Case.SUBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setSubjectiveThirdSingMale(String subjectiveThirdSingMale) {
		this.subjectiveThirdSingMale = subjectiveThirdSingMale;
	}

	@Override
	public Pronoun getSubjectiveThirdSingFemale() {
		this.setPronoun(Gender.FEMALE, Number.SINGULAR, Person.THIRD, Case.SUBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setSubjectiveThirdSingFemale(String subjectiveThirdSingFemale) {
		this.subjectiveThirdSingFemale = subjectiveThirdSingFemale;
	}

	@Override
	public Pronoun getSubjectiveFirstPlur() {
		this.setPronoun(null, Number.PLURAL, Person.FIRST, Case.SUBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setSubjectiveFirstPlur(String subjectiveFirstPlur) {
		this.subjectiveFirstPlur = subjectiveFirstPlur;
	}

	@Override
	public Pronoun getSubjectiveThirdPlur() {
		this.setPronoun(null, Number.PLURAL, Person.THIRD, Case.SUBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setSubjectiveThirdPlur(String subjectiveThirdPlur) {
		this.subjectiveThirdPlur = subjectiveThirdPlur;
	}

	@Override
	public Pronoun getObjectiveFirstSing() {
		this.setPronoun(null, Number.SINGULAR, Person.FIRST, Case.OBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setObjectiveFirstSing(String objectiveFirstSing) {
		this.objectiveFirstSing = objectiveFirstSing;
	}

	@Override
	public Pronoun getObjectiveSecond() {
		this.setPronoun(null, null, Person.SECOND, Case.OBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setObjectiveSecond(String objectiveSecond) {
		this.objectiveSecond = objectiveSecond;
	}

	@Override
	public Pronoun getObjectiveThirdSingMale() {
		this.setPronoun(Gender.MALE, Number.SINGULAR, Person.THIRD, Case.OBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setObjectiveThirdSingMale(String objectiveThirdSingMale) {
		this.objectiveThirdSingMale = objectiveThirdSingMale;
	}

	@Override
	public Pronoun getObjectiveThirdSingFemale() {
		this.setPronoun(Gender.FEMALE, Number.SINGULAR, Person.THIRD, Case.OBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setObjectiveThirdSingFemale(String objectiveThirdSingFemale) {
		this.objectiveThirdSingFemale = objectiveThirdSingFemale;
	}

	@Override
	public Pronoun getObjectiveFirstPlur() {
		this.setPronoun(null, Number.PLURAL, Person.FIRST, Case.OBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setObjectiveFirstPlur(String objectiveFirstPlur) {
		this.objectiveFirstPlur = objectiveFirstPlur;
	}

	@Override
	public Pronoun getObjectiveThirdPlur() {
		this.setPronoun(null, Number.PLURAL, Person.THIRD, Case.OBJECTIVE);
		return this.pronoun;
	}

	@Override
	public void setObjectiveThirdPlur(String objectiveThirdPlur) {
		this.objectiveThirdPlur = objectiveThirdPlur;
	}

	@Override
	public Pronoun getPossessiveFirstSing() {
		this.setPronoun(null, Number.SINGULAR, Person.FIRST, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setPossessiveFirstSing(String possessiveFirstSing) {
		this.possessiveFirstSing = possessiveFirstSing;
	}

	@Override
	public Pronoun getPossessiveSecond() {
		this.setPronoun(null, null, Person.SECOND, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setPossessiveSecond(String possessiveSecond) {
		this.possessiveSecond = possessiveSecond;
	}

	@Override
	public Pronoun getPossessiveThirdSingMale() {
		this.setPronoun(Gender.MALE, Number.SINGULAR, Person.THIRD, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setPossessiveThirdSingMale(String possessiveThirdSingMale) {
		this.possessiveThirdSingMale = possessiveThirdSingMale;
	}

	@Override
	public Pronoun getPossessiveThirdSingFemale() {
		this.setPronoun(Gender.FEMALE, Number.SINGULAR, Person.THIRD, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setPossessiveThirdSingFemale(String possessiveThirdSingFemale) {
		this.possessiveThirdSingFemale = possessiveThirdSingFemale;
	}

	@Override
	public Pronoun getPossessiveFirstPlur() {
		this.setPronoun(null, Number.PLURAL, Person.FIRST, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setPossessiveFirstPlur(String possessiveFirstPlur) {
		this.possessiveFirstPlur = possessiveFirstPlur;
	}

	@Override
	public Pronoun getPossessiveThirdPlur() {
		this.setPronoun(null, Number.PLURAL, Person.THIRD, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setPossessiveThirdPlur(String possessiveThirdPlur) {
		this.possessiveThirdPlur = possessiveThirdPlur;
	}
	
	@Override
	public Pronoun getReflexiveFirstSing() {
		this.setPronoun(null, Number.SINGULAR, Person.FIRST, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setReflexiveFirstSing(String reflexiveFirstSing) {
		this.reflexiveFirstSing = reflexiveFirstSing;
	}

	@Override
	public Pronoun getReflexiveSecond() {
		this.setPronoun(null, null, Person.SECOND, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setReflexiveSecond(String reflexiveSecond) {
		this.reflexiveSecond = reflexiveSecond;
	}

	@Override
	public Pronoun getReflexiveThirdSingMale() {
		this.setPronoun(Gender.MALE, Number.SINGULAR, Person.THIRD, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setReflexiveThirdSingMale(String reflexiveThirdSingMale) {
		this.reflexiveThirdSingMale = reflexiveThirdSingMale;
	}

	@Override
	public Pronoun getReflexiveThirdSingFemale() {
		this.setPronoun(Gender.FEMALE, Number.SINGULAR, Person.THIRD, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setReflexiveThirdSingFemale(String reflexiveThirdSingFemale) {
		this.reflexiveThirdSingFemale = reflexiveThirdSingFemale;
	}

	@Override
	public Pronoun getReflexiveFirstPlur() {
		this.setPronoun(null, Number.PLURAL, Person.FIRST, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setReflexiveFirstPlur(String reflexiveFirstPlur) {
		this.reflexiveFirstPlur = reflexiveFirstPlur;
	}

	@Override
	public Pronoun getReflexiveThirdPlur() {
		this.setPronoun(null, Number.PLURAL, Person.THIRD, Case.POSSESSIVE);
		return this.pronoun;
	}

	@Override
	public void setReflexiveThirdPlur(String reflexiveThirdPlur) {
		this.reflexiveThirdPlur = reflexiveThirdPlur;
	}
	
	@Override
	public Pronoun getSpecialText() {
		this.setPronoun(null, null, null, Case.SPECIAL);
		return this.pronoun;
	}
	
	public String grabSpecialText() {
		return this.specialText;
	}

	@Override
	public void setSpecialText(String specialText) {
		this.specialText = specialText;
	}

	public Pronoun getPronoun() {
		return pronoun;
	}
	
	public void setPronoun(Gender gender, Number number, Person person, Case case_) {
		this.pronoun = new Pronoun(this, gender, number, person, case_);
	}
	
}
