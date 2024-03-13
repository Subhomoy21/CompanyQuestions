package Integers;
//Question -> int n = 8
//            1,2,3,4,5,6,7,8 (1+2+3+4+5+6 = 21) and (6+7+8 = 21)
//            ans = 6; TC->O(n^2)
public class findPivotInteger {
    // naive solution
    static int pivot(int n){
        for (int i = 0; i < n; i++) {
            int lSum = 0;
            int rSum = 0;
            for (int j = 0; j < i; j++) {
                lSum = lSum + j;
            }
            for (int j = n; j > i ; j--) {
                rSum = rSum + j;
            }
            if(lSum == rSum){
                return i;
            }
        }
        return -1;
    }
    // OPTIMISED SOLUTION
    static int pivot2(int n){
        int ls= 0;
        int rs = n*(n+1)/2;
        for (int i = 1; i <= n; i++) {
            ls = ls + i;
            rs = rs - (i-1);
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println("The pivot Integer is:");
        System.out.println(pivot(n));
        System.out.println(pivot2(8));
    }
}
