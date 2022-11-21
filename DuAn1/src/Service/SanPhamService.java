/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.ViewModelSanPham;
import java.util.List;

/**
 *
 * @author admin
 */
public interface SanPhamService {

    List<ViewModelSanPham> getAll();

    ViewModelSanPham getOne(String tenSP);

    String add(ViewModelSanPham vmsp);

    String update(ViewModelSanPham vmsp, String idSP);

    String delete(String idSP);
}
