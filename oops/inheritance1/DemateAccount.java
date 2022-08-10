package oops.inheritance1;

import java.util.ArrayList;

public class DemateAccount extends Bankaccount{
    int DailyTradeLimit;
    ArrayList<String> invested;

    void AddNewInvestement(String Company, int amount){
        invested.add(Company);
        debit((amount));
    }
    DemateAccount(){
        invested=new ArrayList<>();
    }
    
}
