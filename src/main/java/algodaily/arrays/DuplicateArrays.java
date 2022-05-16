package algodaily.arrays;

import java.util.*;

public class DuplicateArrays {

    private static List<Integer> uniques(int[] array) {

        if (array.length == 0 || array.length == 1) {
            return new ArrayList<Integer>(array.length);
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int a : array) {
            set.add(Integer.valueOf(a));
        }
        return new ArrayList<Integer>(set);
    }


    public static void main(String args[]) {

        int[] array = {13, 5, 3, 5, 8, 13, 14, 5, 9};//{13, 5, 3, 5, 8, 13, 14, 5, 9};//{3, 5, 6, 9, 9, 4, 3, 12};

        List<Integer> l = uniques(array);

        for (Integer i : l) {
            System.out.println(i);
        }
 }
}
