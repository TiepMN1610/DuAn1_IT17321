/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.ChucVu;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ChucVuService {

    List<ChucVu> getAll();

    ChucVu getOne(String tenCV);

    String add(ChucVu cv);

    String update(ChucVu cv, String idCV);

    String delete(String idCV);
}
