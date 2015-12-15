package Graph;

import java.util.*;

public class SubwaySystem {
	private Map<Station, List<Track>> outStation;
	
	public SubwaySystem(){
		outStation = new HashMap<>();
	}
	
	public void addStation(Station s, List<Track> out){
		outStation.put(s, out);
	}
	
	
	public List<Station> findPath(Station stationStart, Station stationEnd){
		if(outStation.get(stationStart).isEmpty()){
			return null;
		}
		
		List<Station> temp = new ArrayList<>();
		
		Queue<Station> q = new LinkedList<Station>();
		
		
		
		while(!q.isEmpty()){
			Station tempStation = q.remove();
			
			temp.add(tempStation);
			
			for(int i = 0; i < outStation.get(tempStation).size(); i++){
				for(Station s : outStation.keySet()){
					if(s.getId() == outStation.get(tempStation).get(i).getEnd()){
						q.add(s);
					}
				}
			}
			
			if(tempStation.getId() == stationEnd.getId()){
				while(!q.isEmpty()){
					q.remove();
				}
			}
		}
		
		return temp;
	}
	
	public String toString(){
		String temp = "";
		
		for(Station s : outStation.keySet()){
			temp += s.getId() + " " + s.getName() + outStation.get(s).toString() + "\n";
		}
		
		return temp;
	}
}
