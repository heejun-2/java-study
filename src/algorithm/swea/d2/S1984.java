package algorithm.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int tc = 1; tc <= T; tc++){

            st = new StringTokenizer(br.readLine());

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            double sum = 0;

            for(int i = 0; i < 10; i++){
                int tmp = Integer.parseInt(st.nextToken());
                max = Math.max(tmp, max);
                min = Math.min(tmp, min);
                sum += tmp;
            }

            sum = sum - max - min;

            System.out.println("#" + tc + " " + (int)(Math.round(sum / 8)));

        }
    }
}
