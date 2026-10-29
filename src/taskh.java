import java.util.Scanner;

public class taskh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i + 1 < n; i += 2) {
            int tmp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = tmp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}