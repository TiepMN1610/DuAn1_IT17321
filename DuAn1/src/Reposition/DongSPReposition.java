/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposition;

import DomainModel.DongSP;
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
public class DongSPReposition {
       public List<DongSP> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[DongSP]";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<DongSP> listDSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongSP dsp = new DongSP(rs.getString(1), rs.getString(2), rs.getString(3));
                listDSP.add(dsp);
            }
            return listDSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public DongSP getOne(String tenDSP) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[DongSP]\n"
                + "  WHERE Ten like ?";
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenDSP);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                DongSP dsp = new DongSP(rs.getString(1), rs.getString(2), rs.getString(3));
                return dsp;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(DongSP dsp) {
        String query = "INSERT INTO [dbo].[DongSP]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, dsp.getMaDSP());
            ps.setObject(2, dsp.getTenDSP());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(DongSP dsp, String idDSP) {
        String query = "UPDATE [dbo].[DongSP]\n"
                + "   SET [Ma] = ?"
                + "      ,[Ten] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, dsp.getMaDSP());
            ps.setObject(2, dsp.getTenDSP());
            ps.setObject(3, idDSP);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String idDSP) {
        String query = "DELETE FROM [dbo].[DongSP]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection conn = DBContext.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, idDSP);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
