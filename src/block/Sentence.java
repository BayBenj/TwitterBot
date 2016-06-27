package block;

public class Sentence {

	String text;
	
	public Sentence(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		this.text = capitalizeFirst();
		//this.text = addPeriod();
		return text;
	}
	
	private String capitalizeFirst() {
		if (text != null && !text.equals("")) {
			char cha = text.charAt(0);
			if (cha >= 97 && cha <= 122) {
				StringBuilder sb = new StringBuilder(text);
				char newCha = (char) (cha - 32);
				sb.setCharAt(0,  newCha);
				return sb.toString();
			}
		}
		return text;
	}
	
	private String addPeriod() {
		StringBuilder sb = new StringBuilder(text);
		sb.append(".");
		return sb.toString();
	}
	
}
