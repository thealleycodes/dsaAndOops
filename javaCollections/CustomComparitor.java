package javaCollections;
import java.util.*;
public class CustomComparitor {

    // public static Comparator<Integer> getComparator(){
    //     return new Comparator<Integer>() {
    //         @Override
    //         public int compare(Integer num1,Integer num2){
    //             // System.out.println("comparing " + num1 + " " + num2);
    //             //order is wrong 
    //             if(num1<num2){
    //                 return 1;  
    //             }else if (num1>num2) {
    //                 return -1;
    //             }
    //             return 0;
    //         }
    //     };
    // }
    public static Comparator<Integer> getComparator() {
    return (a, b) -> b.compareTo(a); // descending
    
}
    public static void main(String[] args) {
        List<Integer>al = new ArrayList<>();
        al.add(1);
        al.add(6);
        al.add(3);
        al.add(1);
        
        System.out.println(al);
        Collections.sort(al,getComparator());
        // Collections.sort(al,(num1,num2)->num2-num1); //lambda expression similar to arrow function in javascript
        // Collections.sort(al,new Comparator<Integer>(){
        //     // [num1,num2][num2,num1]
        //     @Override
        //     public int compare(Integer num1,Integer num2){
        //         System.out.println("comparing " + num1 + " " + num2);
        //         //order is wrong 
        //         if(num1<num2){
        //             return 1;  
        //         }else if (num1>num2) {
        //             return -1;
        //         }
        //         return 0;
        //     }
        // });
        System.out.println(al);
    }
}
