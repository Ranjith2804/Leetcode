class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int target = -nums[i];
            Set<Integer> innerSet = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int needed = target - nums[j];

                if (innerSet.contains(needed)) {
                    int a = nums[i];
                    int b = nums[j];
                    int c = needed;

                    List<Integer> temp = Arrays.asList(a, b, c);
                    Collections.sort(temp);
                    set.add(temp);
                }

                innerSet.add(nums[j]);
            }
        }

        return new ArrayList<>(set);
    }
}
