package phanso;

public class PhanSo {
    private long tu;
    private long mau;

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu+"/"+mau;
    }

    public void rutGon() {
        long x = uc(tu,mau);
        tu/=x;
        mau/=x;
    }
    public long uc(long a, long b){
        while(b!=0){
            long tmp = a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
}
