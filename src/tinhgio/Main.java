package tinhgio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Gamer> gamerList = new ArrayList<>();
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= t; i++) {
            Gamer gamer = new Gamer(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            gamerList.add(gamer);
        }
        Collections.sort(gamerList);
        for (Gamer gamer : gamerList){
            System.out.println(gamer);
        }
    }
}
