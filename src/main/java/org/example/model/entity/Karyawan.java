package org.example.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class Karyawan {
    private int id;
    private String nama;
    private LocalDate tanggalLahir;
    private String alamat;
    private  boolean status;
    private  KantorCabang kantor;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
