class Solution {
    public boolean isValid(String str) {
        int n = str.length();
        if((n&1) != 0)return false;

        Stack<Character> s = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
            s.push(ch);

            else{
                if(s.isEmpty())return false;
                char top = s.pop();
                if(ch == ')' && top != '(')return false;
                if(ch == '}' && top != '{')return false;
                if(ch == ']' && top != '[')return false;
            }
        }
        return s.isEmpty();
    }
}