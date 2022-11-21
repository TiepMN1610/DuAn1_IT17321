/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Impl;

import DomainModel.NSX;
import Reposition.NSXReposition;
import Service.NSXService;
import java.util.List;

/**
 *
 * @author admin
 */
public class NSXServiceImpl implements NSXService {

    NSXReposition nsxr = new NSXReposition();

    @Override
    public List<NSX> getAll() {
        return nsxr.getAll();
    }

    @Override
    public NSX getOne(String tenNSX) {
        return nsxr.getOne(tenNSX);
    }

    @Override
    public String delete(String idNSX) {
        boolean delete = nsxr.delete(idNSX);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

    @Override
    public String add(NSX nsx) {
        boolean add = nsxr.add(nsx);
        if (add) {
            return " add thanh cong";
        } else {
            return "add that bai";
        }
    }

    @Override
    public String update(NSX nsx, String idNSX) {
        boolean update = nsxr.update(nsx, idNSX);
        if (update) {
            return "update thanh cong";
        } else {
            return "updat that bai";
        }
    }
}
