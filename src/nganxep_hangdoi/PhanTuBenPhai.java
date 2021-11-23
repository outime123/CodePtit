package nganxep_hangdoi;

import java.util.Scanner;
import java.util.Stack;

public class PhanTuBenPhai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = scanner.nextInt();
            }
            xuly(a,n);
        }
    }
    public static void xuly(int a[],int n){
        int right[] = new int[n],i;
        Stack<Integer> stackI = new Stack<>();
        for (int j = n-1; j >= 0 ; j--) {
            while (stackI.empty() && a[j] >= stackI.peek()){
                stackI.pop();
                if(!stackI.empty()) right[j] = stackI.peek();
                else right[j] = -1;
                stackI.push(a[j]);
            }
        }
        for (i = 0; i<n ; i++) {
            System.out.println(a[i]+ " ");
        }
        System.out.println();
    }
}
