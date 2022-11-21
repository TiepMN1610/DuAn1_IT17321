/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.KhoHang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface KhoHangService {

    List<KhoHang> getAll();

    KhoHang getOne(String maKH);

    String add(KhoHang kh);

    String update(KhoHang kh, String idKH);

    String delete(String idKH);
}
