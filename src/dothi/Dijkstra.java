package dothi;

import java.util.*;

public class Dijkstra {
    static List<Map<Integer,Integer>>[] ds = new ArrayList[1001];
    static int v,e,x;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-->0){
            v= scanner.nextInt();
            e = scanner.nextInt();
            x = scanner.nextInt();
            for (int i = 0; i <= v; i++) {
                ds[i] = new ArrayList<>();
            }
            for (int i = 0; i < e; i++) {
                Map<Integer,Integer> dinh = new HashMap<>();
                Map<Integer,Integer> trongso = new HashMap<>();
                int z,y,k;
                z= scanner.nextInt();
                y = scanner.nextInt();
                k = scanner.nextInt();
                dinh.put(y,k);
                trongso.put(z,k);
                ds[z].add(dinh);
                ds[y].add(trongso);
            }
            for (int i = 1; i <=v; i++) {
                System.out.print((i)+": ");
                ds[i].forEach(integerIntegerMap -> System.out.print(integerIntegerMap.keySet()+" "));
                System.out.println();
            }
        }
    }
}
