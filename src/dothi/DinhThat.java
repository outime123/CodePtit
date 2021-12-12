package dothi;

import java.util.*;

public class DinhThat {
//    static int N,M,u,v;
//    static List<Integer> dske[] = new ArrayList[1001];
//    static boolean chuaxet[] = new boolean[1001];
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int test = scanner.nextInt();
//        while (test-->0){
//            int res = 0;
//            N = scanner.nextInt();M = scanner.nextInt();u= scanner.nextInt();v= scanner.nextInt();
//            for (int i = 0; i < 1001; i++) {
//                dske[i] = new ArrayList<>();
//            }
//            for (int i = 0; i < M; i++) {
//                int x= scanner.nextInt();
//                int y = scanner.nextInt();
//                dske[x].add(y);
//            }
//            for (int i = 1; i <= N; i++) {
//                for(int j = 1; j <= N; j++){
//                    chuaxet[j] = true;
//                }
//                if (i != u && i != v) {
//                    chuaxet[i] = false;
//                    if(!bfs()){
//                        res++;
//                    }
//                }
//            }
//            System.out.println(res);
//
//        }
//    }
//    public static boolean bfs(){
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(u);
//        chuaxet[u] = false;
//        while (!queue.isEmpty()){
//            int x = queue.poll();
//            for(Integer i : dske[x]){
//                if(chuaxet[i]){
//                    if(i==v) return true;
//                }
//                chuaxet[i] = false;
//                queue.add(i);
//            }
//        }
//        return false;
//    }
    static int n, m, u, v;
    static List<Integer>[] lists = new ArrayList[103];
    static int chuaxet[] = new int[103];
    static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            res = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();
            u = scanner.nextInt();
            v = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                lists[i] = new ArrayList<>();
            }
            for (int i = 1; i <= m; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                lists[x].add(y);
            }
            for (int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++){
                    chuaxet[j] = 0;
                }
                if (i != u && i != v) {
                    chuaxet[i] = 1;
                    if(!bfs()){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }

    private static boolean bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        chuaxet[u] = 1;
        while (!queue.isEmpty()){
            int x = queue.poll();
            for(Integer k : lists[x]){
                if(chuaxet[k] == 0){
                    if(k == v){
                        return true;
                    }
                    chuaxet[k] = 1;
                    queue.add(k);
                }
            }
        }
        return false;
    }

}
