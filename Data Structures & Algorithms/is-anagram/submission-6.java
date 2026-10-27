class Solution {
    public boolean isAnagram(String s, String t) {
        // Anagram: 2 strings are made of exact same characters but may be in same or different order

        // Less efficient solution: time and space = O(s+t)
        // 193 ms 63.3 MB
        // if (s.length() != t.length()) {
        //     return false; 
        // }

        // HashMap<Character, Integer> sMap = new HashMap<>(); 
        // HashMap<Character, Integer> tMap = new HashMap<>(); 

        // for (int i = 0; i < s.length(); i++) {
        //     sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1); 
        //     tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1); 
        // }  

        // for (Map.Entry<Character, Integer> v : sMap.entrySet()) {
        //     // use getOrDefault in case of key in sMap doesn't exist in tMap
        //     // use .equals() to compare beecause Integer only goes from [-128, 127]
        //     if (!(v.getValue().equals(tMap.getOrDefault(v.getKey(), 0)))) {
        //         return false; 
        //     }
        // }

        // return true; 

        // More efficient sometimes if sorting takes O(1) space -> ask interviewer (may need to write out own sorting - efficient: O(n log n) time complexity
        // Prefer HashMap more

        char[] sArr = s.toCharArray(); 
        Arrays.sort(sArr); 
        char[] tArr = t.toCharArray(); 
        Arrays.sort(tArr); 
        return new String(sArr).equals(new String(tArr)); 
    }
}
