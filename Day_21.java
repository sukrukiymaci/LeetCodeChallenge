/*
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:

Input:nums = [1,1,1], k = 2
Output: 2
 

Constraints:

The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].

*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int total = 0;
        int count = 0;
        // Hash map produces frequences of total values
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(total, 1);
        for(int num: nums) {
            total += num;
            // checks the total in the hash map if exists increments by number of subarrays with the same total value
            if(map.containsKey(total - k))
                count += map.get(total - k);
            //if already added the temporary total increments the number by one
            if(map.containsKey(total)) {
                map.replace(total, map.get(total) + 1);
            } else {
                map.put(total, 1);
            }
        }
        return count;
    }
}
