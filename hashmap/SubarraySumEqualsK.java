class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0,1);
        int count = 0;
        int n = nums.length;
        int prefix[] = new int[n];
        prefix[0] = nums[0];

        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int i=0; i<n;i++){
            int val = prefix[i] - k;
            if(freq.containsKey(val))count+=freq.get(val);
            freq.put(prefix[i], freq.getOrDefault(prefix[i], 0)+1);

        }
        return count;
    }
}