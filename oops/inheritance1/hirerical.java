package oops.inheritance1;

public class hirerical {
    public static void main(String[] args) {
        DemateAccount d1=new DemateAccount();
        d1.credit(50000);
        System.out.println(d1.balance);
        d1.AddNewInvestement("Ranjeet", 10000);
        System.out.println(d1.balance);
        System.out.println(d1.invested);
        d1.AddNewInvestement("Ajeet", 2000);
        System.out.println(d1.balance);
        System.out.println(d1.invested);
    }
    
}
