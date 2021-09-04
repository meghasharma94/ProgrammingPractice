package algodaily.arrays;

import java.util.*;


class DescendingComparator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {

        return Integer.compare(o1,o2);
    }
}

public class FindKthSmallest {



    public static int kLargest(Integer[] arr , int k){

        Arrays.sort(arr);

        int x=arr[k-1];
        return x;

    }

    // Using Java 8 and warppers
    public static ArrayList<Integer> kLargest(int[] arr , int k){

        Integer[] arrays_obj= Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrays_obj, Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>(k);

        for (int i = 0; i < k; i++)
            list.add(arrays_obj[i]);

        return list;

    }

    //using priority queues

    public static void findKthElement(int[] arr,int k){

        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();


        for(int x:arr){

            pq.add(x);

//            if(pq.size()>k){
//
//                pq.remove();
//            }
        }

        System.out.println(pq.peek());
     }



    public static void main(String[] args){

        Integer arr[] = new Integer[] { 1, 23, 12, 9,
                30, 2, 50 };
        int k = 3;
        //int val=kLargest(arr, k);

        //System.out.println("The kth smallest value is" + val);
        int[] prim_array = { 1, 23, 12, 9, 30, 2, 50 };
        //System.out.println(kLargest(prim_array , k));
        findKthElement(prim_array,k);





    }



}
