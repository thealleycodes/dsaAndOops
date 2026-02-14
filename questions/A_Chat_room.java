import java.util.Scanner;

class A_Chat_room{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(input.length()<=5){
            System.out.println("NO");
        }else{

            System.out.println("YES");
        }
    }
}