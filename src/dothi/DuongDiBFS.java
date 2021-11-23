package dothi;

import java.util.*;

public class DuongDiBFS {
    static int v,e,s,t;
    static boolean chuaxet[] = new boolean[1001];
    static List<Integer>[] dske = new ArrayList[1001];
    static int b[] = new int[1001];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-->0){
            v = scanner.nextInt();
            e = scanner.nextInt();
            s = scanner.nextInt();
            t = scanner.nextInt();
            for (int i = 0; i <= v; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= e; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                dske[x].add(y);
                dske[y].add(x);
            }
            bfs(s);
            if(chuaxet[t]) System.out.println(-1);
            else {
                List<Integer> res = new ArrayList<>();
                int i = t;
                System.out.print(s+" ");
                while (i!=s){
                    res.add(i);
                    i=b[i];
                }
                for (int j = res.size()-1; j>=0 ; j--) {
                    System.out.print(res.get(j)+" ");
                }
                System.out.println();
            }
        }
    }
    static void bfs(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        chuaxet[u] = false;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (Integer x : dske[v]) {
                if (chuaxet[x]) {
                    q.add(x);
                    chuaxet[x] = false;
                    b[x] = v;
                }
            }
        }
    }
    
}
