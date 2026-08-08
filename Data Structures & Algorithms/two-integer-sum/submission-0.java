class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> x = new HashMap<>();
        int[] y = new int[2];

        for (int i = 0 ; i < nums.length ; i++ ) {

            int compliment = target - nums[i];

            if (x.containsKey(compliment)) {
                return new int[] { x.get(compliment), i };
            }

            x.put(nums[i], i);
        }

        return new int[0];


    }
}
