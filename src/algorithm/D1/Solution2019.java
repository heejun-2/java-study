package algorithm.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2019 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <= T; i++) {
            sb.append((int)Math.pow(2, i)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
