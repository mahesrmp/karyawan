package org.example.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class KantorCabang {
    private int id;
    private String kota;
    private String alamat;

    public KantorCabang(String kota) {
        this.kota = kota;
    }
}
