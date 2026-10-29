import java.util.Scanner;

public class tasko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int size = n;
        int destroyed = 0;
        boolean changed = true;
        while (changed) {
            changed = false;
            int i = 0;
            while (i < size) {
                int j = i;
                while (j < size && a[j] == a[i]) {
                    j++;
                }
                int len = j - i;
                if (len >= 3) {
                    // сдвигаем хвост влево на место удалённой цепочки
                    for (int k = j; k < size; k++) {
                        a[k - len] = a[k];
                    }
                    size -= len;
                    destroyed += len;
                    changed = true;
                    break;
                }
                i = j;
            }
        }
        System.out.println(destroyed);
    }
}