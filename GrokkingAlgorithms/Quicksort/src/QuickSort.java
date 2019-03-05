import java.util.LinkedList;
import java.util.List;

public class QuickSort {


    public List<Integer> qSort(List<Integer> list) {
        //Base Case
        if (list.size() < 2)
            return list;
        //pivot
        int pivot = list.get(0);

        List<Integer> rightList = new LinkedList<>();
        List<Integer> liftList = new LinkedList<>();
        // D&Q
        for (int i = 1; i < list.size(); i++) {
            Integer n = list.get(i);
            if (n > pivot) rightList.add(n);
            else liftList.add(n);
        }
        //add Lift  Array
        LinkedList<Integer> sortedArray = new LinkedList<>(qSort(liftList));
        //add pivot
        sortedArray.add(pivot);
        //add the right list
        sortedArray.addAll(qSort(rightList));

        return sortedArray;
    }
}
