class Solution {
    public int[] twoSum(int[] nums, int t) {
        int i=0;
        int j = nums.length-1;
        int ans[] = new int[2];
        while(i<j){
            if(nums[i] + nums[j]== t){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(nums[i] + nums[j] > t)
            j--;
            else
            i++;
        }
        return new int[]{};
    }
}