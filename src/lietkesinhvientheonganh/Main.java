package lietkesinhvientheonganh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        List<String> listnganh = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            SinhVien sinhVien = new SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            list.add(sinhVien);
        }
        //input nganh
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String nganh = scanner.nextLine();
            listnganh.add(nganh);
        }
        listnganh.forEach(x -> {
            System.out.println("DANH SACH SINH VIEN NGANH "+x.toUpperCase()+":");
            list.forEach(sinhVien -> {
                StringTokenizer st = new StringTokenizer(x.toUpperCase());
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 2; i++) {
                    sb.append(st.nextToken().charAt(0));
                }
                if(sb.toString().equals(sinhVien.getNganh())){
                    if(!sinhVien.getNganh().equals("CN") && !sinhVien.getNganh().equals("AT")){
                        System.out.println(sinhVien);
                    }
                    if(sinhVien.getNganh().equals("CN") || sinhVien.getNganh().equals("AT") && !sinhVien.getLop().substring(0,1).equals("E"))
                        System.out.println(sinhVien);
                }
            });
        });
    }
}
