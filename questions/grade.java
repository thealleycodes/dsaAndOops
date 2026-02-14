package questions;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        // System.out.print("enter your marks ");
        if(marks>=90){
            System.out.println("A");
        }else if(marks >=70){
            System.out.println("B");
        }else if(marks >=50 ){
            System.out.println("D");
        }else{
                System.out.println("Fail h0 gya bro");
        }
        
    }
}
