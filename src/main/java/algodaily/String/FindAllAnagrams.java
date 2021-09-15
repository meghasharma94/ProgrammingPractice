package algodaily.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem : 438. Find All Anagrams in a String
 *
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 * **/
public class FindAllAnagrams {

     /**
     * Time complexity: O((n-m) * m log m)
     * where,
     * n = text length
     * m = pattern length
     *
     * @param text
     * @param pattern
     * @return
     */
    public static List<Integer> findAllAnagramsInTextNaive(String text, String pattern){

        int textLen = text.length();
        int patternLen = pattern.length();

//        if(textLen==0 || patternLen==0 || textLen < patternLen){
//
//            return null;
//        }
        List<Integer> soln=new ArrayList<Integer>();

        char[] patternCharacter =pattern.toCharArray();
        Arrays.sort(patternCharacter);

        String sortedPattern=String.valueOf(patternCharacter);

        String subText;
        String subTextSorted;
        char[] subTextChars;


        for(int i=0;i<textLen-patternLen;i++){

            subText=text.substring(i,i+patternLen);
            subTextChars=subText.toCharArray();
            Arrays.sort(subTextChars);
            subTextSorted=String.valueOf(subTextChars);

            if(subTextSorted.equals(sortedPattern)){
                soln.add(i);
            } }

        return soln;
    }

    public static  List<Integer> findAllAnagramsInText(String text, String pattern) {

        int textLen = text.length();
        int patternLen = pattern.length();

        List<Integer> soln=new ArrayList<Integer>();

        int[] textCharsCount=new int[26];
        int[] patternCharsCount=new int[26];

        for (int i = 0; i < patternLen; i++) {
            patternCharsCount[pattern.charAt(i)-'a']++;
        }

        for (int i = 0; i < textLen; i++) {
            textCharsCount[text.charAt(i)-'a']++;
            if (i >= patternLen) {
                textCharsCount[text.charAt(i - patternLen) - 'a']--;
            }
                if(Arrays.equals(textCharsCount,patternCharsCount)){
                     soln.add(i-patternLen+1);
             }

        }
            return soln;
        }


    public static void main(String[] args){

        System.out.println("----------------Naive Method ---------------");

        // basic use cases
        System.out.println(findAllAnagramsInTextNaive("cbaebabacd", "abc"));
        System.out.println(findAllAnagramsInTextNaive("abab", "ab"));
        System.out.println(findAllAnagramsInTextNaive("af", "af"));
        System.out.println(findAllAnagramsInTextNaive("af", "be"));

        // corner case
        System.out.println(findAllAnagramsInTextNaive("", "ab"));

        System.out.println("----------------Optimised Method ---------------");


        // basic use cases
        System.out.println(findAllAnagramsInText("cbaebabacd", "abc"));
        System.out.println(findAllAnagramsInText("abab", "ab"));
        System.out.println(findAllAnagramsInText("af", "af"));
        System.out.println(findAllAnagramsInText("af", "be"));

        // corner case
        System.out.println(findAllAnagramsInText("", "ab"));



    }

}
