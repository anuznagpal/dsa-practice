class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int count = 0;
        int maxLength = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count--;
            else count++;
            if(hm.containsKey(count)){
                int curLength = i - hm.get(count);
                maxLength = Math.max(maxLength, curLength);
            }
            else
            hm.put(count, i);
        }
        return maxLength;
    }
}