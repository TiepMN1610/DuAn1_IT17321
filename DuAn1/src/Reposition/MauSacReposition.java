/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposition;

import DomainModel.MauSac;
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
public class MauSacReposition {

    public List<MauSac> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[MauSac]";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<MauSac> listMS = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                listMS.add(ms);
            }
            return listMS;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public MauSac getOne(String tenMS) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[MauSac]\n"
                + "  WHERE Ten like ?";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenMS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                return ms;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(MauSac ms) {
        String query = "INSERT INTO [dbo].[MauSac]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ms.getMaMS());
            ps.setObject(2, ms.getTenMS());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(MauSac ms, String idMS) {
        String query = "UPDATE [dbo].[MauSac]\n"
                + "   SET [Ma] = ?"
                + "      ,[Ten] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ms.getMaMS());
            ps.setObject(2, ms.getTenMS());
            ps.setObject(3, idMS);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String idMS) {
        String query = "DELETE FROM [dbo].[MauSac]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, idMS);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
