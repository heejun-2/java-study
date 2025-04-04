package algorithm.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2001 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];

            // 배열 값 저장
            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k = 0; k < N; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            // 최대값
            int max = 0;
            // 죽은 파리의 개수
            int sum = 0;

            for(int j = 0; j < N - M + 1; j++){
                for(int k = 0; k < N - M + 1; k++){
                    sum = 0;
                    for(int x = 0; x < M; x++){
                        for(int y = 0; y < M; y++){
                            sum += arr[j + x][k + y];
                        }
                    }
                    if(sum > max){
                        max = sum;
                    }
                }
            }

            System.out.println("#" + i + " " + max);

        }
    }
}
