package danhsachnhanvien;

public class NhanVienDTO {
    private String ten,gioitinh;

    public NhanVienDTO() {
    }

    public NhanVienDTO(String ten, String gioitinh) {
        this.ten = ten;
        this.gioitinh = gioitinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return ten +" "+gioitinh;
    }
}
