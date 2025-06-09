package javaprojects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SimpleBfsExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String>> house=new HashMap<String,List<String>>();
		house.put("Entrance",Arrays.asList("Reptile House","Bird Sanctuary","Mammal Zone"));
		house.put("Reptile House",Arrays.asList("Snake Pit"));
		house.put("Bird Sanctuary",Arrays.asList("Parrot Pavilion"));
		house.put("Mammal Zone",Arrays.asList("Lion Den","Elephant Enclosure"));
		house.put("Snake Pit",new ArrayList<String>());
		house.put("Parrot Pavilion",new ArrayList<String>());
		house.put("Lion Den",new ArrayList<String>());
		house.put("Elephant Enclosure",new ArrayList<String>());
		System.out.println("Exploring the house using BFS starting from Entrance");
		bfs(house,"Entrance");
	}

	public static void bfs(Map<String, List<String>> house, String startRoom) {
		Queue<String> queue=new LinkedList<>();
		Set<String> visited=new HashSet<>();
		queue.add(startRoom);
		visited.add(startRoom);
		while(!queue.isEmpty()) {
			String currentRoom=queue.poll();
			System.out.println("Visited"+currentRoom);
			for(String neighbor:house.get(currentRoom)) {
				 if (!visited.contains(neighbor)) {
	                    queue.add(neighbor);
	                    visited.add(neighbor);
	              }
			}
		}
		
	}
}
