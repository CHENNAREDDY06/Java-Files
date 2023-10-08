package com.javaArrays;

import java.util.Arrays;
//the row and columns are sorted 
public class BinarySearchIn2dArray {
    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(Search(arr, 50)));
    }

    static int[] Search(int a[][], int target) {
        int row = 0;
        int colmn = a.length - 1; // Use a[0].length to get the number of columns
        while (row < a.length && colmn >= 0) {
            if (a[row][colmn] < target) {
                row++;
            } else if (a[row][colmn] > target) { // Use "else if" here
                colmn--;
            } else {
                return new int[] {row, colmn};
            }
        }
        return new int[] {-1};
    }
}
