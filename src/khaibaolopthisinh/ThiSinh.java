package khaibaolopthisinh;

public class ThiSinh {
    private String ten,ngaysinh;
    private float d1,d2,d3,tong;

    public ThiSinh(String ten, String ngaysinh, float d1, float d2, float d3) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1+d2+d3;
    }

    @Override
    public String toString() {
        return ten+" "+ngaysinh+" "+String.format("%.1f",tong);
    }
}
