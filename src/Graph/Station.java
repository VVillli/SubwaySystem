package Graph;

public class Station {
	private int id;
	private String name;
	
	public Station(int i, String n){
		id = i;
		name = n;
	}
	
	public int getId(){return id;}
	public String getName(){return name;}
	public boolean equals(Object o){
		if(o instanceof Station){
			if(((Station) o).getId() == id){
				return true;
			}
		}
		return false;
	}
}
