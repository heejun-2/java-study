package algorithm.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1859 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long max = 0; // 최대값
            int cnt = 0; // 현재 구매갯수
            long sum = 0; // 현재 구매가
            long result = 0; // 최종 값

            for(int j = arr.length - 1; j >= 0; j--) {
                // 팔기
                if(arr[j] > max) {
                    result += (max * cnt - sum);
                    max = arr[j];
                    // 초기화
                    sum = 0;
                    cnt = 0;
                }
                // 사기
                else{
                    sum += arr[j];
                    cnt++;
                }

            }

            // 마지막 한번 더 해주기
            result += (max * cnt - sum);

            System.out.println("#" + i + " " + result);
        }
    }
}
