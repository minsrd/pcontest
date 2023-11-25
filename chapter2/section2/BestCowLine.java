package chapter2.section2;

import java.util.ArrayList;
import java.util.List;

public class BestCowLine {
    public static void main(String[] args) {
        // input
        int n = 6;
        char[] s = { 'A', 'C', 'D', 'B', 'C', 'B' };

        // pointer
        int a = 0;
        int b = n - 1;

        // output
        List<Character> output = new ArrayList<>();

        // greedy search
        while (a <= b) {
            boolean pickLeft = false;

            for (int i = 0; a + i < b; i++) {
                if (s[a + i] < s[b - i]) {
                    pickLeft = true;
                    break;
                }
                if (s[a + i] > s[b - i]) {
                    break;
                }
            }

            if (pickLeft) {
                output.add(s[a++]);
            } else {
                output.add(s[b--]);
            }
        }
        System.out.println(output);
    }
}
