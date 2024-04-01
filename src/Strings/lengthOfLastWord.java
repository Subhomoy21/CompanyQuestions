package Strings;
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.
//Example 1:
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
//Example 2:
//Input: s = "   fly me   to   the moon  "
//Output: 4
//Explanation: The last word is "moon" with length 4.
public class lengthOfLastWord {
    // naive
    static int lastWord(String s){
        int len = 0;
        int n = s.length() -1;
        while(n>=0 && s.charAt(n) == ' '){
            n--;
        }
        while(n>=0 && s.charAt(n) !=' '){
            len++;
            n--;
        }
        return len;
    }
    // optimal solution
    static int lengthOfLastWord(String s){
        int len = 0;
        int i = s.length() - 1;
        while (i>=0){
            if(s.charAt(i) == ' '){
                if(len == 0){
                    i--;
                }
                else{
                    break;
                }
            }
            else{
                // jab letter mile toh
                len++;
                i--;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String str = "Subhomoy Das";
        System.out.println(lastWord(str));
        System.out.println(lengthOfLastWord(str));
    }
}
