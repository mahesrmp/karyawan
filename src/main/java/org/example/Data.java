package org.example;

import org.example.model.entity.KantorCabang;
import org.example.model.entity.Karyawan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    public static List<Karyawan> karyawanList = new ArrayList<>();
    public static Map<Integer, Karyawan> karyawanMap = new HashMap<>();
    public static void init(){
        KantorCabang kantorCabang1 = new KantorCabang();
        kantorCabang1.setId(1);
        kantorCabang1.setKota("Medan");
        kantorCabang1.setAlamat("Sumatera Utara");

        KantorCabang kantorCabang2 = new KantorCabang();
        kantorCabang2.setId(2);
        kantorCabang2.setKota("Bandung");
        kantorCabang2.setAlamat("Jawa Barat");

        Karyawan karyawan1 = new Karyawan();
        karyawan1.setId(1);
        karyawan1.setNama("Ahmad");
        karyawan1.setTanggalLahir(LocalDate.of(1999, 12, 1));
        karyawan1.setAlamat("Bandung");
        karyawan1.setStatus(true);
        karyawan1.setKantor(kantorCabang1);

        Karyawan karyawan2 = new Karyawan();
        karyawan2.setId(2);
        karyawan2.setNama("Tina");
        karyawan2.setTanggalLahir(LocalDate.of(2000, 12, 11));
        karyawan2.setAlamat("Palembang");
        karyawan2.setStatus(true);
        karyawan2.setKantor(kantorCabang1);


        Karyawan karyawan3 = new Karyawan();
        karyawan3.setId(3);
        karyawan3.setNama("Yudi");
        karyawan3.setTanggalLahir(LocalDate.of(1989, 1, 1));
        karyawan3.setAlamat("Bandung");
        karyawan3.setStatus(false);
        karyawan3.setKantor(kantorCabang1);

        karyawanList.add(karyawan1);
        karyawanList.add(karyawan2);
        karyawanList.add(karyawan3);

        karyawanMap.put(karyawan1.getId(), karyawan1);
        karyawanMap.put(karyawan2.getId(), karyawan2);
        karyawanMap.put(karyawan3.getId(), karyawan3);
    }
}
