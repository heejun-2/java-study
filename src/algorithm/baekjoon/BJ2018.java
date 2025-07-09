package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 투 포인터 활용
public class BJ2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 1;
        int start_index = 1;
        int end_index = 1;
        int cnt = 1;

        while(end_index != N){
            if(sum == N){
                cnt++;
                end_index++;
                sum += end_index;
            }
            else if(sum > N){
                sum -= start_index;
                start_index++;
            }
            else{
                end_index++;
                sum += end_index;
            }
        }

        System.out.println(cnt);

    }
}
