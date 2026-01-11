class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character, Integer> hm = new HashMap<>();
     int n = s.length();
     int i = 0;
     int maxL = 0;

     for(int r=0; r<n; r++){
        char ch = s.charAt(r);
        if(hm.containsKey(ch)){
            i = Math.max(i, hm.get(ch)+1);
        }
        hm.put(ch, r);

        maxL = Math.max(maxL,r-i+1);
     }
     return maxL;
    }
}