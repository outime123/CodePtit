package dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class KeSangCanh {
    static int n,m;
    static List<Integer>[] dske = new ArrayList[1001];
    static boolean chuaxet[][] = new boolean[51][51];
    static int a[][] = new int[51][51];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            dske[i] = new ArrayList<>();
            String s= scanner.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()){
                int v = Integer.parseInt(st.nextToken());
                dske[i].add(v);
                chuaxet[i][v] = false;
            }
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <dske[i].size() ; j++) {
                if(!chuaxet[i][dske[i].get(j)]) {
                    System.out.println(i + " " +dske[i].get(j));
                    chuaxet[i][dske[i].get(j)] = chuaxet[dske[i].get(j)][i]=true;
                }
            }
        }
    }
}
