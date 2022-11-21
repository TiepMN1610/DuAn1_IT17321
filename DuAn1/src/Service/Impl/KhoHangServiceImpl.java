/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Impl;

import DomainModel.KhoHang;
import Reposition.KhoHangReposition;
import Service.KhoHangService;
import java.util.List;

/**
 *
 * @author admin
 */
public class KhoHangServiceImpl implements KhoHangService {

    private KhoHangReposition khr = new KhoHangReposition();

    @Override
    public List<KhoHang> getAll() {
        return khr.getAll();
    }

    @Override
    public KhoHang getOne(String maKH) {
        return khr.getOne(maKH);
    }

    @Override
    public String add(KhoHang kh) {
        boolean add = khr.add(kh);
        if (add) {
            return "add thành công";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(KhoHang kh, String idKH) {
        boolean update = khr.update(kh, idKH);
        if (update) {
            return "update thành công";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String idKH) {
        boolean delete = khr.delete(idKH);
        if (delete) {
            return "delete thành công";
        } else {
            return "delete that bai";
        }
    }

}
