package speech;

import enumerations.PoS;
import enumerations.Number;

public class NounInfo extends Word {

	protected String singular = "UNINITIALIZED";
	protected String plural = "UNINITIALIZED";
	private Noun noun;
	
	public NounInfo(String singText, String plurText) {
		this.setSingular(singText);
		this.setPlural(plurText);
	}

	@Override
	public String getText() {
		if (singular.equals("UNINITIALIZED")) {
			return this.plural;
		}
		return this.singular;
	}
	
	@Override
	public PoS getPart() {
		return PoS.NOUN;
	}
	
	@Override
	public void setPart(PoS part) {
		this.part = part;
	}

	@Override
	public Noun getSingular() {
		this.setNoun(Number.SINGULAR);
		return this.noun;
	}

	@Override
	public void setSingular(String singText) {
		this.singular = singText;
	}

	@Override
	public Noun getPlural() {
		this.setNoun(Number.PLURAL);
		return this.noun;
	}
	
	@Override
	public String getPluralStr() {
		return plural;
	}

	@Override
	public void setPlural(String plural) {
		this.plural = plural;
	}

	@Override
	public void setText(String text) {
		this.singular = text;
	}

	public Noun getNoun() {
		return noun;
	}

	public void setNoun(Number number) {
		this.noun = new Noun(this, number);
	}
	
}
