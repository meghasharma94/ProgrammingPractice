package algodaily.maxProfit;

public class BuyAndSellGold {

    private int currentMaxDiff;
    private int buyIndex;
    private int sellIndex;

    private void findIndex(int[] arr, int size) {
        if (size == 2) {
            return;
        }
        int minElement = arr[0];
        int minElementIndex = 0;
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {

            if ((arr[i] - minElement > currentMaxDiff) && (minElementIndex < i)) {

                currentMaxDiff = arr[i] - minElement;
                if (currentMaxDiff > maxProfit) {
                    maxProfit = currentMaxDiff;
                    buyIndex = minElementIndex;
                    sellIndex = i;
                }
            }

            if (arr[i] < minElement) {
                minElement = arr[i];
                minElementIndex = i;
                currentMaxDiff = 0;
            }
        }

        System.out.println("The maximum profit is  : " + maxProfit + "  for buy index : " + buyIndex + "  and sell index : "
                + sellIndex
        );


    }

    public static void main(String[] args) {
        BuyAndSellGold maxdiff = new BuyAndSellGold();
        int arr[] = {7, 12, 5, 3, 11, 6, 10, 2, 9};
        int size = arr.length;
        maxdiff.findIndex(arr, size);

    }
}
