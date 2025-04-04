package algorithm.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());

            int[][] arr = new int[N][N];

            for(int j = 0; j < N; j++) {
                for(int k = 0; k <= j; k++){
                    if(k == 0 || j == k){
                        arr[j][k] = 1;
                    }
                    else{
                        arr[j][k] = arr[j - 1][k - 1] + arr[j - 1][k];
                    }
                }
            }

            System.out.println("#" + i);
            for(int j = 0; j < N; j++) {
                for(int k = 0; k <= j; k++){
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
