package sapxepnhanvien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<NhanVien> nhanViens = new ArrayList<>();
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=t;i++){
            NhanVien nhanVien = new NhanVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            nhanViens.add(nhanVien);
        }
        Collections.sort(nhanViens);
        for (NhanVien nhanVien : nhanViens){
            System.out.println(nhanVien);
        }
    }
}
