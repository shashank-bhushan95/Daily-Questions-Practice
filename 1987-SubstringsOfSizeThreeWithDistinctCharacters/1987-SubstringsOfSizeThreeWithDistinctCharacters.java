// Last updated: 8/7/2025, 10:03:17 PM
class Solution {
    public int countGoodSubstrings(String s) {
        HashSet<Character> ans = new HashSet<>();
        int start = 0;
        int end = 0;
        int k = 3;
        int count = 0;
        String str = "";
        while(end < s.length()){
            str+= s.charAt(end);
            if(end-start+1 < k) end++;
            else if(end-start+1 == k){
                for(int i =0; i < str.length(); i++){
                    ans.add(str.charAt(i));
                }
                if(ans.size() == k)count++;
                str = str.substring(1);
                start++;
                end++;
                ans.clear();
            }
        }
        return count;
    }
}