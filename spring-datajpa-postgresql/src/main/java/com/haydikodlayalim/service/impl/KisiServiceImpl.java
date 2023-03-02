package com.haydikodlayalim.service.impl;

import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.entity.Kisi;
import com.haydikodlayalim.repository.AdresRepository;
import com.haydikodlayalim.repository.KisiRepository;
import com.haydikodlayalim.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class KisiServiceImpl implements KisiService {

    private final KisiRepository kisiRepository;
    private final AdresRepository adresRepository;
    @Override
    @Transactional
    public KisiDto save(KisiDto kisiDto) {
        Kisi kisi=new Kisi();
        kisi.setId(kisiDto.getId());
        kisi.setAd(kisiDto.getAd());
        kisi.setSoyad(kisiDto.getSoyad());
        Kisi kisiDB= kisiRepository.save(kisi);
        kisiDto.setId(kisiDB.getId());
        return kisiDto;
    }

    @Override
    public void delete(KisiDto kisiDto) {

    }

    @Override
    public List<KisiDto> getAll() {
        List<Kisi> kisiRepositoryAll = kisiRepository.findAll();
        List<KisiDto> kisiDtoList =new ArrayList<>();
        kisiRepositoryAll.forEach(i->{
            KisiDto kisiDto = new KisiDto();
            kisiDto.setId(i.getId());
            kisiDto.setAd(i.getAd());
            kisiDto.setSoyad(i.getSoyad());
            kisiDtoList.add(kisiDto);

        });
        return kisiDtoList;
    }
}
