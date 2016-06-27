package block;

import java.util.ArrayList;

import enumerations.PoS;
import enumerations.Tag;
import enumerations.Tense;

public class InsultStory extends BlockBlock {

	InsultName insult = new InsultName();
	ArrayList<String> story1 = new ArrayList<String>();
	ArrayList<String> story2 = new ArrayList<String>();
	ArrayList<String> story3 = new ArrayList<String>();
	String chosen = "NOT YET CHOSEN";
	
	public InsultStory(Tense tense) {
		//super(tense);
		String violenced = w(ver, Tag.VIOLENCE).getParticiple().getText();
		
		String command = or(or("duel",1, "fight",1, "face",1) + " me",1, or("surrender",1, "bow before me",1, "kneel before me",1),1);
		String command2 = or("surrender ",2, "deliver ",1, "deliver up ",1, "relinquish ",2, "yield ",2);
		String possession = or("riches",1, "lands",1, "wealth",1, "property",1, "fields",1);
		String fullInsult = insult.getAdj().getText() + " " + insult.getNoun().getText();
		String halfInsult = insult.getNoun().getText();
		String insultChoice = or(fullInsult,3, halfInsult,1);
		String punctuation = or(".",1,"!",3);
		String secondP = or("thou ",12, "you ",5);
		String consequence = or((not1verb(Tag.WATER, Tag.DEATH).getImperative().getText()),1, "be " + violenced,3);

		story1.add(command + " or ");
		story1.add(consequence);
		story1.add(", ");
		story1.add(secondP + insultChoice);
		story1.add(punctuation);
		
		story2.add("I prithee ");
		story2.add(command);
		story2.add(", ");
		story2.add(secondP + fullInsult);
		story2.add(punctuation);
		
		story3.add(or("Thou hast ",12, "You have ",5) + or("proven",1, "shown",1, "confirmed",1, "justified",1, "affirmed",1, "declared",1, "upheld",1));//, "testified",1, "witnessed",1));
		story3.add(or(" thyself",3, " yourself",1) + or (" to be ",1, " ",8));
		story3.add(or(aOrAn(insultChoice) + " ",18, "the ",1, "",1) + insultChoice);
		story3.add(punctuation);
		
		chosen = or(arrayToString(story1),1, arrayToString(story2),1, arrayToString(story3),1);
	}
	
	@Override
	public String toString() {
		return chosen;
	}
	
}
// [duel me] or [die], thou [vile] [whoremongerer] [!]
// deliver/return/surrender the hostages
// deliver the princess
// surrender
// deliver your armies

// die, perish
// 



// if thou persistesth in thy [], I shall slay thee.

