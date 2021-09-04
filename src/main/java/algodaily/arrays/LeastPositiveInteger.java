package algodaily.arrays;

public class LeastPositiveInteger {


    public static int segregate(int[]arr,int size){

        int j=0;
        for(int i=0;i<size;i++){
            int temp;
            if(arr[i]<=0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                j++;
            }
        }
     return j;
    }






    public static int findLeastPositiveInteger(int[] arr){

        int shift=segregate(arr,arr.length);
        int[] arr2=new int[arr.length-shift];
        int j=0;
        for(int i=shift;i<arr.length;i++){
            arr2[j]=arr[i];
            j++;
        }



       int miss=findMissing(arr2);

        return miss;

    }

    public static int findMissing(int[] arr2){

        int size=arr2.length;
        for(int i=0;i< arr2.length;i++) {

//            int j=Math.abs(arr2[i]);
//            if(arr2[j]>0){
//                arr2[j] = -arr2[j];
//            }else{
//                return j;
//            }

            int j = Math.abs(arr2[i]);
            if (j - 1 < size && arr2[j-1] > 0)
                arr2[j - 1] = -arr2[j - 1];
            }

            for(int i=0;i<size;i++){
                if(arr2[i] >0){
                    return i+1;
                }

            }
        return size+1;}






    public static void main(String [] args){

        int[] arr = { 0, 10, 2, -10, -20 };
       // int arr_size = arr.length;
        int missing = findLeastPositiveInteger(arr);
        System.out.println("The smallest positive missing number is " + missing);


    }
}
