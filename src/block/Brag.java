package block;

import java.util.ArrayList;

import enumerations.PoS;
import enumerations.Tag;
import enumerations.Tense;

public class Brag extends BlockBlock {

	//an [adjective] [place]				noun
	//[name], the [adjective] [place]		noun

	ArrayList<ArrayList<String>> list= new ArrayList<ArrayList<String>>();
	ArrayList<String> brag;
	
	public Brag(Tense tense) {
		//super(tense);
		String participle = w(PoS.VERB, Tag.SIGHT).getParticiple().getText();
		String past = w(PoS.VERB, Tag.SIGHT).getIndicativePastFirstSing().getText();
		String monsters = w(PoS.NOUN, Tag.MONSTER).getPlural().getText();
		
		ArrayList<String> name = new ArrayList<String>();
		name.add(or(or("In my mind ", 2, "In my heart ", 1, "In vision ", 1), 1, "", 5));
		name.add("I ");
		name.add(or("have " + participle, 1, past, 4));
		name.add(" ");
		name.add(new Place().toString());
		name.add(or(" of " + monsters, 1, "", 2));
		name.add(".");
		
		brag = name;
		
		//list.add(name);
		//list.add(title);
				
		//Random randomGenerator = new Random();
		//int randomInt = randomGenerator.nextInt(list.size());
		//place = list.get(randomInt);
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < brag.size(); i++) {
			result += brag.get(i);
		}
		return result;
	}

}
