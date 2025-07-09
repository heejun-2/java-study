package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 투 포인터 활용
public class BJ1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int cnt = 0;
        int i = 0;
        int j = N - 1;

        while(i < j){
            if(arr[i] + arr[j] == M){
                cnt++;
                i++;
                j--;
            }
            else if(arr[i] + arr[j] < M){
                i++;
            }
            else{
                j--;
            }
        }

        System.out.println(cnt);
    }
}
