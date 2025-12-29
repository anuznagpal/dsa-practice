class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0 || s== null)return true;
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            char i = s.charAt(l);
            char j = s.charAt(r);
            if(!Character.isLetterOrDigit(i)) l++;
            else if(!Character.isLetterOrDigit(j)) r--;
            else{
                if(Character.toLowerCase(i)!=Character.toLowerCase(j)) return false;
                l++; r--;
            }
        }
        return true;
    }
}