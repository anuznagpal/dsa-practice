class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0)return 0;
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int j =0;
        int maxC =1;
        
      for (int num : hs) {
    if (!hs.contains(num - 1)) {
        int current = num;
        int count = 1;
        while (hs.contains(current + 1)) {
            count++;
            current++;
        }
        maxC = Math.max(count, maxC);
    }
}
       return maxC;
    }
}