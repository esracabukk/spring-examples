package com.haydikodlayalim.service;


import com.haydikodlayalim.dto.AdresDto;

import java.util.List;

public interface AdresService {

    AdresDto save(AdresDto AdresDto);

    void delete(AdresDto AdresDto);

    List<AdresDto> getAll(AdresDto AdresDto);
}
