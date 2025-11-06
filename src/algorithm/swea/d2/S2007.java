package algorithm.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            String str = br.readLine();

            int length = 0;

            for(int j = 1; j < str.length() / 2; j++){
                String target = str.substring(0, j);
                String dupl = str.substring(j, j * 2);

                if(target.equals(dupl)){
                    length = j;
                    break;
                }

            }

            System.out.println("#" + i + " " + length);
        }
    }
}
