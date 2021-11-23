import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AlarmTime {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat f= new SimpleDateFormat("hh:mm:ss");
        System.out.println("Thời gian hiện thời: "+ f.format(new Date()));
        System.out.println("Gõ vào thời gian báo chuông:" );
        String time = scanner.nextLine();
        Thread t=new Thread();
        t.start();
        boolean running = true;
        while (running){
            System.out.println("Time: "+f.format(new Date()));
            Thread.sleep(1000);
            if(time.equals(f.format(new Date()).toString())){
                System.out.println("Reng reng reng");
                t.stop();
                running=false;
            }
        }
    }
}
