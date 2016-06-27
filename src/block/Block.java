package block;

import java.util.ArrayList;

import command.SpeechResource;
import speech.Word;

public abstract class Block extends SpeechResource {

	public abstract String recursive(Block block, String text);
	
}
