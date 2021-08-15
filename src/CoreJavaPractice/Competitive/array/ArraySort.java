package CoreJavaPractice.Competitive.array;

public class ArraySort {
    public static void main(String[] args) {

        try {
            int[] a;
            a = new int[]{6, 5, 2, 8, 6, 1};

            int n = a.length;
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n-1; i++) {
                    if (a[i] > a[i + 1]) {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                    }
                }
            }
            System.out.print("SortedArray==> [");
            for (int i =0; i<n;i++) {
                System.out.print(" "+a[i]+" ");
            }
            System.out.print("]");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
