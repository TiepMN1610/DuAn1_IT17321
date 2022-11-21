/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.LoaiSanPham;
import java.util.List;

/**
 *
 * @author admin
 */
public interface LoaiSPService {

    List<LoaiSanPham> getAll();

    LoaiSanPham getOne(String tenLSP);

    String add(LoaiSanPham lsp);

    String update(LoaiSanPham lsp, String idLSP);

    String delete(String idLSP);
}
