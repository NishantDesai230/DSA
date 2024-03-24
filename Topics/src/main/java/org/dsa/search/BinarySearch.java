package org.dsa.search;

import java.util.Scanner;

/**
 * This program performs binary search operations.
 * This can be done only if the array is sorted in an ascending manner.
 * Time Complexity : Worst Case O(logn) / Best Case O(1)
 * Space Complexity : Worst Case O(logn) / Best Case O(1)
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the value which you want to find: ");
        int value = scanner.nextInt();
        System.out.println("Enter values: ");
        for (int i=0;i<arr.length;i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println(getIndexBinarySearch(arr, value));
    }
    
    public static int getIndexBinarySearch(int[] arr, int targetValue) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high-low)/2; // This formula is similar to high+low/2 but just to avoid number overflow we're using this formula
            if (arr[mid] == targetValue) {
                return mid;
            } else if (arr[mid] < targetValue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
}