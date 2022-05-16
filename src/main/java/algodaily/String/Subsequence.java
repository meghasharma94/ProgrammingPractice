package algodaily.String;

import java.util.HashSet;
import java.util.Set;

public class Subsequence {


    static String subsequence(String subText,
                              int index,
                              int len) {
        String sub = "";
        for (int j = 0; j < len; j++) {
            if ((index & (1 << j)) != 0) {
                 sub += subText.charAt(j);
            }
        }
         return sub;
     }


    private static void iterativeMethod(String text) {
         Set<String> set = new HashSet<>();
         int len = text.length();
         int limit = (int) Math.pow(2, len);

        for (int i = 1; i <= limit - 1; i++) {
            String sub = subsequence(text, i, len);
            set.add(sub);
        }

        for (String s : set) {
                System.out.println(s);
        }
    }

    public static void loopMethod(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j <= text.length(); j++) {
                System.out.println(text.substring(i, j));
            }
        }
    }


    public static void main(String[] args) {
        String s = "abc";
        iterativeMethod(s);
        loopMethod(s);
      }
}
