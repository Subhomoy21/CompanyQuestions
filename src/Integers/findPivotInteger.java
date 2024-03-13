package Integers;
//Question -> int n = 8
//            1,2,3,4,5,6,7,8 (1+2+3+4+5+6 = 21) and (6+7+8 = 21)
//            ans = 6;
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
    public static void main(String[] args) {
        int n = 8;
        System.out.println("The pivot Integer is:");
        System.out.println(pivot(n));
    }
}
