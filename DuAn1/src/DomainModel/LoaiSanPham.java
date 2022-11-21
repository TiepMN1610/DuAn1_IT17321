/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author admin
 */
public class LoaiSanPham {

    private String idLSP;
    private String maLSP;
    private String tenLSP;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String idLSP, String maLSP, String tenLSP) {
        this.idLSP = idLSP;
        this.maLSP = maLSP;
        this.tenLSP = tenLSP;
    }

    public LoaiSanPham(String maLSP, String tenLSP) {
        this.maLSP = maLSP;
        this.tenLSP = tenLSP;
    }

    public String getIdLSP() {
        return idLSP;
    }

    public void setIdLSP(String idLSP) {
        this.idLSP = idLSP;
    }

    public String getMaLSP() {
        return maLSP;
    }

    public void setMaLSP(String maLSP) {
        this.maLSP = maLSP;
    }

    public String getTenLSP() {
        return tenLSP;
    }

    public void setTenLSP(String tenLSP) {
        this.tenLSP = tenLSP;
    }

    public Object[] toDataRow() {
        return new Object[]{idLSP, maLSP, tenLSP};
    }

}
