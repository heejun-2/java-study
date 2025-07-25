package algorithm.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution21425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int cnt;

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            cnt = 0;

            while(true){
                if(A >= B){
                    B += A;
                }
                else{
                    A += B;
                }

                cnt++;

                if(A > N || B > N){
                    break;
                }

            }

            System.out.println(cnt);

        }
    }
}
