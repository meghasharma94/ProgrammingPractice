package algodaily.String;


import java.util.*;

/***
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example : Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * @author Megha Sharma
 * @Date : 28th August 2021
 * */
public class GroupAnagram {


    private static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<List<String>> finalList = new ArrayList<List<String>>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);
            if (map.containsKey(newWord)) {
                map.get(newWord).add(s);
            } else {
                List<String> word = new ArrayList<String>();
                word.add(s);
                map.put(newWord, word);
            }
        }
        for (String s : map.keySet()) {
            finalList.add(map.get(s));
        }
        return finalList;
    }


    public static void main(String[] args) {
        String[] group = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramGroup = groupAnagrams(group);

        for (List<String> list : anagramGroup) {
            System.out.println(list);
        }
    }
}
