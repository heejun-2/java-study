package algorithm.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2072 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 1; i <= T; i++){
            int sum = 0;
            st = new StringTokenizer(br.readLine(), " ");

            while(st.hasMoreTokens()){
                int tmp = Integer.parseInt(st.nextToken());

                if(tmp % 2 == 1){
                    sum += tmp;
                }
            }

            System.out.println("#" + i + " " + sum);
        }
    }
}
