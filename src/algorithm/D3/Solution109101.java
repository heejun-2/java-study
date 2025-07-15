package algorithm.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution109101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int tc = 1; tc <= T; tc++){
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int cnt = 0;

            st = new StringTokenizer(br.readLine(), " ");

            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 0; i < N; i++){
                list.add(Integer.parseInt(st.nextToken()));
            }

            if(K == 1){
                for(int k = 0; k < N - 1; k++){
                    if(list.get(k) - list.get(k + 1) != 0){
                        cnt = - 1;
                    }
                }
            }
            else{
                HashMap<String, Integer> turn = new HashMap<>();
                while(true){
                    HashSet<Integer> set = new HashSet<>();
                    String str = "";
                    for(int k = 0; k < N; k++){
                        set.add(list.get(k));
                        str += list.get(k);
                    }

                    turn.put(str, turn.getOrDefault(str, 0) + 1);

                    if(set.size() == 1) break;

                    for (String s : turn.keySet()) {
                        if(turn.get(s) > 1){
                            cnt = -1;
                            break;
                        }
                    }

                    int add = list.get(K - 1);
                    list.remove(0);
                    list.add(add);
                    cnt++;

                    if(cnt > N + 1){
                        cnt = -1;
                        break;
                    }

                }
            }



            System.out.println("#" + tc + " " + cnt);


        }
    }
}
