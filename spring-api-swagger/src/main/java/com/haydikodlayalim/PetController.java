package com.haydikodlayalim;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pet")
@Api(value = "Pet Api Documentation")
public class PetController {

    List<Pet> petList=new ArrayList<>();

    @PostConstruct
    public void init(){
        petList.add(new Pet(1,"Kedi",new Date()));
    }

    @GetMapping("/petlist")
    @ApiOperation(value="Pet List")
    public ResponseEntity<List<Pet>> getAllPet(){

        return ResponseEntity.ok(petList);

    }

    @PostMapping("/insert")
    @ApiOperation(value="Pet Save")
    public ResponseEntity<Pet> save(@RequestBody @ApiParam(value = "hayvan") Pet pet){
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }
}
