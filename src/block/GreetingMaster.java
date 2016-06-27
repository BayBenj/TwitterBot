package block;

import java.util.ArrayList;

import command.SpeechResource;
import speech.Blank;
import speech.Comma;

public class GreetingMaster extends BlockBlock {
	
	public GreetingMaster() {
		WordBlock hello = new Greeting();
		
		WordBlock hello_good_fellow = new Greeting();
		hello_good_fellow.addWord(orW(new Comma(),2, new Blank(),1));
		//hello_good_fellow.addWord(or2(new Comma(),1, new Blank(),2));//my
		hello_good_fellow.addWords(new Greeted().getWords());
		
		this.blocks = new ArrayList<Block>();
		blocks.add((Block)SpeechResource.orO(hello,1, hello_good_fellow,1));
	}
	
}
/*

Greetings
Hail!
Hail there!
Pray tell, how fare thee on this day of providence?
Hail thou fellow!
God save ye!
Greetings, my lad!
Good morrow!

Compliment:
	Thou art faithful in deed and in word.
	I love thee dearly, my fearless ____.
*/







