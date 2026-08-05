class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        System.out.println(sArray);
        System.out.println(tArray);


        Arrays.sort(sArray);
        Arrays.sort(tArray);

        System.out.println(sArray);
        System.out.println(tArray);
        

        return Arrays.equals(sArray, tArray);

    }
}
