class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Test case: 6 5 4
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int difference = 0; 
        int[] result = new int[2]; 

        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i]; 

            if (map.containsKey(difference)) {
                result[0] = map.get(difference); 
                result[1] = i; 
                break; 
            }

            map.put(nums[i], i); 
        }

        return result; 
    }
}
