public class InsertionSortDescending {

    public static void insertionSortDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are smaller than key
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        insertionSortDescending(arr);

        System.out.print("Sorted (Descending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}