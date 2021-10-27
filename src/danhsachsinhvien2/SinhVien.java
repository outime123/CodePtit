package danhsachsinhvien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String ma,ten,lop;
    private Date ngaysinh;
    private float diem;

    public SinhVien(int ma, String ten, String lop, String ngaysinh, String diem) throws ParseException {
        this.ma = "B20DCCN"+String.format("%03d",ma);
        this.ten = chuanHoaTen(ten);
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diem = Float.parseFloat(diem);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.02f",diem);
    }
    public String chuanHoaTen(String a){
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(a);
        while (stringTokenizer.hasMoreTokens()){
            String tmp = stringTokenizer.nextToken();
            stringBuilder.append(Character.toUpperCase(tmp.charAt(0)));
            for (int i = 1 ; i < tmp.length(); i++) {
                stringBuilder.append(Character.toLowerCase(tmp.charAt(i)));
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
