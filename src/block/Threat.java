package block;

import java.util.ArrayList;
import java.util.Random;

import enumerations.Tag;
import enumerations.Tense;

public class Threat extends BlockBlock {

	//I will kill you.				independent
	//revenge is / will be mine.	independent

	ArrayList<ArrayList<String>> list= new ArrayList<ArrayList<String>>();
	ArrayList<String> threat;
	
	public Threat(Tense tense) {
		//super(tense);
		String revenge = w(nou,Tag.REVENGE).getSingular().getText();
		String violence = w(ver,Tag.VIOLENCE).getImperative().getText();
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add(or("I", 5, "we", 1));
		list1.add(" ");
		list1.add(or("shall",2,"will",1));
		list1.add(" ");
		list1.add(violence);
		list1.add(" ");
		list1.add(or("you",1,"thee",3));
		list1.add(or(".",2,"!",1));
		list.add(list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add(revenge);
		list2.add(" ");
		list2.add(or("shall be",2,"will be",1,"is",2));
		list2.add(" ");
		list2.add(or("mine",5,"ours",1));
		list2.add(or(".",3,"!",1));
		list.add(list2);
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(list.size());
		threat = list.get(randomInt);
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < threat.size(); i++) {
			result += threat.get(i);
		}
		return result;
	}
	
}
