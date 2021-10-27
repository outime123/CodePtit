package tinhgio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Gamer implements Comparable<Gamer>{
    private String ma,ten;
    private Date timein,timeout;

    public Gamer(String ma, String ten, String timein, String timeout) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.timein = new SimpleDateFormat("hh:mm").parse(timein);
        this.timeout = new SimpleDateFormat("hh:mm").parse(timeout);
    }

    public Date getTimein() {
        return timein;
    }

    public Date getTimeout() {
        return timeout;
    }

    public int result(Date timein, Date timeout){
        int in = timein.getHours()*60+timein.getMinutes();
        int out =timeout.getHours()*60+timeout.getMinutes();
        return out -in;
    }
    public String change(int time){
        int hh = time/60;
        int mm = time%60;
        return hh+" gio "+mm+" phut";
    }
    @Override
    public String toString() {
        return ma+"  "+ten+" "+change(result(timein,timeout));
    }

    @Override
    public int compareTo(Gamer o) {
        return o.change(o.result(o.getTimein(),o.getTimeout())).compareTo(this.change(this.result(timein,timeout)));
    }
}
