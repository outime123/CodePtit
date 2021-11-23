package dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BieuDienDoThiCoHuong {
    static int v,e;
    static List<Integer>[] ds = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=  scanner.nextInt();
        while(t-->0){
            v= scanner.nextInt();
            e = scanner.nextInt();
            for (int i = 0; i <= v; i++) {
                ds[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= e; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                ds[x].add(y);
            }
            for (int i = 1; i <= v; i++) {
                System.out.print(i+": ");
                ds[i].forEach(integer -> System.out.print(integer+" "));
                System.out.println();
            }
        }
    }
}
