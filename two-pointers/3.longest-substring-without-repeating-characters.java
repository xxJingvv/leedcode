/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
        return 0;

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        int max = 0;
        int left = 0;
        int length = 0;
        for( int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            length = i-left+1;
            max = Math.max(max,length);
        }
        return max;
    }
}
// @lc code=end

