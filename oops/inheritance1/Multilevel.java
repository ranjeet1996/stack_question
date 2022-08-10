package oops.inheritance1;

public class Multilevel {
    public static void main(String[] args) {
        Jandhanaccount j1=new Jandhanaccount();
        System.out.println(j1.minbalance);
        System.out.println(j1.balance);
        j1.credit(5000);
        System.out.println(j1.balance);
        j1.debit(6000);
        System.out.println(j1.balance);
        j1.cheackminbalanceispresent();
        
    }
}
