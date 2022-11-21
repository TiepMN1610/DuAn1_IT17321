/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author admin
 */
public class KhoHang {

    private String idKhoHang;
    private String maKhoHang;
    private String diaChi;
    private String soDienThoai;
    private String ghiChu;
    private int trangThai;

    public KhoHang() {
    }

    public KhoHang(String idKhoHang, String maKhoHang, String diaChi, String soDienThoai, String ghiChu, int trangThai) {
        this.idKhoHang = idKhoHang;
        this.maKhoHang = maKhoHang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public KhoHang(String maKhoHang, String diaChi, String soDienThoai, String ghiChu, int trangThai) {
        this.maKhoHang = maKhoHang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public String getIdKhoHang() {
        return idKhoHang;
    }

    public void setIdKhoHang(String idKhoHang) {
        this.idKhoHang = idKhoHang;
    }

    public String getMaKhoHang() {
        return maKhoHang;
    }

    public void setMaKhoHang(String maKhoHang) {
        this.maKhoHang = maKhoHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Object[] toDataRow() {
        return new Object[]{idKhoHang, maKhoHang, diaChi, soDienThoai, ghiChu, trangThai == 0 ? "Hoạt Động" : "Ngừng Hoạt Động"};
    }
}
