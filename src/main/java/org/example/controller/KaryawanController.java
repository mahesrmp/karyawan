package org.example.controller;

import org.example.model.entity.Karyawan;
import org.example.service.KaryawanService;
import org.example.service.KaryawanServiceImpl;
import org.example.view.KaryawanView;
import org.example.view.MenuView;

import java.util.Map;

public class KaryawanController {

    public void mainMenu(){
        displayKaryawans();

        MenuView menuView = new MenuView();
        menuView.displayMainMenu();
    }

    public void displayKaryawans(){
        KaryawanService karyawanService = new KaryawanServiceImpl();
        Map<Integer, Karyawan> karyawanMap = karyawanService.getKaryawanList();

        KaryawanView karyawanView = new KaryawanView();
        karyawanView.displayKaryawans(karyawanMap);
    }

    public void menuSelection(int selectedMenu){
        if(selectedMenu==1){
            KaryawanView karyawanView = new KaryawanView();
            karyawanView.karyawanForm();
        } else if (selectedMenu==2) {
            KaryawanView karyawanView = new KaryawanView();
            karyawanView.karyawanUpdate();
        } else if (selectedMenu==3) {
            KaryawanView karyawanView = new KaryawanView();
            karyawanView.karyawanDelete();
        }
    }

    public void add(Karyawan karyawan) {
        KaryawanService karyawanService = new KaryawanServiceImpl();
        karyawanService.create(karyawan);

        mainMenu();
    }

    public void update(int id, Karyawan karyawan){
        KaryawanService karyawanService = new KaryawanServiceImpl();
        karyawanService.update(id, karyawan);

        mainMenu();
    }

    public void delete(int id){
        KaryawanService karyawanService = new KaryawanServiceImpl();
        karyawanService.delete(id);

        mainMenu();
    }

//    public void createDataKaryawan(Long id, String nama, String alamat, LocalDate tanggalLahir, boolean status){
//        karyawanModel.setId(id);
//        karyawanModel.setNama(nama);
//        karyawanModel.setAlamat(alamat);
//        karyawanModel.setTanggalLahir(tanggalLahir);
//        karyawanModel.setStatus(status);
//
//        dataKaryawan.add(karyawanModel);
//    }
//
//    public void readDataKaryawan(){
//        System.out.println("Data Karyawan: ");
//        for (Karyawan karyawan : dataKaryawan){
//            System.out.println(karyawan.getNama() + karyawan.getTanggalLahir() + karyawan.getAlamat());
//        }
//    }
//
//    public void updateDataKaryawan(Long id, String nama, String alamat, LocalDate tanggalLahir, boolean status){
//        karyawanModel.setId(id);
//        karyawanModel.setNama(nama);
//        karyawanModel.setAlamat(alamat);
//        karyawanModel.setTanggalLahir(tanggalLahir);
//        karyawanModel.setStatus(status);
//        dataKaryawan.set(1, karyawanModel);
//    }
//
//    public void deleteDataKaryawan(){
//        dataKaryawan.remove(1);
//    }
//
//    public boolean emptyDataKaryawan(){
//        return dataKaryawan.isEmpty();
//    }
}
