import java.util.Scanner;

public class taskm {
    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = i;
        }
        reverse(a, A, B);
        reverse(a, C, D);
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}