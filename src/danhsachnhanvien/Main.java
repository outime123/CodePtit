package danhsachnhanvien;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<NhanVien> nhanViens = new ArrayList<>();
        //int t = Integer.parseInt(scanner.nextLine());
//        for (int i = 1; i <= t; i++) {
//           // NhanVien nhanVien = new NhanVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
//            //nhanViens.add(nhanVien);
//        }
//        for (NhanVien nhanVien : nhanViens){
//            System.out.println(nhanVien);
//        }

        NhanVien nhanVien = new NhanVien(1,"Linh","Nam","09/02/1999","HN","8333","12/12/2020");
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        NhanVienDTO nhanVienDTO = mapper.map(nhanVien,NhanVienDTO.class);
        System.out.println(nhanVien);
        System.out.println(nhanVienDTO);
    }
}
