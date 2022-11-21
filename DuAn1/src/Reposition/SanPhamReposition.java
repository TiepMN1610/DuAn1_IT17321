/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposition;

import DomainModel.LoaiSanPham;
import Untilities.DBContext;
import ViewModel.ViewModelSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class SanPhamReposition {

    public List<ViewModelSanPham> getAll() {
        String query = "SELECT dbo.SanPham.Id, dbo.LoaiSP.Id AS Expr1, dbo.LoaiSP.Ten, dbo.SanPham.Ma, dbo.SanPham.Ten AS Expr2\n"
                + "FROM     dbo.LoaiSP INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.LoaiSP.Id = dbo.SanPham.IdLoaiSP";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<ViewModelSanPham> listVMSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham(rs.getString(2), rs.getString(3));
                ViewModelSanPham vmsp = new ViewModelSanPham(rs.getString(1), lsp, rs.getString(4), rs.getString(5));
                listVMSP.add(vmsp);
            }
            return listVMSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public ViewModelSanPham getOne(String tenSP) {
        String query = "SELECT dbo.SanPham.Id, dbo.LoaiSP.Id AS Expr1, dbo.LoaiSP.Ten, dbo.SanPham.Ma, dbo.SanPham.Ten AS Expr2\n"
                + "FROM     dbo.LoaiSP INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.LoaiSP.Id = dbo.SanPham.IdLoaiSP\n"
                + "				  where SanPham.Ten like ?";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenSP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham(rs.getString(2), rs.getString(3));
                ViewModelSanPham vmsp = new ViewModelSanPham(rs.getString(1), lsp, rs.getString(4), rs.getString(5));
                return vmsp;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean delete(String idSP) {
        String query = "DELETE FROM [dbo].[SanPham]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, idSP);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(ViewModelSanPham vmsp, String idSP) {
        String query = "UPDATE [dbo].[SanPham]\n"
                + "   SET [IdLoaiSP] = ?"
                + "      ,[Ma] = ?"
                + "      ,[Ten] = ?"
                + " WHERE SanPham.Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, vmsp.getLsp().getIdLSP());
            ps.setObject(2, vmsp.getMaSP());
            ps.setObject(3, vmsp.getTenSP());
            ps.setObject(4, idSP);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean add(ViewModelSanPham vmsp) {
        String query = "INSERT INTO [dbo].[SanPham]\n"
                + "           ([IdLoaiSP]\n"
                + "           ,[Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?,?)";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, vmsp.getLsp().getIdLSP());
            ps.setObject(2, vmsp.getMaSP());
            ps.setObject(3, vmsp.getTenSP());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
