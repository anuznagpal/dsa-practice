class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length(); int m = p.length();
        if(n<m)return ans;

        int hashS[] = new int[26];
        int hashP[] = new int[26];

        for(int i=0; i<m; i++){
            hashS[s.charAt(i)-'a']++;
            hashP[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(hashS, hashP))ans.add(0);
        
        for(int i = m; i<n; i++ ){
             hashS[s.charAt(i) - 'a']++;
             hashS[s.charAt(i-m) - 'a']--;

             if(Arrays.equals(hashS, hashP)) ans.add(i-m+1);
        }
        return ans;


    }
}