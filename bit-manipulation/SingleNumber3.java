class Solution {
    public int[] singleNumber(int[] nums) {
        int l =nums.length;
        int xor = 0;
        for(int n: nums)
        xor^=n;

        xor = (xor & (xor-1)) ^ xor;

        int b1=0, b2=0;
        for(int n: nums){
            if((xor & n)!=0)
            b1^=n;
            else
            b2^=n;
        }
        return new int[]{b1, b2};
    }
}