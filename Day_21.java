class Solution {
    public int subarraySum(int[] nums, int k) {
        int total = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(total, 1);
        for(int num: nums) {
            total += num;
            if(map.containsKey(total - k))
                count += map.get(total - k);
            if(map.containsKey(total)) {
                map.replace(total, map.get(total) + 1);
            } else {
                map.put(total, 1);
            }
        }
        return count;
    }
}
