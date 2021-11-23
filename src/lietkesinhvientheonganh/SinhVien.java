package lietkesinhvientheonganh;

public class SinhVien {
    private String ma,ten,lop,email,nganh;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.nganh = ma.substring(5,7);
    }

    public String getNganh() {
        return nganh;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+email;
    }
}
