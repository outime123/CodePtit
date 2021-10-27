package kts2.lophocphan1;

public class LopHocPhan implements Comparable<LopHocPhan>{
    private String ma,ten,gv,nhom;

    public LopHocPhan(String ma, String ten,String nhom, String gv) {
        this.ma = ma;
        this.ten = ten;
        this.gv = gv;
        this.nhom=nhom;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getNhom() {
        return nhom;
    }

    @Override
    public String toString() {
        return nhom+" "+gv;
    }

    @Override
    public int compareTo(LopHocPhan o) {
        return nhom.compareTo(o.getNhom());
    }
}
