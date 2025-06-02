package javaprojects;
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "keerthi");
        students.put(2, "Deepthi");
        students.put(3, "Spurthi");
        students.put(4, "Janu");
        students.put(5, "Jayanthi");
        
        // Print the initial HashMap
        System.out.println(students);

        // Replace value for key 1
        students.replace(1, "bindhu");
        System.out.println(students);

        // Remove key 3
        students.remove(3);
        System.out.println(students);

 
        int keyToCheck = 1; 
        if (students.containsKey(keyToCheck)) {
            System.out.println("Key '" + keyToCheck + "' exists in the hashmap.");
        } else {
            System.out.println("Key '" + keyToCheck + "' does not exist in the hashmap.");
        }

        String valueToCheck = "Deepthi"; 
        if (students.containsValue(valueToCheck)) {
            System.out.println("Value '" + valueToCheck + "' exists in the hashmap.");
        } else {
            System.out.println("Value '" + valueToCheck + "' does not exist in the hashmap.");
        }
    }
}
