package khaibaolopthisinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ten = scanner.nextLine();
        String ngaysinh = scanner.nextLine();
        Float d1 = Float.parseFloat(scanner.nextLine());
        Float d2 = Float.parseFloat(scanner.nextLine());
        Float d3 = Float.parseFloat(scanner.nextLine());
        ThiSinh thiSinh = new ThiSinh(ten,ngaysinh,d1,d2,d3);
        System.out.println(thiSinh.toString());
    }
}
