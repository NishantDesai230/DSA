package org.dsa.search;

/**
 * This is the case of the binary search where we will not get the information that array is in ascending or descending order.
 * Time Complexity and Space Complexity will be same as Binary Search.
 */
public class OrderAgnositcBS {
    public static void main(String[] args) {
        int dscArr[] = {31, 20, 10, 9, 5, 1};
        int ascArr[] = {1,4,6,78,89};
        System.out.println(getIndexOGBinarySearch(ascArr, 89));
    }
    
    public static int getIndexOGBinarySearch(int[] arr, int targetValue) {
        
        boolean isAscending = arr[0] < arr[arr.length - 1];
        
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // This formula is similar to high+low/2 but just to avoid number overflow we're using this formula
            if (arr[mid] == targetValue) {
                return mid;
            } else {
                if (isAscending) {
                    if (arr[mid] < targetValue) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    if (arr[mid] < targetValue) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
