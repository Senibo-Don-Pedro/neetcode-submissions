class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> containsDuplicate = new HashSet<>();

        for (int num : nums) {
            if (containsDuplicate.contains(num)) {
                return true;
            }
            containsDuplicate.add(num);
        }

        return false;
    }
}