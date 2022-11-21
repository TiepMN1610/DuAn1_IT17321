/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author admin
 */
public class TaiKhoan {

    private String idTK;
    private String tenTK;
    private String passTK;
    private String vaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(String idTK, String tenTK, String passTK, String vaiTro) {
        this.idTK = idTK;
        this.tenTK = tenTK;
        this.passTK = passTK;
        this.vaiTro = vaiTro;
    }

    public TaiKhoan(String tenTK, String passTK, String vaiTro) {
        this.tenTK = tenTK;
        this.passTK = passTK;
        this.vaiTro = vaiTro;
    }

    public String getIdTK() {
        return idTK;
    }

    public void setIdTK(String idTK) {
        this.idTK = idTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getPassTK() {
        return passTK;
    }

    public void setPassTK(String passTK) {
        this.passTK = passTK;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public Object[] toDataRow() {
        return new Object[]{idTK, tenTK, passTK, vaiTro};
    }

}
