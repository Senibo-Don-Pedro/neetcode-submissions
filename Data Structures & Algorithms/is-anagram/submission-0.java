class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; // Quick check

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars); // This sorts them alphabetically
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars); // Checks if every index matches
    }
}
