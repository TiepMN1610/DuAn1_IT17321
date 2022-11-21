/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.DongSP;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DongSPService {

    List<DongSP> getAll();

    DongSP getOne(String tenDSP);

    String add(DongSP dsp);

    String update(DongSP dsp, String idDSP);

    String delete(String idDSP);
}
