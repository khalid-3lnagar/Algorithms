public class Main {

    public static void main(String[] args) {
        // write your code here
        BubbleSort sort = new BubbleSort();
        //get none-sorted array
        int[] n = new int[25];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("************** Normal Sort **********");
        int[] y = sort.bubbleSort(n);
        for (int m :
                y) {
            System.out.println(m);
        }
    }
}
