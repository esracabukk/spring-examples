package com.haydikodlayalim.dto;

import com.haydikodlayalim.entity.Adres;
import com.haydikodlayalim.entity.Kisi;
import lombok.Data;

import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class AdresDto {

    private Long id;
    private String adres;
    private Boolean aktif;;
}
