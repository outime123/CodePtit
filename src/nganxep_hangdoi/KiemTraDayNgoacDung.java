package nganxep_hangdoi;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-->0){
            String s = scanner.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(String s){
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') stk.push(s.charAt(i));
            else{
                if(stk.empty()){
                    return false;
                }
                if(s.charAt(i)==')'){
                    if(stk.peek()!='('){
                        return false;
                    }
                    stk.pop();
                }
                else if(s.charAt(i)==']'){
                    if(stk.peek()!='['){
                        return false;
                    }
                    stk.pop();
                }
                else{
                    if(stk.peek()!='{'){
                        return false;
                    }
                    stk.pop();
                }
            }
        }
        return true;
    }
}
