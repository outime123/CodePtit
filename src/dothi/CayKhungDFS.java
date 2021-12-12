package dothi;

import java.util.*;

public class CayKhungDFS {
    static List<Integer>[] lists = new ArrayList[1003];
    static List<String> res = new ArrayList<>();
    static int n, m, u;
    static boolean chuaxet[] = new boolean[1003];
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            res.clear();
            n = scanner.nextInt();
            m = scanner.nextInt();
            u = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                lists[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                lists[a].add(b);
                lists[b].add(a);
            }
            Tree_DFS(u);
            if(res.size() == n-1) {
                for (String s : res) {
                    System.out.println(s);
                }
            }else System.out.println(-1);
        }
    }

    private static void Tree_DFS(int u) {
        chuaxet[u] = false;
        for (Integer k : lists[u]) {
            if (chuaxet[k]) {
                res.add(u + " " + k);
                Tree_DFS(k);
            }
        }
    }

}
