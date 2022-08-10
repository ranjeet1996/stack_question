package oops.inheritance1;

public class Savingbankaccount extends Bankaccount {
    int minbalance;
    double interestrate;

    void depositeInterest(double interestrate){
        int amount=(int)( balance*(interestrate/100.0));
        credit(amount);
    }
    void cheackminbalanceispresent(){
        if(balance>minbalance){
            System.out.println("you have sufficiate balance");
        }else{
            System.out.println("add balance:" +(minbalance-balance));
        }
    }

    
}
