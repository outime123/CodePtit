package bangdiemhocsinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Diem> list = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= t; i++) {
            Diem diem = new Diem(i,scanner.nextLine(),scanner.nextLine());
            diem.getAvg();
            list.add(diem);
        }

        Collections.sort( list,(diem1,diem2) -> {
            if(diem2.getAvg()==diem1.getAvg()) return diem1.getMa().compareTo(diem2.getMa());
            return String.valueOf(diem2.getAvg()).compareTo(String.valueOf(diem1.getAvg()));
        });
        list.forEach(diem -> System.out.println(diem));


    }
}
