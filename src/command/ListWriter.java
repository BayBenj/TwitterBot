package command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import enumerations.PoS;

public class ListWriter {
	
	private DictionaryManager manager;
	private File file;
	private BufferedWriter bw;
	
	public ListWriter(String listFile, DictionaryManager manager) throws IOException {
		this.manager = manager;
		file = new File(listFile);
		if (!file.exists())
			file.createNewFile();
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		bw = new BufferedWriter(fw);
	}

	public void writeAll() throws IOException {    		
		writeWords("Noun", manager.getDict(PoS.NOUN));
		writeWords("Verb", manager.getDict(PoS.VERB));
		writeWords("Adjective", manager.getDict(PoS.ADJECTIVE));
		writeWords("Adverb", manager.getDict(PoS.ADVERB));
		writeWords("Pronoun", manager.getDict(PoS.PRONOUN));
		writeWords("Interjection", manager.getDict(PoS.INTERJECTION));
		writeWords("Preposition", manager.getDict(PoS.PREPOSITION));
		writeWords("Conjunction", manager.getDict(PoS.CONJUNCTION));
		bw.close();
	}
	
	private void writeWords(String s, Dictionary dict) {
        try {
    		bw.write(s + '\n');
            for (int i = 0; i < dict.getEntries().size(); i++) {
            	bw.write('\t' + dict.getEntries().get(i).getText() + '\n');
            }
            bw.write('\n');
        	/*
            File logFile = new File("vocabulary_list.txt");
            writer = new PrintWriter(logFile);
            writer.println(s);
            for (int i = 0; i < dict.getEntries().size(); i++) {
            	writer.println('\t' + dict.getEntries().get(i).getText());
            }
            */
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s + " entries:\t" + dict.getEntries().size());
	}
	
}
