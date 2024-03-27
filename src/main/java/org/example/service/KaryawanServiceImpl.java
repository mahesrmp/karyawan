package org.example.service;

import org.example.Data;
import org.example.model.entity.Karyawan;

import java.time.LocalDateTime;
import java.util.Map;

public class KaryawanServiceImpl implements KaryawanService{
    @Override
    public Map<Integer, Karyawan> getKaryawanList() {
        return Data.karyawanMap;
    }

    @Override
    public Karyawan create(Karyawan karyawan) {
        karyawan.setCreatedDate(LocalDateTime.now());
        return Data.karyawanMap.put(karyawan.getId(), karyawan);
    }

    @Override
    public Karyawan reade(Karyawan karyawan) {
        return Data.karyawanMap.get(karyawan);
    }

    @Override
    public Karyawan update(int id, Karyawan karyawan) {
        Karyawan updateKaryawan = Data.karyawanMap.get(id);
        updateKaryawan.setNama(karyawan.getNama());
        updateKaryawan.setKantor(karyawan.getKantor());
        updateKaryawan.setAlamat(karyawan.getAlamat());
        updateKaryawan.setUpdatedDate(LocalDateTime.now());
        Data.karyawanMap.replace(id, updateKaryawan);
        return updateKaryawan;
    }

    @Override
    public Karyawan delete(int id) {
        return Data.karyawanMap.remove(id);
    }

    public static Karyawan getKaryawanById(int id) {
        return Data.karyawanMap.get(id);
    }
}
