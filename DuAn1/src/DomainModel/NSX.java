/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author admin
 */
public class NSX {

    private String idNSX;
    private String maNSX;
    private String tenNSX;

    public NSX() {
    }

    public NSX(String idNSX, String maNSX, String tenNSX) {
        this.idNSX = idNSX;
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
    }

    public NSX(String maNSX, String tenNSX) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
    }

    public NSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    @Override
    public String toString() {
        return "NSX{" + "idNSX=" + idNSX + ", maNSX=" + maNSX + ", tenNSX=" + tenNSX + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{idNSX, maNSX, tenNSX};
    }

}
