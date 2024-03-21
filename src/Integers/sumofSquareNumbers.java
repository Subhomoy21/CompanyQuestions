package Integers;

//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
//Example 1:
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5

public class sumofSquareNumbers {
    static boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (int) Math.sqrt(c);
        while(r>=l){
            long sqSum = l*l + r*r;
            if(sqSum==c){
                return true;
            }
            else if(sqSum>c){
                r--;
            }
            else{
                l++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(8)); // try 2 its a exceptional case copy must!
    }
}
