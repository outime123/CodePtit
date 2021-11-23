package dothi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DemThanhPhanLT {
    static int n, m;
    static ArrayList<Integer>[] dske = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = scanner.nextInt(), v = scanner.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            int dem =0;
            for (int i = 1; i <= n ; i++) {
                if(chuaxet[i]) {
                    dfs(i);
                    dem++;
                }
            }
            System.out.println(dem);
        }
    }

    public static void dfs(int u){
        chuaxet[u] = false;
        for (int i = 0; i < dske[u].size(); i++) {
            if(chuaxet[dske[u].get(i)]){
                dfs(dske[u].get(i));
            }
        }
    }
}
