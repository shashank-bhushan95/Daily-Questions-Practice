// Last updated: 8/7/2025, 10:03:16 PM
class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                if(count > max){
                    max = count;
                }
            }
            if(ch == ')'){
                count--;
            }
        }
        return max;
    }
}