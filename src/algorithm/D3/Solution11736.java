package algorithm.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution11736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 1; i <= T; i++) {
            int cnt = 0;
            int N = Integer.parseInt(br.readLine());

            // N개의 정수 배열에 입력
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
            for(int k = 0; k < N; k++) {
                arr[k] = Integer.parseInt(st.nextToken());
            }

            // 각각의 경우 판별
            int[] target = new int[3];
            for(int j = 1; j < N - 1; j++){
                target[0] = arr[j-1];
                target[1] = arr[j];
                target[2] = arr[j+1];

                Arrays.sort(target);
                if(target[1] == arr[j]) cnt++;
            }

            System.out.println("#" + i + " " + cnt);
        }
    }
}
