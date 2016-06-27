package speech;

import enumerations.Mood;
import enumerations.Number;
import enumerations.Person;
import enumerations.PoS;
import enumerations.Tense;

public class VerbInfo extends Word {
	
	protected String infinitive = "UNDEFINED";
	protected String gerund = "UNDEFINED";
	protected String imperative = "UNDEFINED";
	protected String participle = "UNDEFINED";
	
	protected String indicativePresentFirstSing = "UNDEFINED";
	protected String indicativePresentFirstPlur = "UNDEFINED";
	protected String indicativePresentSecond = "UNDEFINED";
	protected String indicativePresentThirdSing = "UNDEFINED";
	protected String indicativePresentThirdPlur = "UNDEFINED";
	
	protected String indicativePastFirstSing = "UNDEFINED";
	protected String indicativePastFirstPlur = "UNDEFINED";
	protected String indicativePastSecond = "UNDEFINED";
	protected String indicativePastThirdSing = "UNDEFINED";
	protected String indicativePastThirdPlur = "UNDEFINED";
	
	private Verb verb;
	
	public VerbInfo(String infinitive,
					String gerund,
					String imperative,
					String participle,
					String indicativePresentFirstSing,
					String indicativePresentFirstPlur,
					String indicativePresentSecond,
					String indicativePresentThirdSing,
					String indicativePresentThirdPlur,
					String indicativePastFirstSing,
					String indicativePastFirstPlur,
					String indicativePastSecond,
					String indicativePastThirdSing,
					String indicativePastThirdPlur) {
		this.setInfinitive(infinitive);
		this.setGerund(gerund);
		this.setImperative(imperative);
		this.setParticiple(participle);
		this.setIndicativePresentFirstSing(indicativePresentFirstSing);
		this.setIndicativePresentFirstPlur(indicativePresentFirstPlur);
		this.setIndicativePresentSecond(indicativePresentSecond);
		this.setIndicativePresentThirdSing(indicativePresentThirdSing);
		this.setIndicativePresentThirdPlur(indicativePresentThirdPlur);
		this.setIndicativePastFirstSing(indicativePastFirstSing);
		this.setIndicativePastFirstPlur(indicativePastFirstPlur);
		this.setIndicativePastSecond(indicativePastSecond);
		this.setIndicativePastThirdSing(indicativePastThirdSing);
		this.setIndicativePastThirdPlur(indicativePastThirdPlur);
	}
	
	@Override
	public String getText() {
		return this.indicativePresentFirstSing;
	}
	
	@Override
	public PoS getPart() {
		return PoS.VERB;
	}
	
	@Override
	public void setPart(PoS part) {
		this.part = part;
	}
	
	@Override
	public Verb getInfinitive() {
		this.setVerb(Mood.INFINITIVE, Person.FIRST, Number.PLURAL, Tense.PAST);
		return this.verb;
	}
	
	@Override
	public void setInfinitive(String infinitive) {
		this.infinitive = infinitive;
	}

	@Override
	public Verb getGerund() {
		this.setVerb(Mood.GERUND, null, null, null);
		return this.verb;
	}

	@Override
	public void setGerund(String gerund) {
		this.gerund = gerund;
	}

	@Override
	public Verb getParticiple() {
		this.setVerb(Mood.PARTICIPLE, null, null, null);
		return this.verb;
	}

	@Override
	public void setParticiple(String participle) {
		this.participle = participle;
	}

	@Override
	public Verb getIndicativePresentFirstSing() {
		this.setVerb(Mood.INDICITAVE, Person.FIRST, Number.SINGULAR, Tense.PRESENT);
		return this.verb;
	}

	@Override
	public void setIndicativePresentFirstSing(String indicativePresentFirstSing) {
		this.indicativePresentFirstSing = indicativePresentFirstSing;
	}

	@Override
	public Verb getIndicativePresentFirstPlur() {
		this.setVerb(Mood.INDICITAVE, Person.FIRST, Number.PLURAL, Tense.PRESENT);
		return this.verb;
	}

	@Override
	public void setIndicativePresentFirstPlur(String indicativePresentFirstPlur) {
		this.indicativePresentFirstPlur = indicativePresentFirstPlur;
	}

	@Override
	public Verb getIndicativePresentSecond() {
		this.setVerb(Mood.INDICITAVE, Person.SECOND, Number.SINGULAR, Tense.PRESENT);
		return this.verb;
	}

	@Override
	public void setIndicativePresentSecond(String indicativePresentSecond) {
		this.indicativePresentSecond = indicativePresentSecond;
	}

	@Override
	public Verb getIndicativePresentThirdSing() {
		this.setVerb(Mood.INDICITAVE, Person.THIRD, Number.SINGULAR, Tense.PRESENT);
		return this.verb;
	}

	@Override
	public void setIndicativePresentThirdSing(String indicativePresentThirdSing) {
		this.indicativePresentThirdSing = indicativePresentThirdSing;
	}

	@Override
	public Verb getIndicativePresentThirdPlur() {
		this.setVerb(Mood.INDICITAVE, Person.THIRD, Number.PLURAL, Tense.PRESENT);
		return this.verb;
	}

	@Override
	public void setIndicativePresentThirdPlur(String indicativePresentThirdPlur) {
		this.indicativePresentThirdPlur = indicativePresentThirdPlur;
	}

	@Override
	public Verb getIndicativePastFirstSing() {
		this.setVerb(Mood.INDICITAVE, Person.FIRST, Number.SINGULAR, Tense.PAST);
		return this.verb;
	}

	@Override
	public void setIndicativePastFirstSing(String indicativePastFirstSing) {
		this.indicativePastFirstSing = indicativePastFirstSing;
	}

	@Override
	public Verb getIndicativePastFirstPlur() {
		this.setVerb(Mood.INDICITAVE, Person.FIRST, Number.PLURAL, Tense.PAST);
		return this.verb;
	}

	@Override
	public void setIndicativePastFirstPlur(String indicativePastFirstPlur) {
		this.indicativePastFirstPlur = indicativePastFirstPlur;
	}

	@Override
	public Verb getIndicativePastSecond() {
		this.setVerb(Mood.INDICITAVE, Person.SECOND, Number.SINGULAR, Tense.PAST);
		return this.verb;
	}

	@Override
	public void setIndicativePastSecond(String indicativePastSecond) {
		this.indicativePastSecond = indicativePastSecond;
	}

	@Override
	public Verb getIndicativePastThirdSing() {
		this.setVerb(Mood.INDICITAVE, Person.THIRD, Number.SINGULAR, Tense.PAST);
		return this.verb;
	}

	@Override
	public void setIndicativePastThirdSing(String indicativePastThirdSing) {
		this.indicativePastThirdSing = indicativePastThirdSing;
	}

	@Override
	public Verb getIndicativePastThirdPlur() {
		this.setVerb(Mood.INDICITAVE, Person.THIRD, Number.PLURAL, Tense.PAST);
		return this.verb;
	}

	@Override
	public void setIndicativePastThirdPlur(String indicativePastThirdPlur) {
		this.indicativePastThirdPlur = indicativePastThirdPlur;
	}

	@Override
	public Verb getImperative() {
		this.setVerb(Mood.IMPERATIVE, null, null, null);
		return this.verb;
	}

	@Override
	public void setImperative(String imperative) {
		this.imperative = imperative;
	}

	public Verb getVerb() {
		return verb;
	}

	public void setVerb(Mood mood, Person person, Number number, Tense tense) {
		this.verb = new Verb(this, mood, person, number, tense);
	}
	
}
