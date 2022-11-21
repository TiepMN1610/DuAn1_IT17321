/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Impl;

import DomainModel.LoaiSanPham;
import Reposition.LoaiSanPhamReposition;
import Service.LoaiSPService;
import java.util.List;

/**
 *
 * @author admin
 */
public class LoaiSanPhamServiceImpl implements LoaiSPService {
    
    private LoaiSanPhamReposition lspr = new LoaiSanPhamReposition();
    
    @Override
    public List<LoaiSanPham> getAll() {
        return lspr.getAll();
    }
    
    @Override
    public LoaiSanPham getOne(String tenLSP) {
        return lspr.getOne(tenLSP);
    }
    
    @Override
    public String add(LoaiSanPham lsp) {
        boolean add = lspr.add(lsp);
        if (add) {
            return "add thanh cong";
        } else {
            return "add that bai";
        }
    }
    
    @Override
    public String update(LoaiSanPham lsp, String idLSP) {
        boolean update = lspr.update(lsp, idLSP);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }
    
    @Override
    public String delete(String idLSP) {
        boolean delete = lspr.delete(idLSP);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }
    
}
