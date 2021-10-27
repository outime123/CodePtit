package danhsachsinhvien2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> sinhViens = new ArrayList<>();
        int t= Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= t; i++) {
            SinhVien sinhVien = new SinhVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            sinhViens.add(sinhVien);
        }
        for (SinhVien sinhVien : sinhViens){
            System.out.println(sinhVien);
        }
    }
}
