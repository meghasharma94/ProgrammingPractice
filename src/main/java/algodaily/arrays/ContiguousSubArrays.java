package algodaily.arrays;

public class ContiguousSubArrays {

    private static int kadanes(int[] a, int length){

        int maxSum=Integer.MIN_VALUE;
        int currentMax=0;

        for(int i=0;i<length;i++) {

            currentMax=currentMax+a[i];
            if(maxSum < currentMax){
                maxSum=currentMax;
            }
            if(currentMax <0){
                currentMax=0;
            }

     }
        return maxSum;
    }


    private static int maxSubArrayDP(int[] a){

        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < a.length; i++)
        {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }




    public static void main(String[] args){

        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        int max_sum = kadanes(a, n);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }}