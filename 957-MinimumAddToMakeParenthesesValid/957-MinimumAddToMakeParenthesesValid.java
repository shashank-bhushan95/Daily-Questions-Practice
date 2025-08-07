// Last updated: 8/7/2025, 10:03:22 PM
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }
            else{
                if(st.isEmpty() == false && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(')');
                 }
            }
        }
        return st.size();
    }
}