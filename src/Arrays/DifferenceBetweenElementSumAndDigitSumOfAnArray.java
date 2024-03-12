package Arrays;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    static int differenceOfSum(int[] nums) {
        int sumInArr = 0;
        int sod = 0;
        for(int i = 0;i<nums.length;i++){
            sumInArr = sumInArr + nums[i];
            int num = nums[i];
            if(num>9){
                sod = sod + sumOfdigits(num);
            }
            else{
                sod = sod + num;
            }
        }
        return Math.abs(sumInArr - sod);
    }
    static int sumOfdigits(int num){
        int sum = 0;
        while(num>0){
            int ld = num%10;
            sum = sum + ld;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr= {1,15,6,3};
        System.out.println(differenceOfSum(arr));
    }
}
