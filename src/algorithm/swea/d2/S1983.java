package algorithm.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] score = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            double[] arr = new double[N];
            double tmp = 0;


            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine(), " ");
                arr[j] = Integer.parseInt(st.nextToken()) * 0.35 + Integer.parseInt(st.nextToken()) * 0.45 + Integer.parseInt(st.nextToken()) * 0.2;
                if(j+1 == K) tmp = arr[j];
            }

            Arrays.sort(arr);

            int order = 0;

            for(int j = 0; j < N; j++){
                if(arr[j] == tmp){
                    order = j;
                }
            }

            sb.append("#" + i + " " + score[order / (N / 10)]).append("\n");
        }

        System.out.println(sb.toString());


    }
}
