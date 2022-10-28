package DynamicProgramming;

public class HouseRobber {
    public static void main(String[] args) {
        
    }

    public int rob(int[] nums){
        int length=nums.length;

        if(length==1){
            return nums[0];
        }
        if(length==2){
            return Math.max(nums[0],nums[1]);
        }

        int[] maxMoney=new int[length+1];

        for(int i=2;i<=length;i++){
            maxMoney[i]=Math.max(maxMoney[i-2]+nums[i-1],maxMoney[i-1]);
        }

        return maxMoney[length];
    }
    
}
