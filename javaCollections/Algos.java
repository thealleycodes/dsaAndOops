package javaCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algos {
    public static void main(String[] args) {
            List<Integer>al = new ArrayList<>();
        al.add(1);
        al.add(6);
        al.add(3);
        al.add(1);
        Collections.sort(al);
        
        System.out.println(Collections.max(al));
        Collections.reverse(al);
        System.out.println(Collections.frequency(al, 1));
        System.out.println(Math.pow(2, 5));
      

    }
}
