class Solution {
    public void moveZeroes(int[] nums) {
        int z=0,i=0,n=nums.length-1;
        while(i<=n){
            if(nums[i]!=0){
                int temp= nums[z];
                nums[z]=nums[i];
                nums[i]= temp;
                z++;
                i++;
            }
            else if(nums[i]==0)i++;
        }      
        
    }
}