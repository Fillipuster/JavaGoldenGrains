package search.binary;

public class BinarySearch {

    // Searches through a sorted array of integers. Returns the index of the result.
    public static int binarySearchArray(int[] arr, int target) {
        boolean found = false;
        int left = 0;
        int right = arr.length - 1;
        int middle = -1;
        while (!found && left <= right) {
            middle = (left + right) / 2;
            int k = arr[middle];
            if (k == target) {
                found = true;
            } else if (k > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        if (found) {
            return middle;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int searchFor = 13;
        System.out.println("Value " + searchFor + " is positioned at: " + binarySearchArray(arr, searchFor));
    }

}
