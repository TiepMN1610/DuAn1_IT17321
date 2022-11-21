/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposition;

import DomainModel.KhoHang;
import Untilities.DBContext;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public class KhoHangReposition {
    
    public List<KhoHang> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[DiaChi]\n"
                + "      ,[SoDienThoai]\n"
                + "      ,[GhiChu]\n"
                + "      ,[TrangThai]\n"
                + "  FROM [dbo].[KhoHang]";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<KhoHang> listKH = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhoHang kh = new KhoHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                listKH.add(kh);
            }
            return listKH;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public KhoHang getOne(String maKH) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[DiaChi]\n"
                + "      ,[SoDienThoai]\n"
                + "      ,[GhiChu]\n"
                + "      ,[TrangThai]\n"
                + "  FROM [dbo].[KhoHang]\n"
                + "  WHERE Ma like ?";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, maKH);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                KhoHang kh = new KhoHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                return kh;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public boolean add(KhoHang kh) {
        String query = "INSERT INTO [dbo].[KhoHang]\n"
                + "           ([Ma]\n"
                + "           ,[DiaChi]\n"
                + "           ,[SoDienThoai]\n"
                + "           ,[GhiChu]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, kh.getMaKhoHang());
            ps.setObject(2, kh.getDiaChi());
            ps.setObject(3, kh.getSoDienThoai());
            ps.setObject(4, kh.getGhiChu());
            ps.setObject(5, kh.getTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
    
    public boolean update(KhoHang kh, String idKH) {
        String query = "UPDATE [dbo].[KhoHang]\n"
                + "   SET [Ma] = ?"
                + "      ,[DiaChi] = ?"
                + "      ,[SoDienThoai] = ?"
                + "      ,[GhiChu] = ?"
                + "      ,[TrangThai] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, kh.getMaKhoHang());
            ps.setObject(2, kh.getDiaChi());
            ps.setObject(3, kh.getSoDienThoai());
            ps.setObject(4, kh.getGhiChu());
            ps.setObject(5, kh.getTrangThai());
            ps.setObject(6, idKH);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
    
    public boolean delete(String idKH) {
        String query = "DELETE FROM [dbo].[KhoHang]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, idKH);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
