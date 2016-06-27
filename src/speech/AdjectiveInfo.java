package speech;

import enumerations.AdjType;
import enumerations.PoS;

public class AdjectiveInfo extends Word {
	
	protected String regular;
	protected String comparative;
	protected String superlative;
	private Adjective adjective;
	
	public AdjectiveInfo(String regular, String comparative, String superlative) {
		this.setRegular(regular);
		this.setComparative(comparative);
		this.setSuperlative(superlative);
	}
	
	@Override
	public String getText() {
		if (this.adjective == null) {
			return "[Adjective for " + this.regular + " not yet created]";
		}
		else if (this.adjective.getText() == null) {
			return "[Adjective's text still null]";
		}
		return this.adjective.getText();
	}
	
	@Override
	public PoS getPart() {
		return PoS.ADJECTIVE;
	}

	@Override
	public void setPart(PoS part) {
		this.part = part;
	}

	@Override
	public Adjective getRegular() {
		this.setAdjective(AdjType.REGULAR);
		return this.adjective;
	}
	
	@Override
	public void setRegular(String Regular) {
		this.regular = Regular;
	}
	
	@Override
	public Adjective getComparative() {
		this.setAdjective(AdjType.COMPARATIVE);
		return this.adjective;
	}
	
	@Override
	public void setComparative(String comparative) {
		this.comparative = comparative;
	}
	
	@Override
	public Adjective getSuperlative() {
		this.setAdjective(AdjType.SUPERLATIVE);
		return this.adjective;
	}
	
	@Override
	public void setSuperlative(String superlative) {
		this.superlative = superlative;
	}

	public Adjective getAdjective() {
		return adjective;
	}

	public void setAdjective(AdjType adjType) {
		this.adjective = new Adjective(this, adjType);
	}
	
}
