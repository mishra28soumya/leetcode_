/* https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/ */

class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k = 1;
        int j = 1;
        for(int i=1; i<len; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}
