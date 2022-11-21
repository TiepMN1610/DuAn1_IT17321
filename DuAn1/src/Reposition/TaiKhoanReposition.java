/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposition;

import DomainModel.TaiKhoan;
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
public class TaiKhoanReposition {

    public List<TaiKhoan> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[Ten]\n"
                + "      ,[Password]\n"
                + "      ,[VaiTro]\n"
                + "  FROM [dbo].[TaiKhoan]";
        try (Connection con = DBContext.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<TaiKhoan> listTK = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listTK.add(tk);
            }
            return listTK;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public TaiKhoan getOne(String tenTK) {
        String query = "SELECT [Id]\n"
                + "      ,[Ten]\n"
                + "      ,[Password]\n"
                + "      ,[VaiTro]\n"
                + "  FROM [dbo].[TaiKhoan]\n"
                + "  WHERE TaiKhoan.Ten like ?";
        try (Connection con = DBContext.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenTK);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                return tk;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(TaiKhoan tk) {
        String query = "INSERT INTO [dbo].[TaiKhoan]\n"
                + "           ([Ten]\n"
                + "           ,[Password]\n"
                + "           ,[VaiTro])\n"
                + "     VALUES\n"
                + "           (?,?,?)";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tk.getTenTK());
            ps.setObject(2, tk.getPassTK());
            ps.setObject(3, tk.getVaiTro());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(TaiKhoan tk, String idTK) {
        String query = "UPDATE [dbo].[TaiKhoan]\n"
                + "   SET [Id] = <Id, uniqueidentifier,>\n"
                + "      ,[Ten] = <Ten, nvarchar(50),>\n"
                + "      ,[Password] = <Password, nvarchar(50),>\n"
                + "      ,[VaiTro] = <VaiTro, nvarchar(50),>\n"
                + " WHERE <Search Conditions,,>";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String idTK) {
        String query = "DELETE FROM [dbo].[TaiKhoan]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, idTK);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
