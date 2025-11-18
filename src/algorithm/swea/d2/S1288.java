package algorithm.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc <= T; tc++){
            int N = Integer.parseInt(br.readLine());

            int[] arr = new int[10];

            int multiply = 1;

            int result = 0;

            while(true){
                int target = multiply * N;

                String str = String.valueOf(target);

                for(int i = 0; i < str.length(); i++){
                    arr[str.charAt(i) - '0']++;
                }

                boolean flag = true;

                for(int i = 0; i < 10; i++){
                    if(arr[i] == 0){
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    result = target;
                    break;
                }

                multiply++;
            }

            sb.append("#" + tc + " " + result + "\n");
        }

        System.out.println(sb.toString());
    }
}
