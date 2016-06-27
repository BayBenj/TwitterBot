package block;

import java.util.ArrayList;

import command.SpeechResource;
import enumerations.Tag;

public class Name extends SpeechResource {

	//an [adjective] [place]				noun
	//[name], the [adjective] [place]		noun

	ArrayList<ArrayList<String>> list= new ArrayList<ArrayList<String>>();
	ArrayList<String> name;
	
	public Name() {
		ArrayList<String> name = new ArrayList<String>();
		
		name.add(or(w(nou, Tag.PROPER, Tag.BIBLE).getSingular(), 9, w(nou, Tag.PROPER, Tag.TOLKIEN).getSingular(), 3, w(nou, Tag.PROPER, Tag.BEOWULF).getSingular(),1));
		name.add(or("", 4, "-" + w(nou, Tag.PROPER).getSingular(), 1, " " + w(nou, Tag.PROPER).getSingular(), 1));
		
		this.name = name;
		
		//list.add(name);
		//list.add(title);
				
		//Random randomGenerator = new Random();
		//int randomInt = randomGenerator.nextInt(list.size());
		//place = list.get(randomInt);
	}
	
	/*
	private String delete(String s) {
		StringBuilder sb = new StringBuilder(s);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(s.length());
		sb.deleteCharAt(randomInt);
		return sb.toString();
	}
	
	private String swap(String s) {
		StringBuilder sb = new StringBuilder(s);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(s.length());
        char l = sb.charAt(randomInt);
        randomInt = randomGenerator.nextInt(s.length());
        char r = sb.charAt(randomInt);
        sb.setCharAt(i, r);
        sb.setCharAt(i + 1, l);
		String newString = newStringB.toString();
		map.put(newString, 0);
		
		return sb.toString();
	}
	*/
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < name.size(); i++) {
			result += name.get(i);
		}
		return result;
	}
	/*
	public String getName() {
		String result = "";
		for (int i = 0; i < placeName.size(); i++) {
			result += placeName.get(i);
		}
		return result;
	}
	
	public String getTitle() {
		String result = "";
		for (int i = 0; i < placeTitle.size(); i++) {
			result += placeTitle.get(i);
		}
		return result;
	}
	*/
}
