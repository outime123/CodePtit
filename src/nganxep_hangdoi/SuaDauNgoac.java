package nganxep_hangdoi;

import java.util.Scanner;

public class SuaDauNgoac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-->0){
            String s= scanner.nextLine();
            System.out.println(xuly(s));
        }
    }
    public static int xuly(String str){
        char[] s =String.valueOf(str).toCharArray();
        int m=0,d=0,ans=0,i,n = (str.length()+1)/2;
        for( i = 0 ; i < str.length() ; i++){
            if(s[i] == '(') m++; else if(s[i] == ')') d++;
            if(m == n) break;
            if(s[i] == ')' && d > m){
                s[i] = '(';
                d--;
                m++;
                ans++;
                if(m == n) break;
            }
        }
        if(i + 1 < str.length()){
            for(int j = i+1 ; j < str.length() ; j++){
                if(s[j] == '('){
                    s[j] = ')';
                    ans++;
                }
            }
        }
        return ans;
    }
}
