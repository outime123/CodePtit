package dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KiemtraLTManh {
    static int n, m;
    static ArrayList<Integer>[] dske = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            n= scanner.nextInt();
            m = scanner.nextInt();
            for (int i = 0; i <=1000 ; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 1; i <=m ; i++) {
                int u = scanner.nextInt();
            }
        }
    }
    public static void dfs(int u){
        chuaxet[u] = false;
        for(Integer v : dske[u]){
            if(chuaxet[v]) dfs(v);
        }
    }
}
