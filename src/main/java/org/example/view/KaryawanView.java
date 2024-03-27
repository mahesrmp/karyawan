package org.example.view;

import org.example.Data;
import org.example.controller.KaryawanController;
import org.example.model.entity.KantorCabang;
import org.example.model.entity.Karyawan;
import org.example.service.KaryawanService;
import org.example.service.KaryawanServiceImpl;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class KaryawanView {
    Scanner scanner = new Scanner(System.in);
    public void displayKaryawans(Map<Integer, Karyawan> karyawanMap){
        Set<Integer> setId = Data.karyawanMap.keySet();
        displayHeader();
        for (Integer key : setId) {
            displayKaryawan(Data.karyawanMap.get(key));
        }
    }

    private void displayHeader(){
        System.out.println("ID | Nama | Alamat | Kantor");
        System.out.println("===============================");
    }

    private void displayKaryawan(Karyawan karyawan){
        System.out.println(karyawan.getId()+" | "+karyawan.getNama()+" | "+karyawan.getAlamat()+" | "+karyawan.getKantor().getKota());
    }

    public void karyawanForm() {
        Karyawan karyawan = new Karyawan();

        System.out.print("ID:");
        int id =  scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama:");
        String nama = scanner.nextLine();

        System.out.print("Alamat:");
        String alamat = scanner.nextLine();

        System.out.print("Kota:");
        String kota = scanner.nextLine();

        karyawan.setId(id);
        karyawan.setNama(nama);
        karyawan.setAlamat(alamat);
        KantorCabang kantor = new KantorCabang(kota);
        karyawan.setKantor(kantor);

        KaryawanController karyawanController = new KaryawanController();
        karyawanController.add(karyawan);
    }

    public void karyawanUpdate() {
        Karyawan karyawan = new Karyawan();
        System.out.println("Pilih id Karyawan mana yang ingin di update: ");
        int idKaryawan = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama:");
        String nama = scanner.nextLine();

        System.out.print("Alamat:");
        String alamat = scanner.nextLine();

        System.out.print("Kota:");
        String kota = scanner.nextLine();

        karyawan.setNama(nama);
        karyawan.setAlamat(alamat);
        KantorCabang kantor = new KantorCabang(kota);
        karyawan.setKantor(kantor);

        KaryawanController karyawanController = new KaryawanController();
        karyawanController.update(idKaryawan, karyawan);
    }

    public void karyawanDelete(){
//        Karyawan karyawan = new Karyawan();
        System.out.println("Pilih id Karyawan mana yang ingin di update: ");
        int idKaryawan = scanner.nextInt();
        scanner.nextLine();

        KaryawanController karyawanController = new KaryawanController();
        karyawanController.delete(idKaryawan);
    }

}

//    public void karyawanUpdate(){
//        System.out.println("Pilih id Karyawan mana yang ingin di update: ");
//        int idKaryawan = scanner.nextInt();
//
//        karyawanForm(idKaryawan);
//    }
