import java.util.*;

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


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.println("Enter array elements (space-separated):");
        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Call twoSum
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        // Output result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}
<<<<<<< HEAD:TwoSum.java

=======
>>>>>>> branch:Main.java
