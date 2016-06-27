package block;

import java.util.ArrayList;
import java.util.Random;

import enumerations.Tag;
import enumerations.Tense;

public class Oath extends BlockBlock {

	//(By, upon, in the name of, by the (body part) of (God name), by my (maybe sister's grandmother's) [weapon, body part, grave]
	protected static ArrayList<ArrayList<String>> oaths = new ArrayList<ArrayList<String>>();
	private ArrayList<String> oath;
	
	public Oath(Tense tense) {
		//super(tense);
		String name = or(w(nou,Tag.BEOWULF).getSingular(), 3, (w(nou,Tag.FAMOUS).getSingular()), 1, (w(nou,Tag.DEITY).getSingular()), 1);
		String color = or(w(adj,Tag.COLOR).getRegular() + " ", 1, (""), 1);
		String bodyPartOrWeapon = or(w(nou,Tag.BODY_PART).getSingular(), w(nou,Tag.WEAPON).getSingular());
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add(or("By ", 1, "Upon ", 1));
		list1.add(name);
		list1.add("'s ");
		list1.add(color);
		list1.add(bodyPartOrWeapon);
		oaths.add(list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("By the ");
		list2.add(color);
		list2.add(bodyPartOrWeapon);
		list2.add(" of ");
		list2.add(name);
		oaths.add(list2);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("In the name of ");
		list3.add(name);
		oaths.add(list3);

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(oaths.size());
		oath = oaths.get(randomInt);
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < oath.size(); i++) {
			result += oath.get(i);
		}
		return result;
	}
}
