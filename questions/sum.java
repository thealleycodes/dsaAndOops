
import java.util.Scanner;


public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int lengthOfArray = sc.nextInt();

         int[] arr = new int[lengthOfArray] ;

         for(int i=0; i<lengthOfArray;i++){
            arr[i] = sc.nextInt();
         }

         int sum = 0;

         for(int val:arr){
            sum +=val;
            
         }

         System.out.println(sum);
         

    }
}
