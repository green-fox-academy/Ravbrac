package map_introduction;

import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {
        //        We are going to play with maps. Feel free to use the built-in methods where possible.
        //
        //                Create an empty map where the keys are integers and the values are characters
        //
        //        Print out whether the map is empty or not
        //
        //        Add the following key-value pairs to the map
        //
        //        Key	Value
        //        97	a
        //        98	b
        //        99	c
        //        65	A
        //        66	B
        //        67	C
        //        Print all the keys
        //
        //        Print all the values
        //
        //        Add value D with the key 68
        //
        //        Print how many key-value pairs are in the map
        //
        //        Print the value that is associated with key 99
        //
        //        Remove the key-value pair where with key 97
        //
        //        Print whether there is an associated value with key 100 or not
        //
        //        Remove all the key-value pairs

        HashMap<Integer, String> introMap = new HashMap<>();
        System.out.println(introMap.isEmpty());
        introMap.put(97, "a");
        introMap.put(98, "b");
        introMap.put(99, "c");
        introMap.put(65, "A");
        introMap.put(66, "B");
        introMap.put(67, "C");
        System.out.println(introMap.keySet());
        System.out.println(introMap.values());
        introMap.put(68, "D");
        System.out.println(introMap.size());
        System.out.println(introMap.get(99));
        introMap.remove(97);
        System.out.println(introMap.containsKey(100));
        introMap.clear();
        System.out.println(introMap);
    }
}
