/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Impl;

import DomainModel.MauSac;
import Reposition.MauSacReposition;
import Service.MauSacService;
import java.util.List;

/**
 *
 * @author admin
 */
public class MauSacServiceImpl implements MauSacService {

    MauSacReposition msr = new MauSacReposition();

    @Override
    public List<MauSac> getAll() {
        return msr.getAll();
    }

    @Override
    public MauSac getOne(String tenMS) {
        return msr.getOne(tenMS);
    }

    @Override
    public String add(MauSac ms) {
        boolean add = msr.add(ms);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String delete(String idMS) {
        boolean delete = msr.delete(idMS);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete thanh cong";
        }
    }

    @Override
    public String update(MauSac ms, String idMS) {
        boolean update = msr.update(ms, idMS);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

}
