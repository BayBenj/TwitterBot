package block;

import java.util.ArrayList;

import enumerations.Tag;

public class Insult extends BlockBlock {

	InsultName insult = new InsultName();
	ArrayList<String> insult1 = new ArrayList<String>();
	ArrayList<String> insult2 = new ArrayList<String>();
	ArrayList<String> insult3 = new ArrayList<String>();
	String chosen = "NOT YET CHOSEN";
	
	public Insult() {
		//super(tense);
		String violenced = w(ver, Tag.VIOLENCE).getParticiple().getText();
		
		String command = or(or("duel",1, "fight",1, "face",1) + " me",1, or("surrender",1, "bow before me",1, "kneel before me",1),1);
		String command2 = or("surrender ",2, "deliver ",1, "deliver up ",1, "relinquish ",2, "yield ",2);
		String possession = or("riches",1, "lands",1, "wealth",1, "property",1, "fields",1);
		String fullInsult = insult.getAdj().getText() + " " + insult.getNoun().getText();
		String halfInsult = insult.getNoun().getText();
		String punctuation = or(".",1,"!",3);
		String secondP = or("thou ",12, "you ",5);
		String consequence = or((not1verb(Tag.WATER, Tag.DEATH).getImperative()),1, "be " + violenced,3);

		insult1.add(secondP + " ");
		insult1.add(secondP + or(fullInsult,3, halfInsult,1));
		insult1.add(punctuation);
		
		insult2.add("I prithee ");
		insult2.add(command);
		insult2.add(", ");
		insult2.add(secondP + fullInsult);
		insult2.add(punctuation);
		
		insult3.add(secondP + " hast " + or("proven",1, "shown",1, "confirmed",1, "justified",1, "affirmed",1, "declared",1, "upheld",1, "testified",1, "witnessed",1));
		insult3.add(or(" thyself",3, " yourself",1) + or (" to be",1, "",1));
		insult3.add(or("a",8, "the",1, "",1) + or(fullInsult,3, halfInsult,1));
		
		
		//story3.add("If " + or("thou ",7, "you ",1));
		chosen = or(arrayToString(insult1),1, arrayToString(insult2),1, arrayToString(insult3),1);
	}
	
	@Override
	public String toString() {
		return chosen;
	}
	
}

/*
Thou ____!
Thou art (ever) (a ____, ____).
Thou wast a ____.
Thou hast ever been a ____.
Thou hast (proven, shown, confirmed, justified, affirmed, declared, upheld, testified, witnessed) thyself (to be) a ____.
(90% of time have a, 1 have the, 9% have nothing) [insult noun]
[insult adjective]
[insult adjective] and [insult adjective]
[insult adjective], nay, [insult adjective]!
a [# insult adjectives] [insult noun]
	80% 		1 adjective
	16% 		2 adjectives
	3.2% 	3 adjectives

 */
