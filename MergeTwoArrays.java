import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++, i++) {
            nums1[i] = nums2[j];  // Append nums2 to nums1
        }
        Arrays.sort(nums1); // Sort the combined array
    }
}

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.println("Enter number of elements in first array:");
        int m = sc.nextInt();
        int[] arr1 = new int[m + 100]; // extra space to merge arr2 (optional 100, later we use only m+n)
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.println("Enter number of elements in second array:");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // Create a new array of size m+n and copy m elements
        int[] nums1 = new int[m + n];
        for (int i = 0; i < m; i++) {
            nums1[i] = arr1[i];
        }

        // Call merge
        Solution solution = new Solution();
        solution.merge(nums1, m, arr2, n);

        // Print merged array
        System.out.println("The merged and sorted array is:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
