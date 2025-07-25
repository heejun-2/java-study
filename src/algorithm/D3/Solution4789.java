package algorithm.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++) {
            String str = br.readLine();

            int need = 0;
            int total = 0;

            for(int i = 0; i < str.length(); i++) {
                int num = str.charAt(i) - '0';

                if(i == 0){
                    total += num;
                }
                else{
                    if(total < i){
                        need += i - total;
                        total = i + num;
                    }
                    else{
                        total += num;
                    }
                }
            }

            System.out.println("#" + tc + " " + need);
        }
    }
}
