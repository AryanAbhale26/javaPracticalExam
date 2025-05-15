
interface SortStrategy {
    void sort(int[] array);
}


class BubbleSort implements SortStrategy {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}

// QuickSort.java
class QuickSort implements SortStrategy {
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}

// MergeSort.java
class MergeSort implements SortStrategy {
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int[] left = java.util.Arrays.copyOfRange(arr, l, m + 1);
        int[] right = java.util.Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length)
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
}

// Sorter.java
class Sorter {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        strategy.sort(array);
    }
}


public class designSORT {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        Sorter sorter = new Sorter();

        sorter.setStrategy(new BubbleSort());
        sorter.sort(arr);
        System.out.println("BubbleSort: " + java.util.Arrays.toString(arr));

        arr = new int[]{5, 3, 8, 4, 2};
        sorter.setStrategy(new QuickSort());
        sorter.sort(arr);
        System.out.println("QuickSort: " + java.util.Arrays.toString(arr));

        arr = new int[]{5, 3, 8, 4, 2};
        sorter.setStrategy(new MergeSort());
        sorter.sort(arr);
        System.out.println("MergeSort: " + java.util.Arrays.toString(arr));
    }
}
