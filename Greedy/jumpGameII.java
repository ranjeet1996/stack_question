package Greedy;

public class jumpGameII {
    public static void main(String[] args) {
        
    }

    public int jump(int[] nums){
        int numberofjump=0;
        int currentRangeEnd=0;
        int farthest=0;

        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);

            if(i==currentRangeEnd){
                currentRangeEnd=farthest;
                numberofjump++;
            }
        }
        return numberofjump;
    }
    
}
