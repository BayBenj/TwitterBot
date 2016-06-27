package speech;

import enumerations.PoS;

public class DeterminerInfo extends Word {
	
	private String text;
	private Determiner determiner;
	
	@Override
	public String getText() {
		this.setDeterminer();
		return this.text;
	}
	
	@Override
	public void setText(String s) {
		this.text = s;
	}
	
	@Override
	public PoS getPart() {
		return PoS.DETERMINER;
	}
	
	@Override
	public void setPart(PoS part) {
		this.part = part;
	}
			
	public Determiner getDeterminer() {
		return this.determiner;
	}
	
	public void setDeterminer() {
		this.determiner = new Determiner(this);
	}
	
}
