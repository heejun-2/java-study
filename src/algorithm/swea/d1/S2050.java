package algorithm.swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i ++){
            int tmp = str.charAt(i) - '0';
            sb.append(tmp).append(" ");
        }

        System.out.println(sb.toString());
    }
}
