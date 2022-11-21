/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposition;

import DomainModel.LoaiSanPham;
import Untilities.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class LoaiSanPhamReposition {

    public List<LoaiSanPham> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[LoaiSP]";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<LoaiSanPham> listLSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham(rs.getString(1), rs.getString(2), rs.getString(3));
                listLSP.add(lsp);
            }
            return listLSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public LoaiSanPham getOne(String tenLSP) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[LoaiSP]\n"
                + "  WHERE Ten like ?";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenLSP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham(rs.getString(1), rs.getString(2), rs.getString(3));
                return lsp;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(LoaiSanPham lsp) {
        String query = "INSERT INTO [dbo].[LoaiSP]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, lsp.getMaLSP());
            ps.setObject(2, lsp.getTenLSP());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(LoaiSanPham lsp, String idLSP) {
        String query = "UPDATE [dbo].[LoaiSP]\n"
                + "   SET [Ma] = ?"
                + "      ,[Ten] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, lsp.getMaLSP());
            ps.setObject(2, lsp.getTenLSP());
            ps.setObject(3, idLSP);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String idLSP) {
        String query = "DELETE FROM [dbo].[LoaiSP]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, idLSP);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
