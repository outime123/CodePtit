package dothi;

import java.util.*;

public class LienThong {
    static int n,m,x;
    static List<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();m = scanner.nextInt();x= scanner.nextInt();
        for (int i = 0; i < 1001; i++) {
            dske[i] = new ArrayList<>();
            chuaxet[i] = true;
        }
        for (int i = 0; i < m; i++) {
            int x= scanner.nextInt();
            int y = scanner.nextInt();
            dske[x].add(y);
            dske[y].add(x);
        }
        bfs(x);
        boolean result = false;
        for (int i = 1; i <= n; i++) {
            if (chuaxet[i]){
                System.out.println(i);
                result = true;
            }
        }
        if(!result) System.out.println(0);
    }
    public static void bfs(int u){
        Queue<Integer> queue = new LinkedList<>();
        chuaxet[u] = false;
        queue.add(u);
        while (!queue.isEmpty()){
            int v = queue.poll();
            for (Integer i : dske[v]){
                if (chuaxet[i]){
                    chuaxet[i] = false;
                    queue.add(i);
                }
            }
        }
    }
}
