import java.util.*;

public class SecondHighes {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1,2};
         HashMap<Integer,Integer>map =new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
    }
}
