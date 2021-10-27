package khaibaosinhvien3;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            SinhVien sinhVien = new SinhVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),Float.parseFloat(scanner.nextLine()));
            System.out.println(sinhVien.toString());
        }

    }
}
