package hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BDN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- >0){
            int n = scanner.nextInt();
            System.out.println(dem(n));
        }
    }
    public static int dem(int n){
        Queue queue = new LinkedList<Long>();
        queue.add(1);
        int dem =0;
        while (!queue.isEmpty()){
            Long x = (Long) queue.peek();
            queue.poll();
            if(x <=n){
                dem++;
                queue.add(x*10);
                queue.add(x*10+1);
            }
        }
        return dem;
    }
}
