package com.haydikodlayalim.service;

import com.haydikodlayalim.dto.KisiDto;

import java.util.List;

public interface KisiService {

    KisiDto save(KisiDto kisiDto);

    void delete(KisiDto kisiDto);

    List<KisiDto> getAll();


}
