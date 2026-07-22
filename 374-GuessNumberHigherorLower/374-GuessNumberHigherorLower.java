// Last updated: 7/23/2026, 12:43:10 AM
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int start = 0;
13        int end = n;
14        while(start <= end){
15            int mid = start + (end - start) / 2;
16            int guessNo = guess(mid);
17            if(guessNo == 0) return mid;
18            else if(guessNo == -1){
19                end = mid-1;
20            }
21            else{
22                start = mid+1;
23            }
24        }
25        return 0;
26    }
27}