package javaCollections;

import java.util.HashMap;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        

        //key,value
        //rollnumber is the key
        //name is the value 
        //hash map  does not always store keys in sorted order 
       HashMap<Integer,String> hm = new HashMap<>();
        // hm.put(1,"raj" );
        // hm.put(3,"pawan" );
        // hm.put(2,"pratik" );

        // System.out.println(hm);
        // System.out.println(hm.get(2));
        // System.out.println(hm.size());


        //it doesnt not store duplicates and in sorted order always
        
        TreeMap<Integer,String>tm = new TreeMap<>();
        tm.put(2,"pratik" );
        tm.put(1,"raj" );
        tm.put(3,"pawan" );
        System.out.println(tm);
        System.out.println(tm.keySet());

    }
}
