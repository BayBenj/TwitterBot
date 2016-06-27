package block;

import java.util.ArrayList;

import enumerations.Tag;
import enumerations.Tense;

public class Story1 extends BlockBlock {

	ArrayList<String> story1 = new ArrayList<String>();
	ArrayList<String> story2 = new ArrayList<String>();
	ArrayList<String> story3 = new ArrayList<String>();
	String chosen = "NOT YET CHOSEN";
	
	public Story1(Tense tense) {
		//super(tense);
		int year = rnd.nextInt(9) + 1;
		String seer = or("man ",1, "soul ",1, "eye ",1, "thing ",1);
		Name name = new Name();
		Place place = new Place();
		String verb1 = w(ver,Tag.PLACE).getParticiple().getText();
		String verb2 = w(ver,Tag.SIGHT).getParticiple().getText();
		
		story1.add("For " + Num.convert(year) + or(" hundred ",2, " thousand ",1) + "years ");
		story1.add(or(or("not " + aOrAn(seer) + " ",1, "nary " + aOrAn(seer) + " ",1) + seer,5, "none ",2, "not a one",1));
		story1.add("hath ");
		story1.add(verb2 + " ");
		story1.add(name.toString() + ", the ");
		story1.add(place.getPlaceType() + " ");
		story1.add("that was " + verb1 + " by " + or("the ",1, "",2) + new Monster().getType().getPlural() + ".");
		
		story2.add(or(or("Not " + aOrAn(seer) + " ",1, "Nary " + aOrAn(seer) + " ",1) + seer,5,"None ",2));
		story2.add("hath ");
		story2.add(verb2 + " ");
		story2.add(name.toString() + ", the ");
		story2.add(place.getPlaceType() + " ");
		story2.add("that was " + verb1 + " by " + or("the ",1, "",2) + new Monster().getType().getPlural() + ", ");
		story2.add("for " + Num.convert(year) + or(" hundred ",2, " thousand ",1) + "years.");
		
		story3.add(or(or("Not " + aOrAn(seer) + " ",1, "Nary " + aOrAn(seer) + " ",1) + seer,5,"None ",2));
		story3.add("hath ");
		story3.add(verb2 + " ");
		story3.add(name.toString() + ", the " + place.getPlaceAdj() + " ");
		story3.add(place.getPlaceType() + " ");
		story3.add("that was " + verb1 + " by " + or("the ",1, "",2) + new Monster().getType().getPlural() + ".");
				
		chosen = or(arrayToString(story1),2, arrayToString(story2),1, arrayToString(story3),2);
	}
	
	@Override
	public String toString() {
		return chosen;
	}
	
}

//For three-hundred years [no one] has seen ______, the gate of dreams that was blessed by the elves.