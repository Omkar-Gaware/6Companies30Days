class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        List<Integer> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (start.isEmpty() || start.get(start.size() - 1) < nums[i]) {
                start.add(nums[i]);
            } else
                break;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (end.isEmpty() || end.get(end.size() - 1) > nums[i])
                end.add(nums[i]);
            else
                break;
        }

        if (start.size() + end.size() > n) {
            return n * (n + 1) / 2;
        }

        int ans = start.size() + end.size();
        int i = 0, j = end.size() - 1;

        while (i < start.size() && j >= 0) {
            if (start.get(i) < end.get(j)) {
                ans += j + 1;
                i++;
            } else {
                j--;
            }
        }

        return ans + 1;
    }
}

// TC : O(N);
// SC : O(N);