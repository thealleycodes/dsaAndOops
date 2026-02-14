package oops;

class Test{
    public static void printTest() {
        System.out.println("hello");
    }
}
class NewTest{
    public void PrintTest(){
        System.out.println("hello from NewTest");
    }
}
public class oops {
    public static void main(String[] args) {
        Test.printTest();
        NewTest test = new NewTest(); // we need to make new object out the class if it is not static 
        test.PrintTest();
    }
}
