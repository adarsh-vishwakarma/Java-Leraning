public class Problem1 {

    public static void printArray(int[] arr) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }

    public static void mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {
        int i = m-1;
        int j = n-1;
        int x = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[x] = nums2[j];
                j--;
            } else {
                nums1[x] = nums1[i];
                i--;
            }
            x--;
        }

        while (j >= 0) {
            nums1[x] = nums2[j];
            x--;
            j--;
        }

        printArray(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        mergeSortedArray(nums1, nums2, n, m);
    }
}
