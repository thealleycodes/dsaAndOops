public class Strings {
    public static void main(String[] args) {
        //string contain  array inside it which has a data type of char  
        //strings are immutable (st=st+"j") in java it makes a new object when changes are made to it after declaration
        String st ="rajPratik";
        //A-65 Z-90  a-97 z-122 these are ASCII values
        System.out.println(st.charAt(1));
        System.out.println(st.substring(0,4));//the ending index specify one more than the required elements index eg for P that is 3 we write 4
        
        

    }
}
