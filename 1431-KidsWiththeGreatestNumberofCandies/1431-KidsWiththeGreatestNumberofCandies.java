// Last updated: 6/20/2026, 4:32:27 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        Arrays.sort(nums);
4        int[] arr = new int[nums.length];
5        int index = 0;
6        for(int i = nums.length-1; i >= 0; i--){
7            arr[index++] = nums[i];
8        }
9        LinkedHashSet<Integer> h = new LinkedHashSet<>();// Because hashset to maintain indext but linked Hash set maintains index.
10        for(int i = 0; i < arr.length; i++){
11            h.add(arr[i]);
12        }
13
14        int ans = 0;
15        if(h.size() < 3){
16            for(int num : h){
17                return num;
18            }
19        }
20        else{
21            int index1 = 1;
22            for(int num : h){
23                if(index1 == 3) return num;
24                index1++;
25            }
26        }
27        return 0;
28    }
29}