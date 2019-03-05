public class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap them
                    swapTwoElements(j, j + 1, arr);
                    swapCount++;
                }
            }

            if (swapCount == 0) {
                break;
            }
        }

        return arr;
    }

    private int[] swapTwoElements(int i1, int i2, int[] arr) {
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
        return arr;
    }
}
