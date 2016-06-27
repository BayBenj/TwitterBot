package command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import enumerations.Tag;

public class ListToJson {
	
	private File out;
	private BufferedWriter bw;
	private String txtListFile;
	
	public ListToJson(String txtListFile, String newJsonFile) throws IOException {
		this.txtListFile = txtListFile;
		out = new File(newJsonFile);
		if (!out.exists())
			out.createNewFile();
		FileWriter fw = new FileWriter(out.getAbsoluteFile());
		bw = new BufferedWriter(fw);
	}
	
	public void readTags() {
		try {
			bw.write("{ \"words\" : [\n");
			//FileReader reader = new FileReader("/Users/Benjamin/Documents/workspace/FantasyTwitterBot/lands.txt");
			//BufferedReader buffered = new BufferedReader(reader);
			Scanner scanner = new Scanner(new File(txtListFile));
			while(scanner.hasNext()) {
				//System.out.println(line);
				String word = scanner.next();
				setUpNOUN(word, Tag.INSULT);
			}
			bw.write("\t\t{\n" +
					"\t\t  \"text\" : \"delete this\",\n" +
					"\t\t  \"partofspeech\" : \"ARTICLE\",\n" +
					"\t\t  \"tags\" : [\"NA\"],\n" +
					"\t\t  \"frequency\" : \"COMMON\"\n" +
					"\t\t}\n\t]\n}"
					);
		
			scanner.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	private void setUpNOUN(String s, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"singular\" : \"" + s + "\",\n" +
				"\t\t  \"plural\" : \"" + s + "s\",\n" +
				"\t\t  \"partofspeech\" : \"NOUN\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\"\n" +
				"\t\t},\n"
				);
	}
	
	private void setUpVERB(String s, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"infinitive\" : \"to " + s + "\",\n" +
				"\t\t  \"gerund\" : \"" + s + "ing\",\n" +
				"\t\t  \"imperative\" : \"" + s + "\",\n" +
				"\t\t  \"participle\" : \"" + s + "ed\",\n" +
				"\t\t  \"partofspeech\" : \"VERB\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\",\n" +
				"\t\t  \"present\" : \"" + s + "\",\n" +
				"\t\t  \"indicativepresentfirstsing\" : \"\",\n" +
				"\t\t  \"indicativepresentfirstplur\" : \"\",\n" +
				"\t\t  \"indicativepresentsecond\" : \"\",\n" +
				"\t\t  \"indicativepresentthirdsing\" : \"\",\n" +
				"\t\t  \"indicativepresentthirdplur\" : \"\",\n" +
				"\t\t  \"past\" : \"" + s + "ed\",\n" +
				"\t\t  \"indicativepastfirstsing\" : \"\",\n" +
				"\t\t  \"indicativepastfirstplur\" : \"\",\n" +
				"\t\t  \"indicativepastsecond\" : \"\",\n" +
				"\t\t  \"indicativepastthirdsing\" : \"\",\n" +
				"\t\t  \"indicativepastthirdplur\" : \"\"\n" +
				"\t\t},\n"
				);
	}
	
	private void setUpADJECTIVE(String s, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"text\" : \"" + s + "\",\n" +
				"\t\t  \"comparative\" : \"more " + s + "\",\n" +
				"\t\t  \"superlative\" : \"most " + s + "\",\n" +
				"\t\t  \"partofspeech\" : \"ADJECTIVE\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\"\n" +
				"\t\t},\n"
				);
	}

	private void setUpAdverb(String s, String part, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"text\" : \"" + s + "\",\n" +
				"\t\t  \"partofspeech\" : \"ADVERB\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\"\n" +
				"\t\t},\n"
				);
	}

	private void setUpArticle(String s, String part, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"text\" : \"" + s + "\",\n" +
				"\t\t  \"partofspeech\" : \"ARTICLE\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\"\n" +
				"\t\t},\n"
				);
	}

	private void setUpInterjection(String s, String part, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"text\" : \"" + s + "\",\n" +
				"\t\t  \"partofspeech\" : \"INTERJECTION\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\"\n" +
				"\t\t},\n"
				);
	}

	private void setUpParticiple(String s, String part, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"text\" : \"" + s + "\",\n" +
				"\t\t  \"partofspeech\" : \"PARTICIPLE\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\"\n" +
				"\t\t},\n"
				);
	}

	private void setUpPRONOUN(String s, String part, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"text\" : \"" + s + "\",\n" +
				"\t\t  \"partofspeech\" : \"PRONOUN\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\"\n" +
				"\t\t},\n"
				);
	}

	private void setUpPREPOSITION(String s, String part, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"text\" : \"" + s + "\",\n" +
				"\t\t  \"partofspeech\" : \"PREPOSITION\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\"\n" +
				"\t\t},\n"
				);
	}
			
	private void setUpConjunction(String s, String part, Tag tag) throws IOException {
		bw.write("\t\t{\n" +
				"\t\t  \"text\" : \"" + s + "\",\n" +
				"\t\t  \"partofspeech\" : \"CONJUNCTION\",\n" +
				"\t\t  \"tags\" : [\"" + tag + "\"],\n" +
				"\t\t  \"frequency\" : \"COMMON\"\n" +
				"\t\t}"
				);
	}				
}
