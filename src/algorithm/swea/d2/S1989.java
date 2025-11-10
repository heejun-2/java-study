package algorithm.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int result = 1;

        for(int tc = 1; tc <= T; tc++){
            String str = br.readLine();

            result = 1;

            for(int i = 0; i < str.length() / 2; i++){
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    result = 0;
                    break;
                }
            }

            System.out.println("#" + tc + " " + result);
        }

    }
}
