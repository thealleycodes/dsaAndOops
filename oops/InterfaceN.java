package oops;
interface Animal{
    void bark();
    default void sleep(){
        System.out.println("i am sleeping zzzz");
    }
    default void eats(){
        System.out.println("munch munch ");
    }
}
// we can implement multiple interfaces and we can have static methods inside interface and call it 
// an interface is a blueprint with methods which every class must have and implement inside 
interface  petOwner{
    public void owner();
}
class Dog implements Animal ,petOwner{
    public void bark(){
        System.out.println("bhow bhowww - -- ");
    }
    public void owner(){
        System.out.println("raj...");
    }
    @Override
    public void sleep(){
        System.out.println("ZZZzzzzzzzzz");
    }
}

public class InterfaceN {   
    // Animal.sleep(); we cannot do this for default types 
    public static void main(String[] args) {
        Dog bikkuu  = new Dog();
        bikkuu.bark();
        bikkuu.sleep();
        bikkuu.eats();
        bikkuu.owner();
    }
    
}
