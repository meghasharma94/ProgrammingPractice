package algodaily.maxProfit;

public class BuyAndSellAtMostTwo {

    private int currentMaxDiff;
    private int buyIndex;
    private int sellIndex;


    public void findIndex(int[] arr , int size, int txnDays){

        int minElement=arr[0];
        int minElementIndex=0;
        int maxProfit=0;


        for(int i=1;i<arr.length;i++){

            if((arr[i]-minElement > currentMaxDiff) &&  (minElementIndex < i)){

                currentMaxDiff=arr[i]-minElement;
                maxProfit=maxProfit+currentMaxDiff;
//                if(currentMaxDiff > maxProfit){
//                    maxProfit=currentMaxDiff;
//                    buyIndex=minElementIndex;
//                    sellIndex=i;
//                }
            }

            if(arr[i]<minElement){
                minElement=arr[i];
                minElementIndex=i;

                currentMaxDiff=0;
            }
        }

        System.out.println("Max profit is" + maxProfit);





    }

    public static void main(String[] args) {

        BuyAndSellAtMostTwo maxdiff = new BuyAndSellAtMostTwo();
        int arr[] = {3,3,5,0,0,3,1,4};
        int size = arr.length;
        int  txnDays=2;

        maxdiff.findIndex(arr,size,txnDays);

    }
}
