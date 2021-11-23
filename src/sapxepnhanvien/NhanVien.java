package sapxepnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String id;
    private String ten,gioitinh,diachi,masothue;
    private Date ngaysinh,ngaykyhopdong;

    public NhanVien() {
    }

    public NhanVien(int id,String ten, String gioitinh,String ngaysinh, String diachi,String masothue,String ngaykyhopdong) throws ParseException {
        this.id = String.format("%05d",id);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.ngaykyhopdong = new SimpleDateFormat("dd/MM/yyyy").parse(ngaykyhopdong);
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    @Override
    public String toString() {
        return id+" "+ten+" "+gioitinh+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+diachi+" "+masothue+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaykyhopdong);
    }

}
