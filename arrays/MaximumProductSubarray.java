class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int max = nums[0];
        int min = nums[0];
        int ans = max;

        for(int i=1; i< nums.length; i++){
            int c = nums[i];
            if(c < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(c, c*max);
            min = Math.min(c, c*min);

            ans = Math.max(max, ans);
        }
        return ans;
    }
}