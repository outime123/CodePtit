package bangdiemhocsinh;

import java.util.StringTokenizer;

public class Diem {
    private String ma,ten,diem;

    public Diem(int id,String ten,String diem) {
        this.ma = "HS"+String.format("%02d",id);
        this.ten = ten;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public float getAvg(){
        float sum =0,dem =1;
        StringTokenizer st = new StringTokenizer(diem);
        while(st.hasMoreTokens()){
            if(dem <3){
                sum+= Float.parseFloat(st.nextToken())*2;
            }
            else sum+= Float.parseFloat(st.nextToken());
            dem++;
        }
        sum = Math.round(sum*10/12);
        return sum/10;
    }
    public String getHL(){
        if(getAvg()>=9) return "XUAT XAC";
        else if((getAvg())>=8 && (getAvg())<=8.9) return "GIOI";
        else if((getAvg())>=7 && (getAvg())<=7.9) return "KHA";
        else if((getAvg())>=6 && (getAvg())<=6.9) return  "TB";
        else return "YEU";
    }
    @Override
    public String toString() {
        return ma+" "+ten+" "+getAvg()+" "+getHL();
    }
}
