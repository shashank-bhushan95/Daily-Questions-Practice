// Last updated: 8/7/2025, 10:03:43 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        // char cs[] = s.toCharArray();
        // char ct[] = t.toCharArray();
        // Arrays.sort(cs);
        // Arrays.sort(ct);

        // for(int i = 0; i < cs.length; i++){
        //     if(cs[i] != ct[i]){
        //         return false;
        //     }
        // }
        // return true;

        int fre[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            fre[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            fre[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < fre.length; i++){
            if(fre[i] != 0) return false;
        }
        return true;
    }
}