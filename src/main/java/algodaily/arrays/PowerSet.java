package algodaily.arrays;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem : 78. Subsets
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * <p>
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * <p>
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 **/
public class PowerSet {

    private static List<Set<Integer>> subsets(int[] nums) {

        long pow_set_size = (long) Math.pow(2, nums.length);
        List<Set<Integer>> ans = new ArrayList<Set<Integer>>();
        Set<Integer> list = new HashSet<>();
        int counter, j;

        for (counter = 0; counter < pow_set_size; counter++) {

            for (j = 0; j < nums.length; j++) {

                if ((counter & (1 << j)) > 0) {

                    list.add(nums[j]);

                }

            }


        }
        return ans;

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }
}
