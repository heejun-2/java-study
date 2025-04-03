package algorithm.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++) {
            String str = br.readLine();
            boolean isPass = true;
            for(int j = 0; j < str.length() / 2; j++){
                if(str.charAt(j) != str.charAt(str.length() - 1 - j)){
                    isPass = false;
                    break;
                }
            }

            String result = "1";
            if(!isPass){
                result = "0";
            }

            System.out.println("#" + i + " " + result);
        }
    }
}
