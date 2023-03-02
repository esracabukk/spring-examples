package com.haydikodlayalim.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="kisi_adres")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Adres implements Serializable {

    @Id
    @SequenceGenerator(name="seq_kisi_adres",allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi_adres",strategy = GenerationType.SEQUENCE)
    private Long id;
    private String adres;
    @Enumerated
    private AdresTip adresTip;
    private Boolean aktif;

    @ManyToOne
    @JoinColumn(name="kisi_adres_id")
    private Kisi kisi;

    enum AdresTip{
        EV_ADRESI,
        IS_ADRESI,
        DIGER
    }
}
