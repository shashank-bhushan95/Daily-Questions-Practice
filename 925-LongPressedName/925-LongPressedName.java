// Last updated: 8/4/2026, 5:00:56 PM
1class Solution {
2    public int numUniqueEmails(String[] emails) {
3        HashSet<String> ans = new HashSet<>();
4        for(int i = 0; i < emails.length; i++){
5            String curr = emails[i];
6            //if(curr.charAt(0) == '+')
7            StringBuilder sb = new StringBuilder();
8            int j = 0;
9            while(curr.charAt(j) != '@'){
10                char ch = curr.charAt(j);
11                if(ch == '.') j++;
12                else if(ch == '+'){
13                    while(curr.charAt(j) != '@') {
14                        j++;
15                    }
16                }
17                else{
18                    sb.append(ch);
19                    j++;
20                }
21            }
22            while (j < curr.length()) {
23                sb.append(curr.charAt(j));
24                j++;
25            }
26            ans.add(sb.toString());
27        }
28        return ans.size();
29    }
30}