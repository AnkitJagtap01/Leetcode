                p1--;
            } else {
                nums1[pMerge] = nums2[p2];
                p2--;
            }
        int p2 = n - 1;
        int pMerge = m + n - 1;

        // Iterate over nums1 and nums2 from the end, and merge them into nums1
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[pMerge] = nums1[p1];
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize two pointers for nums1 and nums2 respectively, and
        // one pointer for the end of the merged array
        int p1 = m - 1;
[
