package command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;

public class DuplicateChecker {
	
	public void checkWordListForDuplicates(String toCheck) {
        BufferedReader reader = null;
        try {
            String filename = toCheck;
            File logFile = new File(filename);
            reader = new BufferedReader(new FileReader(logFile));
            String line = "";
            HashSet<String> baseWords = new HashSet<String>();
            while (line != null) {
            	line = reader.readLine();
            	if (baseWords.contains(line) && !line.equals("")  && !line.equals("\t")) {
            		System.out.println("DUPLICATE FOUND: " + line);
            	}
            	else {
                	baseWords.add(line);
            	}
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } 
            catch (Exception e) {}
        }

	}
	
}
