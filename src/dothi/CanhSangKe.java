package dothi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CanhSangKe {
    static int n,m;
    static List<Integer>[] dske = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            n= scanner.nextInt();
            m = scanner.nextInt();
            for(int i =1;i<=n;i++){
                dske[i] = new ArrayList<>();
                chuaxet[i] = false;
            }
            for (int i = 1 ; i <= m; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            for(int i=1;i<=n;i++){
                System.out.print(i+": ");
                Collections.sort(dske[i]);
                dske[i].forEach(integer -> System.out.print(integer+" "));
                System.out.println();
            }
        }
    }
}
