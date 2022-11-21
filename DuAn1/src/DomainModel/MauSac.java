/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author admin
 */
public class MauSac {

    private String idMS;
    private String maMS;
    private String tenMS;

    public MauSac() {
    }

    public MauSac(String idMS, String maMS, String tenMS) {
        this.idMS = idMS;
        this.maMS = maMS;
        this.tenMS = tenMS;
    }

    public MauSac(String maMS, String tenMS) {
        this.maMS = maMS;
        this.tenMS = tenMS;
    }

    public MauSac(String tenMS) {
        this.tenMS = tenMS;
    }

    public String getIdMS() {
        return idMS;
    }

    public void setIdMS(String idMS) {
        this.idMS = idMS;
    }

    public String getMaMS() {
        return maMS;
    }

    public void setMaMS(String maMS) {
        this.maMS = maMS;
    }

    public String getTenMS() {
        return tenMS;
    }

    public void setTenMS(String tenMS) {
        this.tenMS = tenMS;
    }

    @Override
    public String toString() {
        return "MauSac{" + "idMS=" + idMS + ", maMS=" + maMS + ", tenMS=" + tenMS + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{idMS, maMS, tenMS};
    }

}
