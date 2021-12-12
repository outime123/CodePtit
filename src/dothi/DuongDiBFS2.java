package dothi;

import java.util.*;

public class DuongDiBFS2 {
    static int v,e,u;
    static List<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int tr[];
    static List<Integer> res;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-->0){
            v = scanner.nextInt();e = scanner.nextInt();u = scanner.nextInt();
            for (int i = 0; i < 1001; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 0; i < e; i++) {
                int x= scanner.nextInt();
                int y =scanner.nextInt();
                dske[x].add(y);
                dske[y].add(x);
            }
            tr = new int[v+1];
            bfs(u);
            for (int i = 2; i <= v; i++) {
                if(chuaxet[i]) System.out.println("No path");
                else{
                    res = new ArrayList<>();
                    int j=i;
                    res.add(j);
                    while (tr[j]!=0){
                        res.add(tr[j]);
                        j= tr[j];
                    }
                    for (int k = res.size()-1; k >=0; k--) {
                        System.out.print(res.get(k)+" ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    public static void bfs(int u){
        Queue<Integer> queue = new LinkedList<>();
        chuaxet[u] = false;
        queue.add(u);
        while (!queue.isEmpty()){
            int v= queue.poll();
            for(Integer i : dske[v]){
                if(chuaxet[i]){
                    tr[i] = v;
                    queue.add(i);
                    chuaxet[i] = false;
                }
            }
        }
    }
}
