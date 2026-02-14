import java.util.*;
class sortCharAtFreq{
    public static void main(String[] args) {
            String s = "tree";
    HashMap<Character,Integer>map=new HashMap<>();
    for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch, 0)+1);
    }
    List<Character> list = new ArrayList<>(map.keySet());
    Collections.sort(list, (a, b) -> {
    if (map.get(a) != map.get(b)) {
        return map.get(b) - map.get(a); // frequency descending
    }
    return a - b; // alphabetical order
});
    System.out.println(list);
    }
    
}