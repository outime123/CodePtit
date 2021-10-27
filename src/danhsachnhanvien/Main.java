package danhsachnhanvien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<NhanVien> nhanViens = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= t; i++) {
            NhanVien nhanVien = new NhanVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            nhanViens.add(nhanVien);
        }
        for (NhanVien nhanVien : nhanViens){
            System.out.println(nhanVien);
        }
    }
}
