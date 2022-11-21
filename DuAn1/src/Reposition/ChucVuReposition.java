/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposition;

import DomainModel.ChucVu;
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
public class ChucVuReposition {

    public List<ChucVu> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[ChucVu]";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<ChucVu> listCV = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3));
                listCV.add(cv);
            }
            return listCV;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public ChucVu getOne(String tenCV) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[ChucVu]\n"
                + "  WHERE Ten like ?";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenCV);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3));
                return cv;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(ChucVu cv) {
        String query = "INSERT INTO [dbo].[ChucVu]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, cv.getMaCV());
            ps.setObject(2, cv.getTenCV());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(ChucVu cv, String idCV) {
        String query = "UPDATE [dbo].[ChucVu]\n"
                + "   SET [Ma] = ?"
                + "      ,[Ten] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, cv.getMaCV());
            ps.setObject(2, cv.getTenCV());
            ps.setObject(3, idCV);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String idCV) {
        String query = "DELETE FROM [dbo].[ChucVu]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, idCV);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
