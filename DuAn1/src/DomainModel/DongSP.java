/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author admin
 */
public class DongSP {

    private String idDSP;
    private String maDSP;
    private String tenDSP;

    public DongSP() {
    }

    public DongSP(String idDSP, String maDSP, String tenDSP) {
        this.idDSP = idDSP;
        this.maDSP = maDSP;
        this.tenDSP = tenDSP;
    }

    public DongSP(String maDSP, String tenDSP) {
        this.maDSP = maDSP;
        this.tenDSP = tenDSP;
    }

    public DongSP(String tenDSP) {
        this.tenDSP = tenDSP;
    }

    public String getIdDSP() {
        return idDSP;
    }

    public void setIdDSP(String idDSP) {
        this.idDSP = idDSP;
    }

    public String getMaDSP() {
        return maDSP;
    }

    public void setMaDSP(String maDSP) {
        this.maDSP = maDSP;
    }

    public String getTenDSP() {
        return tenDSP;
    }

    public void setTenDSP(String tenDSP) {
        this.tenDSP = tenDSP;
    }

    @Override
    public String toString() {
        return "DongSP{" + "idDSP=" + idDSP + ", maDSP=" + maDSP + ", tenDSP=" + tenDSP + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{idDSP, maDSP, tenDSP};
    }
}
