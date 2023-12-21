/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for(int i = 0; i < n-2; i++){
            //edge cases
            if(nums[i] > 0){
                return list;
            }
            //skip the same first numbers
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> temp = Arrays.asList(nums[i],nums[left],nums[right]);
                    list.add(temp);
                    //skip the same second numbers
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    //skip the same third numbers
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return list;
        
    }
}
// @lc code=end

