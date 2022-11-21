/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Impl;

import DomainModel.TaiKhoan;
import Reposition.TaiKhoanReposition;
import Service.TaiKhoanService;
import java.util.List;

/**
 *
 * @author admin
 */
public class TaiKhoanServiceImpl implements TaiKhoanService {
    
    private TaiKhoanReposition tkr = new TaiKhoanReposition();
    
    @Override
    public List<TaiKhoan> getAll() {
        return tkr.getAll();
    }
    
    @Override
    public TaiKhoan getOne(String tenTK) {
        return tkr.getOne(tenTK);
    }
    
    @Override
    public String add(TaiKhoan tk) {
        boolean add = tkr.add(tk);
        if (add) {
            return "add thanh cong";
        } else {
            return "add thất bại";
        }
    }
    
    @Override
    public String update(TaiKhoan tk, String idTK) {
        boolean update = tkr.update(tk, idTK);
        if (update) {
            return "update thanh cong";
        } else {
            return "update thất bại";
        }
    }
    
    @Override
    public String delete(String idTK) {
        boolean delete = tkr.delete(idTK);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete thất bại";
        }
    }
    
}
