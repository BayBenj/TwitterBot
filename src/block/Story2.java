package block;

import java.util.ArrayList;

import enumerations.Tag;
import enumerations.Tense;

public class Story2 extends BlockBlock {

	ArrayList<String> story1 = new ArrayList<String>();
	String chosen = "NOT YET CHOSEN";
	
	public Story2(Tense tense) {
		//super(tense);
		String role = w(nou,Tag.ROLE).getSingular().getText();
		String verb = w(ver,Tag.HEAL).getIndicativePresentThirdSing().getText();
		String disease = w(nou,Tag.DISEASE).getSingular().getText();
		String generalDisease = w(nou,Tag.GENERAL_DISEASE).getSingular().getText();
		
		story1.add(aOrAn(role) + " " + role + " ");
		story1.add(or("invents",2, "discovers",2, "finds",2, "creates",1, "makes",1, "concocts",2, "brews",2) + " a potion that ");
		story1.add(verb + " ");
		story1.add(or(disease,1, generalDisease,1) + ".");
		chosen = or(arrayToString(story1),1);
	}
	
	@Override
	public String toString() {
		return chosen;
	}
	
}
//	[someone] [invents, discovers, casts] [a potion, spell] that [does something]. It [description].
