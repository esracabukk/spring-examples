package com.haydikodlayalim.controller;

import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class KisiController {

    private final KisiService kisiService;

    @GetMapping("/kisigetir")
    public ResponseEntity<List<KisiDto>> kisilerigetir(){

        return ResponseEntity.ok(kisiService.getAll());

    }

    @PostMapping
    public ResponseEntity<KisiDto> kaydet(@RequestBody KisiDto kisiDto){
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }

}
