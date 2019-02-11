import java.util.Scanner;

public class Main {
    /**
     * this app is for test binarySearch by get form user an index to search on list of sorted numbers
     * and it's limits decided by  the user
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt(),
                first = in.nextInt(),
                last = in.nextInt();
        in.close();

        int[] items = new int[(last + 1) - first];

        for (int j = 0; j < items.length; j++, first++) {
            items[j] = first;
        }

        //using normal binary search
        last = BinarySearch.normalBinarySearch(index, items);

        if (last == -1) System.out.println("null");
        else System.out.println(last);

        //using recursion Binary Search
        last = BinarySearch.recursionBinarySearch(index, items, 0, items.length - 1);
        if (last == -1) System.out.println("null");
        else System.out.println(last);

    }


}
