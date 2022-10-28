package Greedy;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        
    }
    
    public int maxprofit(int[] prices){
        int totalprofit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                int profit=prices[i]-prices[i-1];
                totalprofit+=profit;
            }
        }

        return totalprofit;
    }
}
