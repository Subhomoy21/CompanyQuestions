package Arrays;

public class CheckIfStringArraysAreEquivalent {
    static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        // take two strings
        String s = "";
        String s2 = "";
        for(int i = 0;i<word1.length;i++){
            s = s + word1[i];
        }
        for(int i = 0;i<word2.length;i++){
            s2 = s2 + word2[i];
        }
        return s.equals(s2);
    }
    // more better
    static boolean arrayStringsAreEqualStringBuilder(String[] word1, String[] word2) {
        StringBuilder sb= new StringBuilder("");
        StringBuilder sb1 = new StringBuilder("");

        for(int i=0;i<word1.length;i++){
            sb.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            sb1.append(word2[i]);
        }
        return sb.toString().equals(sb1.toString()); // imp part
    }
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String word2[] = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
        System.out.println(arrayStringsAreEqualStringBuilder(word1,word2));
    }
}
