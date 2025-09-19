package day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapOperation {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> map = new HashMap<>();

        //  put(key, value) 
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        

        System.out.println("Map after put: " + map);

        //  get(key) 
        System.out.println("Value for key 1: " + map.get(1));

        //  remove(key) 
        map.remove(3);
        System.out.println("Map after removing key : " + map);

        //  containsKey / containsValue
        System.out.println("Contains key :" + map.containsKey(2));
        System.out.println("Contains value : " + map.containsValue("Apple"));

        //  keySet() 
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);

        //  values() 
        Collection<String> values = map.values();
        System.out.println("Values: " + values);

        //  size() 
        System.out.println("Size of map: " + map.size());

        //  isEmpty() 
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
