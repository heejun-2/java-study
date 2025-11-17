package algorithm.swea.d2;

import java.io.*;
import java.util.StringTokenizer;

public class S1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine(), " ");

            int hour1 = Integer.parseInt(st.nextToken());
            int min1 = Integer.parseInt(st.nextToken());
            int hour2 = Integer.parseInt(st.nextToken());
            int min2 = Integer.parseInt(st.nextToken());

            int hour = hour1 + hour2;
            int min = min1 + min2;

            if(min >= 60){
                hour++;
                min -= 60;
            }

            if(hour > 12){
                hour -= 12;
            }

            sb.append("#" + tc + " " + hour + " " + min).append("\n");
        }

        System.out.println(sb.toString());

    }

}
