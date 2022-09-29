public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {8, 3, 4, 6, 9};

        BubbleSorting(arr);
    }

    static void BubbleSorting(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 1; j < arr.length-1; j++)
            {
                if (arr[j-1] > arr[j]) {

                    int temp = arr[j - 1];
                    arr[j] = temp;
                    System.out.println(arr[i]);
                }
            }
        }
    }

}
