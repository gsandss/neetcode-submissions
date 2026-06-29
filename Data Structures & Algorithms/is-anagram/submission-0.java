class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> charCounts = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){

            char c = t.charAt(i);

            if(!charCounts.containsKey(c)) return false;

            charCounts.put(c, charCounts.get(c) - 1);

            if(charCounts.get(c) == 0){
                charCounts.remove(c);
            }
        }

        return charCounts.isEmpty();
    }
}
