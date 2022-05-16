package algodaily.arrays;

import java.util.*;

public class TreatDistribution {

    private int treatDistribution(int[] treat) {

        HashMap<Integer, Double> countTreat = new HashMap<Integer, Double>();
        double count = 0.0;

        for (int t : treat) {

            if (countTreat.containsKey(t)) {

                countTreat.put(t, countTreat.get(t) + 1);
            } else {

                countTreat.put(t, 1.0);
            }

        }

        for (Integer t : countTreat.keySet()) {
            double val;

            val = countTreat.get(t);
            count += Math.round(val / 2.0);


        }
        return (int) count;

    }

    public static void main(String args[]) {

        int[] s = {1, 1, 2, 4};//{3,3,2,2};//{3,3,2,2,2,7,7,7};
        TreatDistribution t = new TreatDistribution();
        int size = t.treatDistribution(s);


        System.out.print("Sister's treat :" + size);
    }
}
