package oops.inheritance1;

public class simpleinheritance {
    public static void main(String[] args){
        Savingbankaccount sb1=new Savingbankaccount();
        sb1.accountholdername="Ranjeet";
        sb1.accountno=878919;
        sb1.balance=200000;
        System.out.println(sb1.accountholdername);
        System.out.println(sb1.balance);
        sb1.credit(5000);
        System.out.println(sb1.balance);
        sb1.depositeInterest(5.0);
        System.out.println(sb1.balance);





    }
    
}
