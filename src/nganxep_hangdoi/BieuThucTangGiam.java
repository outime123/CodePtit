package nganxep_hangdoi;

import java.util.Scanner;

public class BieuThucTangGiam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String s = scanner.nextLine();
            xuly(s);
            System.out.println();
        }
    }
    public static void xuly(String str){
        int curr_max = 0;
        int last_entry = 0;
        int j;
        char[] arr = String.valueOf(str).toCharArray();
        for (int i=0; i<str.length(); i++) {
            int noOfNextD = 0;
            switch(arr[i]) {
                case 'I':
                    j = i+1;
                    if(j<str.length())
                    while (arr[j] == 'D' && j < str.length()) {
                        noOfNextD++;
                        j++;
                    }
                    if (i==0) {
                        curr_max = noOfNextD + 2;
                        System.out.print(++last_entry);
                        System.out.print(curr_max);
                        last_entry = curr_max;
                    }
                    else{
                        curr_max = curr_max + noOfNextD + 1;
                        last_entry = curr_max;
                        System.out.print(last_entry);
                    }
                    for (int k=0; k<noOfNextD; k++) {
                        System.out.print(--last_entry);
                        i++;
                    }
                    break;
                case 'D':
                    if (i == 0) {
                        j = i+1;
                        if(j<str.length())
                        while (arr[j] == 'D' && j < str.length()) {
                            noOfNextD++;
                            j++;
                        }
                        curr_max = noOfNextD + 2;
                        System.out.print(curr_max << curr_max - 1);
                        last_entry = curr_max - 1;
                    }
                    else{
                        System.out.print(last_entry - 1);
                        last_entry--;
                    }
                    break;
            }
        }
    }
}
