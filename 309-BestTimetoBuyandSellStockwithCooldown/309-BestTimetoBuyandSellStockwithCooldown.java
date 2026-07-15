// Last updated: 7/15/2026, 12:33:22 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        ArrayList<Integer> list = new ArrayList<>();
5
6        for (int num : nums1) {
7            map.put(num, map.getOrDefault(num, 0) + 1);
8        }
9        for (int num : nums2) {
10            if (map.containsKey(num) && map.get(num) > 0) {
11                list.add(num);
12                map.put(num, map.get(num) - 1);
13            }
14        }
15        int[] ans = new int[list.size()];
16        int index = 0;
17        for (int num : list) {
18            ans[index++] = num;
19        }
20
21        return ans;
22    }
23}