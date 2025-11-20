package algorithm.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1220 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc <= 10; tc++){
            int length = Integer.parseInt(br.readLine());

            int[][] arr = new int[length][length];

            for(int i = 0; i < length; i++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0; j < length; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;

            for(int i = 0; i < length; i++){
                for(int j = 0; j < length; j++){
                    if(arr[i][j] == 1 && i + 1 != length){
                        if(arr[i + 1][j] == 2) {
                            cnt++;
                        }
                        else{
                            arr[i + 1][j] = 1;
                        }
                    }
                }
            }

            sb.append("#").append(tc).append(" ").append(cnt).append("\n");

        }

        System.out.println(sb.toString());
    }
}
