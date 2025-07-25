package algorithm.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution22574 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());

            long floor = 0;

            for(int j = 1; j <= N; j++) {
                if(floor + j == P){
                    floor -= 1;
                }
                floor += j;
            }

            System.out.println(floor);
        }
    }
}
