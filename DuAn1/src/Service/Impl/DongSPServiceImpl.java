/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Impl;

import DomainModel.DongSP;
import Reposition.DongSPReposition;
import Service.DongSPService;
import java.util.List;

/**
 *
 * @author admin
 */
public class DongSPServiceImpl implements DongSPService {

    DongSPReposition dspr = new DongSPReposition();

    @Override
    public List<DongSP> getAll() {
        return dspr.getAll();
    }

    @Override
    public DongSP getOne(String tenDSP) {
        return dspr.getOne(tenDSP);
    }

    @Override
    public String add(DongSP dsp) {
        boolean add = dspr.add(dsp);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(DongSP dsp, String idDSP) {
        boolean update = dspr.update(dsp, idDSP);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String idDSP) {
        boolean delete = dspr.delete(idDSP);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

}
