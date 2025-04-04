package algorithm.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2025 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int sum = 0;

        for(int i = 1; i <= T; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
