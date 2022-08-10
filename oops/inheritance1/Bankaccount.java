package oops.inheritance1;

public class Bankaccount {
    int balance;
    String accountholdername;
    int accountno;
  
    
    void credit(int val){
        balance=balance+val;

    }
    void debit(int val){
    balance=balance-val;
    }
    
}
