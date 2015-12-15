package Graph;

public class Track {
	private int startStation;
	private int endStation;
	private String color;
	
	public Track(int s, int e, String c){
		startStation = s;
		endStation = e;
		color = c;
	}
	
	public int getStart(){return startStation;}
	public int getEnd(){return endStation;}
	public String getColor(){return color;}
	
	public String toString(){return color + " " + startStation + "-" + endStation;}
}
