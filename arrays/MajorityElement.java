class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
       int i=0;
       int count =0;
       int winner = Integer.MIN_VALUE;
       while(i<n){
        if(count==0){
            winner = nums[i];
            count++;
        }
        else if(nums[i]==winner)
        count++;
        else if(nums[i]!=winner){
            count--;
        }
        i++;
       } 
       return winner;
    }
}