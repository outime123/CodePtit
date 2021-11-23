package nganxep_hangdoi;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String s= scanner.nextLine();
            System.out.println(tinh(s));
        }
    }
    public static int tinh(String s){
        Stack<Integer> stack = new Stack<>();
        int kq=0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push(i);
            else{
                stack.pop();
                if(!stack.empty()){
                    kq = Math.max(kq, i-stack.peek());
                } else stack.push(i);
            }
        }
        return kq;
    }
}
