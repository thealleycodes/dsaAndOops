package Oops2;

class BankAccount{
    private String name;
    private double balance;
    //default cunstructor/method
    BankAccount(String name,double balance){
      this.name=  name;
      this.balance= balance;
    }
    public void setName(String name){
      this.name = name;
    }
    public String getName(){
      return name;
    }
    public  double getBalance(){
      return balance;
    }

}

public class AttributesAndMethods {
  static void main(String[] args) {
    BankAccount person1 = new BankAccount("raj",100);
    System.out.println(person1.getBalance());

  }
}
