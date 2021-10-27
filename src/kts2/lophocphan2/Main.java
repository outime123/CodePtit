package kts2.lophocphan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<LopHocPhan> lopHocPhanList = new ArrayList<>();//danh sach tat ca cac nhom cua ky
        List<String> listGV = new ArrayList<>(); // dnah sach ma mon hoc
        List<LopHocPhan> lopHocPhanList1;//danh sach gv theo mon hoc
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= t; i++) {
            LopHocPhan lopHocPhan = new LopHocPhan(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            lopHocPhanList.add(lopHocPhan);
        }
        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String gv = scanner.nextLine();
            listGV.add(gv);
        }
        for(String gv : listGV){
            //sap xep danh sach mon hoc theo giang vien
            lopHocPhanList1 = new ArrayList<>();
            for (LopHocPhan lopHocPhan : lopHocPhanList){
                if(lopHocPhan.getGv().equals(gv)){
                    lopHocPhanList1.add(lopHocPhan);
                }
                Collections.sort(lopHocPhanList1);
            }
            //in ra dnah sach gv theo mon hoc
            if(lopHocPhanList1.get(0).getGv().equals(gv)){
                System.out.println("Danh sach cho giang vien "+lopHocPhanList1.get(0).getGv()+":");
                for (LopHocPhan lopHocPhan : lopHocPhanList1){
                    System.out.println(lopHocPhan);
                }
            }
        }
    }
}
