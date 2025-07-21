import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // To keep track of original indices, create an array of pairs
        int[][] indexedNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            indexedNums[i][0] = nums[i];   // value
            indexedNums[i][1] = i;         // original index
        }

        // Sort by values
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));

        while (left < right) {
            int sum = indexedNums[left][0] + indexedNums[right][0];
            if (sum == target) {
                return new int[]{indexedNums[left][1], indexedNums[right][1]};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{}; // No match found
    }
}

