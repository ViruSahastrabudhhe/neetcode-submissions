class Solution {
   public boolean isAnagram(String s, String t) {
        Map<Character, Integer> res = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        String newS = new String(sChar);
        String newT = new String(tChar);
        return newS.equals(newT);
    }
}
