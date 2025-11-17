package algorithm.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc <= T; tc++){
            int N = Integer.parseInt(br.readLine());

            sb.append("#"+tc).append("\n");
            for(int i = 0; i < money.length; i++){
                int tmp = N / money[i];
                N %= money[i];
                sb.append(tmp + " ");
            }

            sb.append("\n");

        }

        System.out.println(sb.toString());
    }
}
