package chapter1.section6;
import java.util.Scanner;

/**
 * Triangle
 */
public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max_total_length = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 最大だけ求めればよいので、順番まで求める必要はない
                    int total_edge_length = a[i] + a[j] + a[k];
                    int max_edge_length = Math.max(a[i], Math.max(a[j], a[k]));
                    int rest_edge_length = total_edge_length - max_edge_length;

                    if (rest_edge_length <= max_edge_length) {
                        continue;
                    } else {
                        if (total_edge_length > max_total_length) {
                            max_total_length = total_edge_length;
                        }
                    }
                }
            }
        }
        System.out.println("最大の周長" + max_total_length);

    }
}