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
    public void addMoney(double amount){
      if(amount>0){
        balance +=amount;
        System.out.println(amount + " added successfully , new balance is " + balance );
      }else{
        System.out.println("Amount is in negative");
      }
    }
    public boolean withdrawMoney(double amount){
      if(amount>balance || amount <=0){
//        System.out.println("insufficient funds");
        return false;
      }
        balance -=amount;
        return true;
    }
}

public class AttributesAndMethods {
  public static void main(String[] args) {
    BankAccount person1 = new BankAccount("raj", 100);
    person1.addMoney(10000);
    person1.withdrawMoney(10);
    System.out.println(person1.getBalance());


  }
}

