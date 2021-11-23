package dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KiemTraTinhLienThongManh {
    static int v,e;
    static List<Integer>[] dske = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            v = scanner.nextInt();
            e = scanner.nextInt();
            for (int i = 0; i <= v; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 0; i < e; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                dske[x].add(y);
            }
            System.out.println(check());
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
    public static String check(){
        for (int i = 1; i <=v ; i++) {
            dfs(i);
            for (int j = 1; j <=v ; j++) {
                if(chuaxet[j]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
