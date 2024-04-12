package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class KthElementOfTwoArrays {
    static long kthElement( int arr1[], int arr2[], int k) {
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(arr1[i]);
        }
        for(int j = 0 ;j < m ;j++){
            list.add(arr2[j]);
        }
        Collections.sort(list);
        long kEle = list.get(k-1);
        return kEle;
    }
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        System.out.println(kthElement(arr1,arr2,5));
    }
}
