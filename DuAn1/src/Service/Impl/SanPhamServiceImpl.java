/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Impl;

import Reposition.SanPhamReposition;
import Service.SanPhamService;
import ViewModel.ViewModelSanPham;
import java.util.List;

/**
 *
 * @author admin
 */
public class SanPhamServiceImpl implements SanPhamService {
    
    private SanPhamReposition spr = new SanPhamReposition();
    
    @Override
    public List<ViewModelSanPham> getAll() {
        return spr.getAll();
    }
    
    @Override
    public ViewModelSanPham getOne(String tenSP) {
        return spr.getOne(tenSP);
    }
    
    @Override
    public String add(ViewModelSanPham vmsp) {
        boolean add = spr.add(vmsp);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }
    
    @Override
    public String update(ViewModelSanPham vmsp, String idSP) {
        boolean update = spr.update(vmsp, idSP);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }
    
    @Override
    public String delete(String idSP) {
        boolean delete = spr.delete(idSP);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }
    
}
