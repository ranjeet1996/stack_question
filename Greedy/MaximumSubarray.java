package Greedy;

public class MaximumSubarray {
    public static void main(String[] args) {
        
    }

    public int MaximumSubarray(int[] nums){
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
