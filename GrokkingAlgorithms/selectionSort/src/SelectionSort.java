public class SelectionSort {

    int[] normalSelectionSort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = getSmallestIndex(i, arr);

            int tmp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = tmp;
        }
        return arr;
    }

    private int getSmallestIndex(int startPoint, int[] arr) {
        int smallestIndex = startPoint;
        for (int j = startPoint; j < arr.length; j++) {
            if (arr[smallestIndex] > arr[j])
                smallestIndex = j;
        }
        return smallestIndex;
    }

    /**
     * Recursion Selection Sort
     */

    private int getSmallestIndexRecursion(int startPoint, int smallestIndex, int[] arr) {
        if (startPoint == arr.length - 1)
            return smallestIndex;
        if (arr[smallestIndex] > arr[startPoint])
            smallestIndex = startPoint;
        return getSmallestIndexRecursion(startPoint + 1, smallestIndex, arr);

    }

    int[] recursionSelectionSort(int startPoint, int[] arr) {
        if (startPoint == arr.length - 1)
            return arr;

        int tmp = arr[startPoint];
        int smallestIndex = getSmallestIndexRecursion(startPoint, startPoint, arr);
        arr[startPoint] = arr[smallestIndex];
        arr[smallestIndex] = tmp;
        return recursionSelectionSort(startPoint + 1, arr);
    }

}
