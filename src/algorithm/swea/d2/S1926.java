package algorithm.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        for(int i = 1; i <= N; i++) {
            String str = String.valueOf(i);
            cnt = 0;

            for(int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(ch == '3' || ch == '6' || ch == '9') {
                    cnt++;
                }
            }

            if(cnt == 0){
                sb.append(str);
            }
            else{
                for(int k = 0; k < cnt; k++) {
                    sb.append("-");
                }
            }

            sb.append(" ");

        }

        System.out.println(sb);
    }
}
