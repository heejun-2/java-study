package algorithm.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            int N = Integer.parseInt(br.readLine());

            int result = 0;

            for(int i = 1; i <= N; i++){
                if(i % 2 == 0){
                    result -= i;
                }
                else{
                    result += i;
                }
            }

            System.out.println("#" + tc + " " + result);
        }
    }
}
