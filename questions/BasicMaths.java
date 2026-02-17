import java.util.*;

public class BasicMaths {
    public static int Returnini(){
        int[] arr ={};

    }
    public static void main(String[] args) {
        int num=111;
        int reversedNumber=0;
        // System.out.println((int) Math.log10(num)+1);
        int digits;
        while(num>0){
            digits = num%10;
            reversedNumber = reversedNumber*10+digits;
            num/=10;
        }
        System.out.println(reversedNumber==num);

    }
}
