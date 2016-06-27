package speech;

import enumerations.AdjType;

public class Adjective extends AdjectiveInfo {
	
	private AdjectiveInfo adjectiveInfo;
	private AdjType adjType;
	private String text;
	
	public Adjective(AdjectiveInfo adjectiveInfo, AdjType adjType) {
		super(adjectiveInfo.regular, adjectiveInfo.comparative, adjectiveInfo.superlative);
		this.adjectiveInfo = adjectiveInfo;
		this.adjType = adjType;
		if (this.adjType == AdjType.REGULAR) {
			this.text = this.regular;
		}
		else if (this.adjType == AdjType.COMPARATIVE) {
			this.text = this.comparative;
		}
		else if (this.adjType == AdjType.SUPERLATIVE) {
			this.text = this.superlative;
		}
		if (text == null || text.equals("")) {
			System.out.println("Error loading an adjective!");
		}
	}
	
	public AdjType getAdjType() {
		return adjType;
	}
	
	public void setAdjType(AdjType adjType) {
		this.adjType = adjType;
	}
	
	@Override
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	public AdjectiveInfo getAdjectiveInfo() {
		return adjectiveInfo;
	}

	public void setAdjectiveInfo(AdjectiveInfo adjectiveInfo) {
		this.adjectiveInfo = adjectiveInfo;
	}
	
}
