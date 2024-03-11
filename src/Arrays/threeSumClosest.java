package Arrays;
import java.util.Arrays;
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
    static int threeSumClosest(int[] nums, int target) {
        int min_diff = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        int cSum = 0;
        for(int i = 0;i<n;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==target){
                    return target;
                }
                else{
                    int diff = Math.abs(target - sum);
                    if(diff < min_diff){
                        min_diff = diff;
                        cSum = sum;
                    }
                }
                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
            }
        }
        return cSum;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 1, -4 };
        int x = 1;
        System.out.print(closest(arr, x));
        System.out.println();
        System.out.println(threeSumClosest(arr,x));
    }
}
