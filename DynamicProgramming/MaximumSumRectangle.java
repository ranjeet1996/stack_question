package DynamicProgramming;

import java.util.Arrays;

public class MaximumSumRectangle {
    public static void main(String[] args) {
        
    }
    int maximumSumRectangle(int R,int C,int M[][]){

        int sum[]=new int[R];
        int maxsum=Integer.MIN_VALUE;

        for(int cStart=0;cStart<C;cStart++){
            Arrays.fill(sum,0);
            for(int cEnd=cStart;cEnd<C;cEnd++){
                for(int row=0;row<R;row++ ){
                    sum[row]+=M[row][cEnd];
                }
                int curMaxSum=kandans(sum);
                maxsum=Math.max(maxsum,curMaxSum);
            }
        }
        return maxsum;

    }
    public int kandans(int[] nums){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int maxElement=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(sum<0){
                sum=0;
            }
            maxSum=Math.max(maxSum,sum);

            maxElement=Math.max(maxElement,nums[i]);
        }

        if(maxSum==0){
            maxSum=maxElement;
        }

        return maxSum;
    }
    
}
