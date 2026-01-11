class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()< s1.length())return false;
        int hash1[] = new int[26];
        int hash2[] = new int[26];

        int window = s1.length();



        for(int i=0; i<window; i++){
            hash1[s1.charAt(i)-'a']++;
            hash2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(hash1, hash2)) return true;
        for(int i=window; i<s2.length(); i++){
            hash2[s2.charAt(i)-'a']++;
            hash2[s2.charAt(i-window)-'a']--;

            if(Arrays.equals(hash1, hash2))return true;
        }
        return false;
    }
}