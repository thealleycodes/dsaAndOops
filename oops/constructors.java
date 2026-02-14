// package oops;
// class BankAccount{
//     private double balance;
//     // we have made this private so that it cannot be changed directly as it is important data and if we want to change the value we use getters and setters

//     private String accountType;
//     public BankAccount(){
//             // System.out.println("default constructor is called");
//             //if no arguments is there this will be called else below constructors will be called 
//             System.out.println("welcome to World Bank");
//             balance= 100.0;
//             accountType = "SAVING";
//         }

//     // public BankAccount(double _balance){// default 
//     //     balance= _balance;
//     //     accountType = "savings";
//     // }

//      public BankAccount(double _balance,String _accountType){ //if someone wants to specify what type of account they are openining
//         balance= _balance;
//         accountType = _accountType;
//     }

//     public BankAccount(double balance){
//         this.balance=balance;
//         this.accountType="saving";
//     }

//     public  void printAccount()
//     {
//         System.out.println("The balance is " +  balance);
//         System.out.println( "the account type is " + accountType);

//     }
// }

// public class constructors {
//     public static void main(String[] args) {
//         // BankAccount newBalance = new BankAccount(100.0);
//         // newBalance.printBalance();
//         BankAccount accountPerson2 = new BankAccount(100);
       
//         BankAccount accountPerson1=  new BankAccount(110,"CURRENT");
//         accountPerson1.printAccount();
//          accountPerson2.printAccount();

//     }
// }
