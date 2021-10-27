package thunhapgiaovien;

public class GiaoVien {
    private String ma,ten,chucvu;
    private int luong,heso,phucap,thunhap;

    public GiaoVien(String ma, String ten, String luong) {
        this.ma = ma;
        this.ten = ten;
        this.chucvu = ma.substring(0,2);
        this.heso = Integer.parseInt(ma.substring(2,4));
        if(chucvu.equals("HT")) phucap = 2000000;
        else if (chucvu.equals("HP")) phucap = 900000;
        else phucap = 500000;
        this.luong = Integer.parseInt(luong);
        this.thunhap = Integer.parseInt(luong)*heso+phucap;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+heso+" "+phucap+" "+thunhap;
    }
}
