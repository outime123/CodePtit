package dothi;

import java.util.*;

public class KiemTraChuTrinh {
//    static int v,e,canhnguoc =0;
//    static List<Integer> dsc[] = new ArrayList[1005];
//    static boolean chuaxet[] = new boolean[1005];
//    static int a[][] = new int[1005][1005];
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int test = scanner.nextInt();
//        while (test-->0){
//            canhnguoc=0;
//            v = scanner.nextInt();e= scanner.nextInt();
//            for (int i =0;i<1005;i++){
////              dsc[i] = new ArrayList<>();
//                chuaxet[i] = true;
//            }
//            for (int i=0;i<v;i++){
//                int x = scanner.nextInt();
//                int y = scanner.nextInt();
////                dsc[x].add(y);
////                dsc[y].add(x);
//                a[x][y] = 1;
//                a[y][x] = 1;
//            }
//            for (int i=1;i<=v;i++){
//                if(chuaxet[i]) dfs(i,0);
//            }
//            if(canhnguoc==1) System.out.println("YES");
//            else System.out.println("NO");
//        }
//    }
//    public static void dfs(int u,int pair){
//        chuaxet[u] = false;
////        for (Integer i : dsc[u]){
////            if(chuaxet[i]){
////                dfs(i,u);
////            }
////            else if(i!=pair && !chuaxet[i]) canhnguoc=1;
////        }
//        for (int i = 1; i <= v; i++) {
//            if(a[u][i]==1){
//                if(chuaxet[i]) dfs(i,u);
//                else if(!chuaxet[i] && i!=pair) canhnguoc=1;
//            }
//        }
//    }
static List<Integer>[] list = new ArrayList[1003];
    static boolean chuTrinh = false;
    static boolean chuaXet[] = new boolean[1003];
    static int truoc[] = new int[1003];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            chuTrinh = false;
            int V = scanner.nextInt(), E = scanner.nextInt();
            for (int i = 0; i <= V; i++) {
                list[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 1; i <= E; i++) {
                int x = scanner.nextInt(), y = scanner.nextInt();
                list[x].add(y);
                list[y].add(x);
            }
            for (int i = 1; i <= V; i++) {
                if (chuaXet[i]) {
                    if (bfs(i)) {
                        chuTrinh = true;
                        break;
                    }
                }
            }
            if (chuTrinh) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        chuaXet[s] = false;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (Integer k : list[x]) {
                if (chuaXet[k]) {
                    chuaXet[k] = false;
                    truoc[k] = x;
                    queue.add(k);
                } else if (k != truoc[x]) return true;
            }
        }
        return false;
    }
}
