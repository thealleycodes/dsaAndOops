package oops;
class BankAccount{
   
    private double balance;
    //encapsulation doesnt allow u to modify directly we need to use methods 

    public BankAccount(double balance){
        this.balance=100;
    }
    public void setBalance(double balance){
         this.balance=balance;
         //we take password string here and check with if it is correct then only we can modify it 
    }
    public double  getBalance(double balance){
        //only when checking if he is adming bank employee etc check should pass to show balance
        return balance;
    }
   
    public  void printBalance(){
        System.out.println("The balance is " +  balance);
    }
}



public class getSetEncapsulate {
    public static void main(String[] args) {
        BankAccount accountPerson1=  new BankAccount(110);
        //110,1231234123password;
        accountPerson1.setBalance(123);
        accountPerson1.printBalance();

    }
}
