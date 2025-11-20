package algorithm.swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc <= 10; tc++){
            int len = Integer.parseInt(br.readLine());
            char[][] arr = new char[8][8];

            for(int i = 0; i < 8; i++){
                String str = br.readLine();
                for(int j = 0; j < 8; j++){
                    arr[i][j] = str.charAt(j);
                }
            }

            int cnt = 0;

            // 가로
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8 - len + 1; j++){
                    boolean flag = true;
                    for(int k = 0; k < len / 2; k++){
                        if(arr[i][j + k] != arr[i][j - k + len - 1]){
                            flag = false;
                        }
                    }
                    if(flag) cnt++;
                }
            }


            // 세로
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8 - len + 1; j++){
                    boolean flag = true;
                    for(int k = 0; k < len / 2; k++){
                        if(arr[j + k][i] != arr[j - k + len - 1][i]){
                            flag = false;
                        }
                    }
                    if(flag) cnt++;
                }
            }

            sb.append("#").append(tc).append(" ").append(cnt).append("\n");
        }

        System.out.println(sb.toString());
    }
}
