package command;

import java.io.IOException;

import block.*;
import enumerations.Tense;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Main {
	
	public static void main(String[] args) throws IOException, TwitterException {
//------------creates dictionary objects------------------------------------------------------------------------------------------------------------------------
		
		DictionaryManager manager = new DictionaryManager("/Users/Benjamin/Documents/workspace/FantasyTwitterBot/master.json");
		manager.readJson();
		
//------------uses dictionary objects to make .txt file listing entries---------------------------------------------------------------------------------------------------------
		
		//ListWriter writer = new ListWriter("master_JSONdictionary_vocabulary_list.txt", manager);
		//writer.writeAll();
		
//------------uses .txt file to check for duplicates------------------------------------------------------------------------------------------------------------
		
		//DuplicateChecker checker = new DuplicateChecker();
		//checker.checkWordListForDuplicates("master_JSONdictionary_vocabulary_list.txt");
		
//------------uses .txt file to create new JSON (warning: don't overwrite original json)------------------------------------------------------------------------
		
		//ListToJson list = new ListToJson("insults.txt", "insults.json");
		//list.readTags();
		
//------------uses dictionary objects to write new, more organized json (warning: don't overwrite original json)------------------------------------------------

		//JsonRemaker remaker = new JsonRemaker("master.json", manager);
		//remaker.writeAll();
		
//------------uses .txt file of tags from a xerox tool to create a new json file (warning: don't overwrite original json)---------------------------------------

		//XeroxTagsToJson tagtojson = new XeroxTagsToJson("bible_women.txt", "bible_women.json");
		//tagtojson.readTags();
		
//------------print statements----------------------------------------------------------------------------------------------------------------------------------

		SpeechResource.manager = manager;
		//System.out.println(new Sentence(new Story1(Tense.PAST).toString()));
		//System.out.println(new Sentence(new Story2(Tense.PRESENT).toString()));
		//System.out.println(new Sentence(new InsultStory(Tense.PRESENT).toString()));
		//System.out.println(new Sentence(new InsultStory(Tense.PRESENT).string()));
		System.out.println(new GreetingMaster().string());
		//InsultStory tweet = new InsultStory(Tense.PRESENT);
		//Monster monster = new Monster();
		//System.out.println("The " + monster.getMonsterType().getSingular() + " " + monster.getVerb().getIndicativePresentThirdSing() + ".");
		//Place place = new Place();
		//Oath oath = new Oath();
		//Threat threat = new Threat();
		//Brag brag = new Brag();
		//System.out.println(oath.toString() + ", " + threat.toString());
		//System.out.println(brag.toString());

//------------accesses the twitter API using my twitter4j.properties file---------------------------------------------------------------------------------------
		
        //Twitter twitter = TwitterFactory.getSingleton();
        //Status status = twitter.updateStatus(tweet.toString());
	}
	
}
