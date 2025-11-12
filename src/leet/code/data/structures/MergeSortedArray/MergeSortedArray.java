package leet.code.data.structures.MergeSortedArray;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize three pointers:
        // p1 points to the last valid element of nums1
        int p1 = m - 1;
        // p2 points to the last element of nums2
        int p2 = n - 1;
        // i points to the last position in nums1 where an element can be placed
        int i = m + n - 1;

        // Iterate while there are still elements in nums2 to merge
        while (p2 >= 0) {
            // If p1 is in bounds and the element at p1 in nums1 is greater
            // than the element at p2 in nums2
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                // Place the element from nums1 at the current position in nums1
                nums1[i] = nums1[p1];
                // Move p1 to the left
                p1--;
            } else {
                // Otherwise (p1 is out of bounds or nums2[p2] is greater or equal),
                // place the element from nums2 at the current position in nums1
                nums1[i] = nums2[p2];
                // Move p2 to the left
                p2--;
            }
            // Move i to the left (to the next available position in nums1)
            i--;
        }
    }

}
