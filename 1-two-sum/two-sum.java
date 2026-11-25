class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int present = target - nums[i];
            if(map.containsKey(present)) return new int[] {map.get(present),i};
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}