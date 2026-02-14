package javaCollections;
import java.util.*;
//     private String name;
//     Data(Integer _number,String _name){
//         this.number=_number;
//         this.name=_name;
//     }
// }

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>(); // elements can only be added from the end
        // aList.add(12);
        // aList.add(13);
        // aList.add(14);
        // aList.add(15);
        // aList.add(16);
        // aList.add(1,17);
        // System.out.println(aList);
        // System.out.println(aList.size());
        // System.out.println(aList.get(2));
        // System.out.println(aList.remove(1));
        // System.out.println(aList);
        // System.out.println(aList.contains(12));

        LinkedList<Integer> ll = new LinkedList<>();// elements can be added from both front and back
        // ll.add(2);
        // ll.add(3);
        // ll.addFirst(4);
        // ll.addLast(1);
        // System.out.println(ll);
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(ll);
        // System.out.println(ll.get(2));
        // System.out.println(ll.getFirst());
        // System.out.println(ll.getLast());
        // System.out.println(ll.size());//same it has contains clear etx as ArrayList
        // System.out.println(12);
        // ll.offer(5);

        Stack<Integer> st = new Stack<>();
        // st.push(12);
        // st.push(3);
        // st.push(5);
        // st.pop();
        // System.out.println(st);
        // System.out.println(st.peek());
        // System.out.println(st.isEmpty());

        Vector<Integer> vc = new Vector<>();
        // all the other methods are similar to ArrayList
        // System.out.println(vc.capacity());

        HashSet<Integer> hs = new HashSet<>();
        // //DS that store unique element in a random order
        // hs.add(1);
        // hs.add(2);
        // hs.add(1);
        // System.out.println(hs);

        // for(var num:hs){
        // System.out.println(num);
        // }
        TreeSet<Integer> ts = new TreeSet<>();
        //stores unique elements in sorted order
        // ts.add(1);
        // ts.add(9);
        // ts.add(-1);
        // ts.add(5);
        // ts.add(1);
        // for (var num : ts) {
        //     System.out.println(num);
        // }
        // System.out.println("----");
        // System.out.println(ts.floor(6));// this will print the first element in the treeset which is less than 6
        // System.out.println(ts.ceiling(6));// this will print the first element in the treeset which is greater than 6

        ArrayDeque <Integer> ad = new ArrayDeque<>();
        // ad.offer(3);
        // ad.offer(0);
        // ad.offer(6);
        // ad.offerLast(1);
        // ad.offer(10);
        // for(var num:ad){
        //     System.out.println(num);
        // }
        // ad.poll();
        // System.out.println(ad);
        // System.out.println(ad.peek());

        PriorityQueue<Integer> pq=new PriorityQueue<>(); //min heap by default 
    //     // we can use \
    //         public static Comparator<Integer> getComparator() {
    // return (a, b) -> b.compareTo(a); // comparator to make it MAX HEAP 
        //store element
        //and whenever we ask for a peek , it gves the smallest element
        //first element will be the smallest 
        // pq.offer(13);
        // pq.offer(12);
        // pq.offer(11);
        // pq.offer(15);
        // System.out.println(pq);
        // System.out.println(pq.poll());
        // System.out.println(pq);
        // System.out.println(pq.peek());


        

    }
}
