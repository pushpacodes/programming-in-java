public class Quicksort {

    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int pivotIndex = partition(arr, si, ei);

        quickSort(arr, si, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];

        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;

        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        quickSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}