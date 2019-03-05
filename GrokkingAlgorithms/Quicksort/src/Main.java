import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        QuickSort sort = new QuickSort();
        //get none-sorted array
        ArrayList<Integer> nonSortedArray = new ArrayList<>();
        for (int i = 0; i < 25; i++)
            nonSortedArray.add((int) ((Math.random() * 100) + 1));

        System.out.println("************** Non-sorted Array **********");
        nonSortedArray.forEach(x -> System.out.print(x + " "));

        System.out.println("\n************** Quick Sort **********");
        List<Integer> sortedArray = sort.qSort(nonSortedArray);
        sortedArray.forEach(x -> System.out.print(x + " "));


    }
}
