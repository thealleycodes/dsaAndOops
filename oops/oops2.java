package oops;


class Test{
    int age;
    public void assignAge(int num){
        age =num;

        
    }
}
public class oops2 {
    private static void printMethod(int num){
        System.out.println("the number is " + num);
    }

    private static int sumMethod(int number1,int number2){
        return  number1 + number2;
    }
    
    public static void main(String[] args) {
        Test test1 = new Test();
        test1.assignAge(10);
        
        Test test2 = new Test();
        test2.assignAge(32);
        System.out.println(test1.age);

        printMethod(12);
        
        int ans = sumMethod(3,3);
        System.out.println("sum is " + ans);
    }
    
}
