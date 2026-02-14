package oops;
//we cannot create objects out of a abstract class
abstract class BankAccount{
    double balance;
    abstract void addMoney(double amount);
    abstract void CanIwithdrawMoney(double amount);
    abstract void withdraw(double amount);


    void updateBalance(double _balance){
        balance=_balance;
    }

    public double getBalance(){
        // System.out.println(balance);
        return  balance;
        
    }
}



class CurrentAccount extends BankAccount{
    double MinmumLimit = 1000.0;
    public void addMoney(double amount){
        super.updateBalance(super.getBalance()+amount);
        System.out.println(amount + " got credited ");
    }
    public void CanIwithdrawMoney(double amount){
        if(super.getBalance()-amount >=MinmumLimit){
            System.out.println("user can withdraw");
        }else{
            System.out.println("user cannot withdraw due to low balance");
        }
    }
    public void withdraw(double amount){
         if(super.getBalance()-amount >=MinmumLimit){
            super.updateBalance(super.getBalance()-amount);
            System.out.println(amount + " got deducted ");
        }else{
            System.out.println("user cannot withdraw due to low balance");
        }
    }
}



public class abstraction {
    public static void main(String[] args) {
        // BankAccount cb = new BankAccount(); we cannot do this
        CurrentAccount ac = new CurrentAccount();
        ac.addMoney(2000000);
        // ac.CanIwithdrawMoney(1000);
        ac.withdraw(2000);
        // double amount = ac.getBalance();
        // System.out.println(amount);
        
        double amount = ac.getBalance();
        System.out.println(amount);
    }   
}
