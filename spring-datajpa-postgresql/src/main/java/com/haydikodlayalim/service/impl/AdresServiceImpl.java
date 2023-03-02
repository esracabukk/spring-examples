package com.haydikodlayalim.service.impl;

import com.haydikodlayalim.dto.AdresDto;
import com.haydikodlayalim.service.AdresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdresServiceImpl implements AdresService {
    @Override
    public AdresDto save(AdresDto AdresDto) {
        return null;
    }

    @Override
    public void delete(AdresDto AdresDto) {

    }

    @Override
    public List<AdresDto> getAll(AdresDto AdresDto) {
        return null;
    }
}
