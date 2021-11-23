package dothi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DuongDiDFS {
    static int n,m,s,t;
    static List<Integer>[] dske = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int b[] = new int[1001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            n = in.nextInt();m = in.nextInt();s =in.nextInt();t = in.nextInt();
            for (int i = 0; i <= n; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = in.nextInt(), v = in.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            dfs(s);
            if(chuaxet[t]) System.out.println(-1);
            else {
                List<Integer> res = new ArrayList<>();
                int i=t;
                System.out.print(s+" ");
                while (i!=s){
                    res.add(i);
                    i=b[i];
                }

                for (int j = res.size()-1; j >=0; j--) {
                    System.out.print(res.get(j)+" ");
                }
                System.out.println();
            }
        }
    }
    public static void dfs(int u){
        chuaxet[u] = false;
        for (int i = 0; i < dske[u].size(); i++) {
            if(chuaxet[dske[u].get(i)]){
                b[dske[u].get(i)] = u;
                dfs(dske[u].get(i));
            }
        }
    }
}
