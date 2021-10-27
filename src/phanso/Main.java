package phanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhanSo phanSo = new PhanSo(scanner.nextLong(),scanner.nextLong());
        phanSo.rutGon();
        System.out.println(phanSo);
    }
}
