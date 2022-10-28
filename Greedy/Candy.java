package Greedy;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        
    }
    public int candy(int[] ratings){
        int candies=0;
        int n=ratings.length;

        int[] left = new int[n];
        int[] right = new int[n];
        
        Arrays.fill(left,1);
        Arrays.fill(right,1);
            
        // for left relative array;
        for(int i=0;i<n;i++) {
            // if current index rating >preivious; give extra candy
            if(ratings[i]>ratings[i-1]) {
                left[i] = left[i-1]+1;
            }
        }
 
         // for right relative array;
        for(int i=n-2;i>=0;i--) {
            if(ratings[i]>ratings[i+1]) {
                right[i] = right[i+1]+1;
            }
        }

        for(int i = 0;i < n; i++) {
            candies = candies + Math.max(left[i] ,right[i]);
        }

        return candies;
    }
    
}
