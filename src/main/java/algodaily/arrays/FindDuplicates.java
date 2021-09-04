package algodaily.arrays;

public class FindDuplicates {

        // Function to print duplicates
        void printRepeating(int arr[], int size)
        {
            int i;
            System.out.println("The repeating elements are : ");

            for (i = 0; i < size; i++) {
                int j = Math.abs(arr[i]);
                if (arr[j] >= 0)
                    arr[j] = -arr[j];
                else
                    System.out.print(j + " ");
            }
        }

    void printRepeating2(int numRay[], int size)
    {
        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length]
                    = numRay[numRay[i] % numRay.length]
                    + numRay.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }
    }

        // Driver code
        public static void main(String[] args)
        {
            FindDuplicates duplicate = new FindDuplicates();
            int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
            int arr_size = arr.length;

            //duplicate.printRepeating(arr, arr_size);
            duplicate.printRepeating2(arr,arr_size);
        }
    }

