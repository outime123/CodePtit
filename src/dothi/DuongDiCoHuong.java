package dothi;

import java.util.*;

public class DuongDiCoHuong {
    static List<Integer>[] a = new ArrayList[1003];
    static LinkedList<Integer> queue = new LinkedList<>();
    static int[] dd = new int[1003];
    static int[] pos = new int[1003];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            queue.clear();
            int V = scanner.nextInt(), E = scanner.nextInt(), u = scanner.nextInt(), v = scanner.nextInt();
            for (int i = 0; i < 1003; i++) {
                a[i] = new ArrayList<>();
                dd[i] = 0;
                pos[i] = 0;
            }
            for (int i = 1; i <= E; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                a[x].add(y);
            }
            if(bfs(u, v)) result(u,v);
            else System.out.println(-1);
        }
    }

    private static boolean bfs(int u, int v) {
        queue.add(u);
        dd[u] = 1;
        while (!queue.isEmpty()) {
            int k = queue.poll();
            if (k == v) {
                return true;
            }
            for (int i = 0; i < a[k].size(); i++) {
                if (dd[a[k].get(i)] == 0) {
                    queue.add(a[k].get(i));
                    dd[a[k].get(i)] = 1;
                    pos[a[k].get(i)] = k;
                }
            }
        }
        return false;
    }

    private static void result(int u, int v) {
        StringBuilder s = new StringBuilder();
        while (u != v) {
            s.insert(0, " -> " + v);
            v = pos[v];
        }
        s.insert(0, u);
        System.out.println(s);
    }

}
