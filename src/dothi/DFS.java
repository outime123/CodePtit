package dothi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS {
    static int n, m;
    static ArrayList<Integer>[] dscanh = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            int s = in.nextInt();
            for (int i = 0; i <= n; i++) {
                dscanh[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = in.nextInt(), v = in.nextInt();
                dscanh[u].add(v);
                dscanh[v].add(u);
            }
            dfs(s);
            System.out.println();
        }
    }

    public static void dfs(int u) {
        System.out.print(u +" ");
        chuaxet[u] = false;
        for (int i = 0; i < dscanh[u].size(); i++) {
            if(chuaxet[dscanh[u].get(i)]){
                dfs(dscanh[u].get(i));
            }
        }
    }
}
