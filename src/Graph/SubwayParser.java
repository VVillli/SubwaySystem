package Graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SubwayParser {
	private SubwaySystem sub;
	private File f;
	private Scanner s;
	
	public SubwayParser(String fileName) throws FileNotFoundException{
		sub = new SubwaySystem();
		f = new File(fileName);
		s = new Scanner(f);
	}
	
	public void parseFile(){
		while(s.hasNext()){
			
		}
	}
	
	public SubwaySystem getSubSys(){return sub;}
}
