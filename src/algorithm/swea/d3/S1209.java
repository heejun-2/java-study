package algorithm.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc <= 10; tc++){
            int T = Integer.parseInt(br.readLine());

            int[][] arr = new int[100][100];

            for(int i = 0; i < 100; i++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0; j < 100; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = 0;

            int sum1 = 0;
            int sum2 = 0;

            // 가로, 세로
            for(int i = 0; i < 100; i++){
                sum1 = 0;
                sum2 = 0;
                for(int j = 0; j < 100; j++){
                    sum1 += arr[i][j];
                    sum2 += arr[j][i];
                }
                max = Math.max(max, sum1);
                max = Math.max(max, sum2);
            }


            // 대각
            sum1 = 0;
            sum2 = 0;

            for(int i = 0; i < 100; i++){
                sum1 += arr[i][i];
                sum2 += arr[i][100 - i - 1];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);

            sb.append("#" + tc + " " + max + "\n");

        }

        System.out.println(sb.toString());
    }
}
