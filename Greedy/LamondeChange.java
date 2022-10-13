package Greedy;

public class LamondeChange {
    public static void main(String[] args) {
        
    }

    public boolean lemondchange(int[] bills) {
        int fives = 0;
        int tens = 0;
        int twentys = 0;
            
        for(int i:bills) {
            if(i==5) {
                fives++;
            } else if(i==10 && fives>0) {
                tens++;
                fives--;
            } else if(i==20 && tens>0 && fives>0) {
                twentys++;
                tens--;
                fives--;
            } else if(i==20 && fives>=3) {
                twentys++;
                fives-=3;
            } else {
                return false;
            }
        }
        return true;


    }
    
}
