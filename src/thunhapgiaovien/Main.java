package thunhapgiaovien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GiaoVien giaoVien = new GiaoVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        System.out.println(giaoVien);
    }
}
