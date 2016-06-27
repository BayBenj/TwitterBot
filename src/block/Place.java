package block;

import java.util.ArrayList;

import command.SpeechResource;
import enumerations.Tag;

public class Place extends SpeechResource {

	//an [adjective] [place]				noun
	//[name], the [adjective] [place]		noun

	private String placeName;
	private String placeAdj;
	private String placeType;
	private ArrayList<String> placeTitle = new ArrayList<String>();
	private ArrayList<String> placeDescription = new ArrayList<String>();
	private ArrayList<String> placeStory = new ArrayList<String>();
	
	public Place() {
		placeName = new Name().toString();
		placeAdj = (or((w(adj, Tag.COLOR).getRegular()), 1, (w(adj, Tag.SIGHT).getRegular()), 1, w(adj, Tag.PLACE).getRegular(), 1));
		placeType = (or(w(nou, Tag.PLACE, Tag.STRUCTURE).getSingular(), 1, w(nou, Tag.PLACE, Tag.NATURE).getSingular(), 1));
		placeStory.add("was " + w(ver, Tag.PLACE).getParticiple() + " by " + or("the ",1, "",2) + w(nou, Tag.MONSTER).getPlural());
		
		placeTitle.add(", the ");
		placeTitle.add(placeAdj);
		placeTitle.add(placeType);
	}
	
	@Override
	public String toString() {
		String result = "";
		result += placeName;
		for (int i = 0; i < placeTitle.size(); i++) {
			result += placeTitle.get(i);
		}
		return result;
	}
	
	public String getName() {
		return placeName;
	}
	
	public String getTitle() {
		String result = "";
		for (int i = 0; i < placeTitle.size(); i++) {
			result += placeTitle.get(i);
		}
		return result;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceAdj() {
		return placeAdj;
	}

	public void setPlaceAdj(String placeAdj) {
		this.placeAdj = placeAdj;
	}

	public String getPlaceType() {
		return placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}
	
}
