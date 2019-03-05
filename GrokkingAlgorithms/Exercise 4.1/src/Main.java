import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int recursiveArraySum(int startPoint, Integer[] arr) {
        if (startPoint == arr.length) return 0;

        return arr[startPoint] + recursiveArraySum(startPoint + 1, arr);
    }

    public static void main(String[] args) {
        //get none-sorted array
        Integer[] nonSortedArray = new Integer[25];
        for (int i = 0; i < 25; i++)
            nonSortedArray[i] = ((int) ((Math.random() * 100) + 1));

        System.out.println("************** Normal Array Sum **********\n" +
                normalArraySum(nonSortedArray));

        System.out.println("************** Recursive Array Sum **********\n" +
                recursiveArraySum(0, nonSortedArray));

        //get none-sorted List
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nonSortedArray));

        System.out.println("************** Lambda Array Sum **********\n"
                + list.stream().mapToInt(x -> x).sum());

    }

    static int normalArraySum(Integer[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }

}
