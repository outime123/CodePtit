package sapxepsinhvientheolop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> sinhViens = new ArrayList<>();
        int t=  Integer.parseInt(scanner.nextLine());
        for (int i = 0 ; i < t; i++) {
            SinhVien sinhVien = new SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            sinhViens.add(sinhVien);
        }
        Collections.sort(sinhViens,(sinhVien1, sinhVien2) -> {
            if(sinhVien1.getLop().equals(sinhVien2.getLop())) return sinhVien1.getMa().compareTo(sinhVien2.getMa());
            else return sinhVien1.getLop().compareTo(sinhVien2.getLop());
        });
        sinhViens.forEach(sinhVien -> System.out.println(sinhVien));
    }
}
