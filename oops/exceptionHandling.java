package oops;
public class exceptionHandling {
    public static void main(String[] args) {
        try {
             int num1= 100;
        int num2= 0;
        int num3= num1/num2;
        System.out.println(num3);
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}
