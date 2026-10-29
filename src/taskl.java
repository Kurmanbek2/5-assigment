import java.util.Scanner;

public class taskl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int petya = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= petya) {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}