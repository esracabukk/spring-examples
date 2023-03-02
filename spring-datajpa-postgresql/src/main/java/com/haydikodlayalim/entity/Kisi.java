package com.haydikodlayalim.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="kisi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Kisi {

    @Id
    @SequenceGenerator(name="seq_kisi",allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi",strategy = GenerationType.SEQUENCE)
    private Long id;

    private  String ad;

    private String soyad;

    @OneToMany
    @JoinColumn(name="kisi_adres_id")
    private List<Adres> adresList;
}
