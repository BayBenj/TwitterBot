package speech;

public class Determiner extends DeterminerInfo {
	
	private DeterminerInfo determinerInfo;
	private String text;
		
	public Determiner(DeterminerInfo determinerInfo) {
		this.setDeterminerInfo(determinerInfo);
	}
	
	@Override
	public String getText() {
		return text;
	}
	
	@Override
	public void setText(String text) {
		this.text = text;
	}
	
	public DeterminerInfo getDeterminerInfo() {
		return this.determinerInfo;
	}

	public void setDeterminerInfo(DeterminerInfo determinerInfo) {
		this.determinerInfo = determinerInfo;
	}

	
}
