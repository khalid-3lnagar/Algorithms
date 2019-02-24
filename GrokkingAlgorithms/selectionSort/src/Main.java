public class Main {

    public static void main(String[] args) {

        SelectionSort sort = new SelectionSort();
        //get none-sorted array
        int[] n = new int[25];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("************** Normal Sort **********");
        int[] y = sort.normalSelectionSort(n);
        for (int m :
                y) {
            System.out.println(m);
        }

        System.out.println("************** Recursion Sort **********");
        y = sort.recursionSelectionSort(0, n);
        for (int m :
                y) {
            System.out.println(m);
        }
    }
}
