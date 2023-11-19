package chapter2.section1;

import java.util.Scanner;

/**
 * Check if the partial sum from array a can be equal to n.
 * Using DFS (Depth-First Search) 
 */
public class PartialSum {
    private static int n;
    private static int[] a;
    private static int k;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        k = scanner.nextInt();

        if (dfs(0,0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    /**
     * 
     * @param i
     * @param sum
     * @return
     */
    private static boolean dfs(int i, int sum) {

        // base case
        if (i == n) {
            return sum == k;
        }
        // case not using a[i]
        if (dfs(i + 1, sum)) {
            return true;
        }
        // case using a[i]
        if (dfs(i + 1, sum + a[i])) {
            return true;
        }

        return false;

    }

}
