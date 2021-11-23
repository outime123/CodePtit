package nganxep_hangdoi;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class DaoTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-->0){
            String s = scanner.nextLine();
            System.out.println(dao(s));
        }
    }

    private static String dao(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()){
            String tmp = st.nextToken();
            Stack<Character> stack = new Stack();
            for (int i = 0; i < tmp.length(); i++) {
                stack.push(tmp.charAt(i));
            }
            for (int i = 0; i < tmp.length(); i++) {
                sb.append(stack.peek());
                stack.pop();
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
