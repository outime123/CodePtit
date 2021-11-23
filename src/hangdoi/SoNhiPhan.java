package hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            xuly(n);
        }
    }

    private static void xuly(int n) {
        Queue queue = new LinkedList<String>();
        queue.add("1");
        while (n-- > 0){
            String out = (String) queue.peek();
            System.out.println(out+" ");
            queue.poll();
            queue.add("0");
            queue.add("1");
        }
        System.out.println();
    }

}
