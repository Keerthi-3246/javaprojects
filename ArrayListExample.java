package javaprojects;
import java.util.ArrayList; // Import the correct ArrayList

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Kerala");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Anantapur");
        System.out.println(cities);
        cities.set(0, "Chennai");
        System.out.println(cities);
        cities.remove(1);
        System.out.println(cities);
        System.out.println();
        
    }
}
