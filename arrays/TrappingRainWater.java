class Solution {
    public int trap(int[] h) {
         if (h == null || h.length == 0) return 0;
        int l = 0, r = h.length-1;
        int lmax =0, rmax=0;
        int sum =0;

        while(l<r){
            if(h[l]<h[r]){
                if(h[l]>=lmax) lmax = h[l];
                else sum+= lmax-h[l];
                l++;
            }
            else{
                if(h[r]>=rmax) rmax = h[r];
                else sum += rmax - h[r];
                r--;
            }
        }
        return sum;
    }
}