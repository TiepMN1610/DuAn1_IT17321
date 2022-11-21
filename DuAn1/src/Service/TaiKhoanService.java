/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.TaiKhoan;
import java.util.List;

/**
 *
 * @author admin
 */
public interface TaiKhoanService {

    List<TaiKhoan> getAll();

    TaiKhoan getOne(String tenTK);

    String add(TaiKhoan tk);

    String update(TaiKhoan tk, String idTK);

    String delete(String idTK);
}
