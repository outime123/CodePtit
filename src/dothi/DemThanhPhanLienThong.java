package dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemThanhPhanLienThong {
    static int n,m;
    static List<Integer>[] ds = new ArrayList[22222];
    static boolean chuaxet[] = new boolean[22222];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();m= scanner.nextInt();
        for (int i = 0; i <=n; i++) {
            ds[i] = new ArrayList<>();
            chuaxet[i] = true;
        }
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            ds[x].add(y);
        }
        for (int i = 1; i <=n ; i++) {
            int dem=0;
            chuaxet[i] = false;
            for (int j = 1; j <=n ; j++) {
                if(chuaxet[j]){
                    dfs(j);
                    dem++;
                }
            }
            for (int j = 1; j <=n ; j++) {
                chuaxet[j]=true;
            }
            System.out.println(dem);
        }
    }
    public static void dfs(int u){
        chuaxet[u] = false;
        for (int i = 0; i < ds[u].size(); i++) {
            if(chuaxet[ds[u].get(i)]){
                dfs(ds[u].get(i));
            }
        }
    }
}
