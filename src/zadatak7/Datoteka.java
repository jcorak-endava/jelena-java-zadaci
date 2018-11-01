package zadatak7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class Datoteka {
    
    private BufferedWriter bw;
    public Datoteka(File file) throws IOException {
        this.bw = new BufferedWriter(new FileWriter(file));   
    }
     
    public void writeToFile(Set<Student> studenti) throws IOException {   
    	for (Student s : studenti) {
    		bw.write(s.toString());
    	}       
        bw.flush();
    }  
}
