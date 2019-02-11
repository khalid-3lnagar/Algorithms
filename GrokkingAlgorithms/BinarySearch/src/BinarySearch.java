public class BinarySearch {

    static int normalBinarySearch(int index, int[] items) {

        int mid, first, last;
        first = 0;
        last = items.length - 1;
        if (index < items[first] || index > items[last])
            return -1;

        while (first <= last) {
            mid = (first + last) / 2;

            if (index == items[mid]) {
                return mid;
            } else if (index < items[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }

        }
        return -1;
    }

    static int recursionBinarySearch(int index, int[] items, int first, int last) {
        if (index < items[first] || index > items[last])
            return -1;

        int mid = (first + last) / 2;

        if (index == items[mid]) {
            return mid;
        }
        if (index > items[mid]) {
            return recursionBinarySearch(index, items, mid + 1, last);
        } else if (index < items[mid]) {
            return recursionBinarySearch(index, items, first, mid - 1);
        }
        return -1;

    }
}
