// import java.util.HashMap; 

class Solution {
    // Time: 192 ms, Memory: 63.0MB
    /**
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true; 
            }
            
            map.put(num, 1); 
        }

        return false; 
    }
    */
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        for (int num : nums) {
            if (set.contains(num)) {
                return true; 
            }
            set.add(num); 
        }

        return false; 
    }
}

/**
1) Brute force solution - compare each element to the rest 
    time: O(n^2), space: O(1)
2) Sort the array (take extra time), compare adjacent elements 
    time: O(n log n), space: O(1)
3) Hash Set (my solution)
    time: O(n), space: O(n)
*/