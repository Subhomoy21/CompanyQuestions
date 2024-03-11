package com.company.Arrays;

public class threeSumClosest {
    // naive solution O(n^3)
    static int closest(int[]arr , int x){
        int n = arr.length;
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (Math.abs(x - closestSum) > Math.abs(x - sum)){
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
    }
    // optimised (two-pointer)

    public static void main(String[] args) {
        int arr[] = { -1, 2, 1, -4 };
        int x = 1;
        System.out.print(closest(arr, x));
    }
}
