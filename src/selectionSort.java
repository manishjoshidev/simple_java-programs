public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 7, 2, 5};
        System.out.println(arr);

    }

    static void sortSelect(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[index] > arr[j])
                        index = j;
                }
                int temp=arr[i];
                arr[index]=temp;
            }
        }
    }
}
