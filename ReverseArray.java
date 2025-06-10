package abc;

public class ReverseArray {
    public static void reversearray(int[] a) {
        int i = 0, j = a.length - 1;
        while (i <j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        reversearray(a);
        System.out.println("reversed Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
