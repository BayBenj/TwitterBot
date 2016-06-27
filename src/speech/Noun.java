package speech;

import enumerations.Number;

public class Noun extends NounInfo {
	
	private String text;
	private Number number;
	private NounInfo nounInfo;
	
	public Noun(NounInfo nounInfo, Number number) {
		super(nounInfo.singular, nounInfo.plural);
		this.nounInfo = nounInfo;
		this.number = number;
		if (this.number == Number.PLURAL) {
			this.text = this.plural;
		}
		else if (this.number == Number.SINGULAR) {
			this.text = this.singular;
		}
		if (text == null || text.equals("")) {
			System.out.println("Error loading a noun!");
		}
	}
	
	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	public NounInfo getNounInfo() {
		return nounInfo;
	}

	public void setNounInfo(NounInfo nounInfo) {
		this.nounInfo = nounInfo;
	}

}
