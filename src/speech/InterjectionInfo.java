package speech;

import enumerations.PoS;

public class InterjectionInfo extends Word {
	
	private String text;
	private Interjection interjection;
	
	@Override
	public String getText() {
		this.setInterjection();
		return this.text;
	}
	
	@Override
	public void setText(String s) {
		this.text = s;
	}
	
	@Override
	public PoS getPart() {
		return PoS.INTERJECTION;
	}
	
	@Override
	public void setPart(PoS part) {
		this.part = part;
	}
			
	public Interjection getInterjection() {
		return this.interjection;
	}
	
	public void setInterjection() {
		this.interjection = new Interjection(this);
	}
	
}
