package algorithm.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];

            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0; j < N; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;

            for(int i = 0; i < N; i++){
                int tmp = 0;
                for(int j = 0; j < N; j++){
                    if(arr[i][j] == 0){
                        if(tmp == K) cnt++;
                        tmp = 0;
                    }
                    if(arr[i][j] == 1) tmp++;
                }

                if(tmp == K) cnt++;
            }

            for(int i = 0; i < N; i++){
                int tmp = 0;
                for(int j = 0; j < N; j++){
                    if(arr[j][i] == 0){
                        if(tmp == K) cnt++;
                        tmp = 0;
                    }
                    if(arr[j][i] == 1) tmp++;
                }

                if(tmp == K) cnt++;
            }

            sb.append("#" + tc + " " + cnt).append("\n");

        }

        System.out.println(sb.toString());
    }
}
