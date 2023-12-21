/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        //edge case
        if (height.length == 0) return 0;
        //initialize the variables
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        int output  = 0;

        while(left < right){
            int waterWidth = right - left;
            int waterHeight = Math.min(height[left],height[right]);
            max = waterWidth * waterHeight;
            output = Math.max(max,output);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return output;


    }
}
// @lc code=end

