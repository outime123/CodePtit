package dothi;

import java.util.*;

public class DiemNutGiaoThongTrongYeu {
    static List<Integer>[] lists = new ArrayList[1003];
    static int n, m, count;
    static List<Integer> list = new ArrayList<>();
    static boolean chuaxet[] = new boolean[1003];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                lists[i] = new ArrayList<>();
                list = new ArrayList<>();
            }
            for (int i = 1; i <= m; i++) {
                int x = scanner.nextInt(), y = scanner.nextInt();
                lists[x].add(y);
                lists[y].add(x);
            }
            for (int i = 2; i <= n; i++) {
                count = 0;
                setUp();
                bfs(1, i);
                for (int j = 1; j <= n; j++) {
                    if (chuaxet[j]) count++;
                }
                if (count > 1) list.add(i);
            }
            count = 0;
            setUp();
            bfs(2, 1);
            for (int j = 1; j <= n; j++) {
                if (chuaxet[j]) count++;
            }
            if (count > 1) list.add(1);
            Collections.sort(list);
            System.out.println(list.size());
            for (Integer i : list)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    private static void setUp() {
        for (int i = 1; i <= n; i++) {
            chuaxet[i] = true;
        }
    }

    private static void bfs(int s, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        chuaxet[s] = false;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (Integer y : lists[x]) {
                if (y != k && chuaxet[y]) {
                    queue.add(y);
                    chuaxet[y] = false;
                }
            }
        }
    }

}
