package org.example.service;

import org.example.model.entity.Karyawan;

import java.util.Map;

public interface KaryawanService {
    Map<Integer, Karyawan> getKaryawanList();
    Karyawan create(Karyawan karyawan);
    Karyawan reade(Karyawan karyawan);
    Karyawan update(int id, Karyawan karyawan);
    Karyawan delete(int id);
}
