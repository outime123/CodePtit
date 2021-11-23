package nganxep_hangdoi;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucSoHoc {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-->0){
            String s= scanner.nextLine();
                if(check(s)) System.out.println("Yes");
                else System.out.println("No");
        }
    }
    public static boolean check(String s){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[') stack.push(i);
            else if(s.charAt(i) == ')'||s.charAt(i) == ']'){
                if(stack.empty()) return false;
                int j= stack.peek();
                stack.pop();
                if(i-j == 2) return true;
                for (int k = j+1; k < i; k++) {
                    if(s.charAt(k)!='['&&s.charAt(k)!=']'&&s.charAt(k)!='('&&s.charAt(k)!=')') return true;
                }
                if((s.charAt(j+1) == '(' && s.charAt(i-1) == ')') || (s.charAt(j+1) == '[' && s.charAt(i-1) == ']'))
                    return  true;
            }
        }
        return false;
    }
}
