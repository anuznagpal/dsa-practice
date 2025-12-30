class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if(n!=t.length())
        return false;

        int arr1[] = new int[255];
        int arr2[] = new int[255];
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(arr1[c]!=arr2[d]) 
            return false;
            arr1[c] = i+1;
            arr2[d] = i+1;
        }
        return true;
    }
}