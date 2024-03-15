package Arrays;

public class ProductOfArrayExceptSelf {
    static int[] productExceptSelf(int[] nums) { // naive solution O(n^2)
        int n = nums.length;
        int res [] = new int[n];
        for(int i = 0;i<n;i++){
            int mul = 1;
            for(int j = 0;j<n;j++){
                if(i==j){
                    continue;
                }
                mul = mul * nums[j];
            }
            res[i] = mul;
        }
        return res;
    }
    // using the division process for O(n)
    static int[] pEs(int[] arr){
        int n = arr.length;
        int res [] = new int[n];
        int mul = 1;
        for (int i = 0; i < n; i++) {
            mul = mul * arr[i];
        }
        for (int i = 0; i < n ; i++) {
            int num = mul / arr[i];
            res[i] = num;
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int [] res = productExceptSelf(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int [] res1 = pEs(nums);
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + " ");
        }
    }
}
