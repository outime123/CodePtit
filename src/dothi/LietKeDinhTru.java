package dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LietKeDinhTru {
    static int v,e;
    static List<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-->0){
            int count =0,res;
            v = scanner.nextInt();e = scanner.nextInt();
            for (int i = 0; i < 1001; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 0; i < e; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                dske[x].add(y);
                dske[y].add(x);
            }
            for (int i = 1; i <= v; i++) {
                if(chuaxet[i]){
                    dfs(i);
                    count++;
                }
            }
            for (int i = 1; i <= v; i++) {
                for (int j = 1; j <= v ; j++) {
                    chuaxet[j]=true;
                }
                chuaxet[i] = false;
                res=0;
                for (int j = 1; j <=v ; j++) {
                    if (chuaxet[j]){
                        dfs(j);
                        res++;
                    }
                }
                if(res>count) System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void dfs(int u){
        chuaxet[u] = false;
        for (Integer i : dske[u]){
            if(chuaxet[i]) dfs(i);
        }
    }
}
