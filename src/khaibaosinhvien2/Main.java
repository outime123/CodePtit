package khaibaosinhvien2;

import khaibaosinhvien2.SinhVien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien(scanner.nextLine(),scanner.next(),scanner.next(),Float.parseFloat(scanner.next()));
        System.out.println(sinhVien);
    }
}
