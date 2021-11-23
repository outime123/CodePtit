package lietkesinhvientheolop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<SinhVien> sinhViens = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            SinhVien sinhVien = new SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            sinhViens.add(sinhVien);
        }
        Collections.sort(sinhViens, ((sinhvien1,sinhvien2) -> {
            return sinhvien1.getMa().compareTo(sinhvien2.getMa());
        }));
        sinhViens.forEach(sinhVien -> {
            System.out.println(sinhVien);
        });
    }
}
