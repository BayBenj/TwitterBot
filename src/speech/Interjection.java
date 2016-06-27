package speech;

public class Interjection extends InterjectionInfo {
	
	private InterjectionInfo interjectionInfo;
	private String text;
		
	public Interjection(InterjectionInfo interjectionInfo) {
		this.setInterjectionInfo(interjectionInfo);
	}
	
	@Override
	public String getText() {
		return text;
	}
	
	@Override
	public void setText(String text) {
		this.text = text;
	}
	
	public InterjectionInfo getInterjectionInfo() {
		return this.interjectionInfo;
	}

	public void setInterjectionInfo(InterjectionInfo interjectionInfo) {
		this.interjectionInfo = interjectionInfo;
	}

	
}
