package speech;

import enumerations.PoS;

public class AdverbInfo extends Word {
	
	private String text;
	
	@Override
	public PoS getPart() {
		return PoS.ADVERB;
	}

	@Override
	public void setPart(PoS part) {
		this.part = part;
	}

	@Override
	public String getText() {
		return this.text;
	}
	
	@Override
	public void setText(String text) {
		this.text = text;
	}
	
/*
	@Override
	public String getPart() {
		return "adverb";
	}
	
	@Override
	public void setPart() {
		part = "adverb";
	}
	*/
}
