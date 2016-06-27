package command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import enumerations.PoS;
import enumerations.Tag;
import speech.Word;

public class JsonRemaker {
	
	private DictionaryManager manager;
	private File out;
	private BufferedWriter bw;
	private ArrayList<String> alreadyUsed = new ArrayList<String>();
	
	public JsonRemaker(String newJsonFile, DictionaryManager manager) throws IOException {
		this.manager = manager;	
		out = new File(newJsonFile);
		if (!out.exists())
			out.createNewFile();
		FileWriter fw = new FileWriter(out.getAbsoluteFile());
		bw = new BufferedWriter(fw);
	}

	public void writeAll() throws IOException {   
		bw.write("{ \"words\" : [");
		writeNewJson("Noun", manager.getDict(PoS.NOUN));
		writeNewJson("Verb", manager.getDict(PoS.VERB));
		writeNewJson("Adjective", manager.getDict(PoS.ADJECTIVE));
		writeNewJson("Adverb", manager.getDict(PoS.ADVERB));
		writeNewJson("Pronoun", manager.getDict(PoS.PRONOUN));
		writeNewJson("Interjection", manager.getDict(PoS.INTERJECTION));
		writeNewJson("Preposition", manager.getDict(PoS.PREPOSITION));
		writeNewJson("Conjunction", manager.getDict(PoS.CONJUNCTION));
		bw.write("\n\t]\n}\n");
		bw.close();
	}
	
	private void writeNewJson(String s, Dictionary dict) throws IOException {    		
        try {
        	for (int i = 0; i < dict.getEntries().size(); i++) {
        		Word w = dict.getEntries().get(i);
    			if (!hasDuplicateNoun(w)) {
                	bw.write("\n\t\t{\n");
                	switch(dict.getEntries().get(0).getPart()) {
            		case NOUN:
            			if (w.getTags().contains(Tag.PROPER)) {
            				bw.write("\t\t  \"singular\" : \"" + w.getSingular() + "\",\n");
                			bw.write("\t\t  \"plural\" : \"" + w.getPlural() + "\",\n");
            			}
            			else {
                			bw.write("\t\t  \"singular\" : \"" + decapitalize(w.getSingular().getText()) + "\",\n");
                			bw.write("\t\t  \"plural\" : \"" + decapitalize(w.getPlural().getText()) + "\",\n");
            			}
            			bw.write("\t\t  \"partofspeech\" : \"" + w.getPart() + "\",\n");
            			bw.write("\t\t  \"tags\" : [");
            			for (int j = 0; j < w.getTags().size(); j++) {
            				if (j >= w.getTags().size() - 1) {
            					bw.write("\"" + w.getTags().get(j) + "\"],\n");
            				}
            				else {
                				bw.write("\"" + w.getTags().get(j) + "\", ");
            				}
            			}
            			bw.write("\t\t  \"frequency\" : \"" + w.getFreq() + "\"\n\t\t},");
            			break;
            		case VERB:
            			bw.write("\t\t  \"infinitive\" : \"" + decapitalize(w.getInfinitive().getText()) + "\",\n");
            			bw.write("\t\t  \"gerund\" : \"" + decapitalize(w.getGerund().getText()) + "\",\n");
            			bw.write("\t\t  \"imperative\" : \"" + decapitalize(w.getImperative().getText()) + "\",\n");
            			bw.write("\t\t  \"participle\" : \"" + decapitalize(w.getParticiple().getText()) + "\",\n");
            			bw.write("\t\t  \"partofspeech\" : \"" + w.getPart() + "\",\n");
            			bw.write("\t\t  \"tags\" : [");
            			for (int j = 0; j < w.getTags().size(); j++) {
            				if (j >= w.getTags().size() - 1) {
            					bw.write("\"" + w.getTags().get(j) + "\"],\n");
            				}
            				else {
                				bw.write("\"" + w.getTags().get(j) + "\", ");
            				}
            			}
            			bw.write("\t\t  \"frequency\" : \"" + w.getFreq() + "\",\n");
                		bw.write("\t\t  \"indicativepresentfirstsing\" : \"" + decapitalize(w.getIndicativePresentFirstSing().getText()) + "\",\n");
                		bw.write("\t\t  \"indicativepresentfirstplur\" : \"" + decapitalize(w.getIndicativePresentFirstPlur().getText()) + "\",\n");
                		bw.write("\t\t  \"indicativepresentsecond\" : \"" + decapitalize(w.getIndicativePresentSecond().getText()) + "\",\n");
                		bw.write("\t\t  \"indicativepresentthirdsing\" : \"" + decapitalize(w.getIndicativePresentThirdSing().getText()) + "\",\n");
                		bw.write("\t\t  \"indicativepresentthirdplur\" : \"" + decapitalize(w.getIndicativePresentThirdPlur().getText()) + "\",\n");
                		bw.write("\t\t  \"indicativepastfirstsing\" : \"" + decapitalize(w.getIndicativePastFirstSing().getText()) + "\",\n");
                		bw.write("\t\t  \"indicativepastfirstplur\" : \"" + decapitalize(w.getIndicativePastFirstPlur().getText()) + "\",\n");
                		bw.write("\t\t  \"indicativepastsecond\" : \"" + decapitalize(w.getIndicativePastSecond().getText()) + "\",\n");
                		bw.write("\t\t  \"indicativepastthirdsing\" : \"" + decapitalize(w.getIndicativePastThirdSing().getText()) + "\",\n");
                		bw.write("\t\t  \"indicativepastthirdplur\" : \"" + decapitalize(w.getIndicativePastThirdPlur().getText()) + "\"\n\t\t},");
            			break;
            		case ADJECTIVE:
            			bw.write("\t\t  \"text\" : \"" + decapitalize(w.getText()) + "\",\n");
            			bw.write("\t\t  \"comparative\" : \"" + decapitalize(w.getComparative().getText()) + "\",\n");
            			bw.write("\t\t  \"superlative\" : \"" + decapitalize(w.getSuperlative().getText()) + "\",\n");
            			bw.write("\t\t  \"partofspeech\" : \"" + w.getPart() + "\",\n");
            			bw.write("\t\t  \"tags\" : [");
            			for (int j = 0; j < w.getTags().size(); j++) {
            				if (j >= w.getTags().size() - 1) {
            					bw.write("\"" + w.getTags().get(j) + "\"],\n");
            				}
            				else {
                				bw.write("\"" + w.getTags().get(j) + "\", ");
            				}
            			}
            			bw.write("\t\t  \"frequency\" : \"" + w.getFreq() + "\"\n\t\t},");
            			break;		
            		case ADVERB:
            			bw.write("\t\t  \"text\" : \"" + decapitalize(w.getText()) + "\",\n");
            			bw.write("\t\t  \"partofspeech\" : \"" + w.getPart() + "\",\n");
            			bw.write("\t\t  \"tags\" : [");
            			for (int j = 0; j < w.getTags().size(); j++) {
            				if (j >= w.getTags().size() - 1) {
            					bw.write("\"" + w.getTags().get(j) + "\"],\n");
            				}
            				else {
                				bw.write("\"" + w.getTags().get(j) + "\", ");
            				}
            			}
            			bw.write("\t\t  \"frequency\" : \"" + w.getFreq() + "\"\n\t\t},");
            			break;
            		case PREPOSITION:
            			bw.write("\t\t  \"text\" : \"" + decapitalize(w.getText()) + "\",\n");
            			bw.write("\t\t  \"partofspeech\" : \"" + w.getPart() + "\",\n");
            			bw.write("\t\t  \"tags\" : [");
            			for (int j = 0; j < w.getTags().size(); j++) {
            				if (j >= w.getTags().size() - 1) {
            					bw.write("\"" + w.getTags().get(j) + "\"],\n");
            				}
            				else {
                				bw.write("\"" + w.getTags().get(j) + "\", ");
            				}
            			}
            			bw.write("\t\t  \"frequency\" : \"" + w.getFreq() + "\"\n\t\t},");
            			break;
            		case PRONOUN:
            			if (w.getText().equals("I")) {
                			bw.write("\t\t  \"text\" : \"" + w.getText() + "\",\n");
            			}
            			else {
                			bw.write("\t\t  \"text\" : \"" + decapitalize(w.getText()) + "\",\n");
            			}
            			bw.write("\t\t  \"partofspeech\" : \"" + w.getPart() + "\",\n");
            			bw.write("\t\t  \"tags\" : [");
            			for (int j = 0; j < w.getTags().size(); j++) {
            				if (j >= w.getTags().size() - 1) {
            					bw.write("\"" + w.getTags().get(j) + "\"],\n");
            				}
            				else {
                				bw.write("\"" + w.getTags().get(j) + "\", ");
            				}
            			}
            			bw.write("\t\t  \"frequency\" : \"" + w.getFreq() + "\"\n\t\t},");
            			break;
            		case INTERJECTION:
            			bw.write("\t\t  \"text\" : \"" + decapitalize(w.getText()) + "\",\n");
            			bw.write("\t\t  \"partofspeech\" : \"" + w.getPart() + "\",\n");
            			bw.write("\t\t  \"tags\" : [");
            			for (int j = 0; j < w.getTags().size(); j++) {
            				if (j >= w.getTags().size() - 1) {
            					bw.write("\"" + w.getTags().get(j) + "\"],\n");
            				}
            				else {
                				bw.write("\"" + w.getTags().get(j) + "\", ");
            				}
            			}
            			bw.write("\t\t  \"frequency\" : \"" + w.getFreq() + "\"\n\t\t},");
            			break;
            		default:
            			System.out.println("ERROR FINDING PoS");
            			break;
                	}
    			}
        	}
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private boolean hasDuplicateNoun(Word w) {
		StringBuilder sb = new StringBuilder("");
		if (w.getTags().contains(Tag.PROPER)) {
			sb.append("\t\t  \"singular\" : \"" + w.getSingular() + "\",\n");
			sb.append("\t\t  \"plural\" : \"" + w.getPlural() + "\",\n");
		}
		else {
			sb.append("\t\t  \"singular\" : \"" + decapitalize(w.getSingular().getText()) + "\",\n");
			sb.append("\t\t  \"plural\" : \"" + decapitalize(w.getPlural().getText()) + "\",\n");
		}
		sb.append("\t\t  \"partofspeech\" : \"" + w.getPart() + "\",\n");
		sb.append("\t\t  \"tags\" : [");
		for (int j = 0; j < w.getTags().size(); j++) {
			if (j >= w.getTags().size() - 1) {
				sb.append("\"" + w.getTags().get(j) + "\"],\n");
			}
			else {
				sb.append("\"" + w.getTags().get(j) + "\", ");
			}
		}
		sb.append("\t\t  \"frequency\" : \"" + w.getFreq() + "\"\n\t\t},");
		if (alreadyUsed.contains(sb.toString())) {
			return true;
		}
		else {
			alreadyUsed.add(sb.toString());
			return false;
		}
	}
	
	private String decapitalize(String s) {
		if (s != null && !s.equals("")) {
			StringBuilder sb = new StringBuilder(s);
			char cha = sb.charAt(0);
			if (cha >= 65 && cha <= 90) {
				char newCha = (char) (cha + 32);
				sb.setCharAt(0,  newCha);
				return  sb.toString();
			}
			else {
				return s;
			}
		}
		return "";
	}
		
}
