package algorithm.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc <= 10; tc++){
            int N = Integer.parseInt(br.readLine());

            int[] height = new int[N];

            st = new StringTokenizer(br.readLine(), " ");

            for(int i = 0; i < N; i++){
                height[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            int max = 0;

            for(int i = 2; i < N - 2; i++){
                max = 0;

                max = Math.max(Math.max(height[i - 2], height[i - 1]), Math.max(height[i + 1], height[i + 2]));

                if(height[i] > max){
                    cnt += height[i] - max;
                }
            }

            sb.append("#" + tc + " " + cnt).append("\n");

        }

        System.out.println(sb.toString());
    }
}
