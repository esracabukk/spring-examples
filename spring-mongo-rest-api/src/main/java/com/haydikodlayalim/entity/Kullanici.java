package com.haydikodlayalim.entity;


import org.springframework.data.annotation.Id;

import java.util.HashMap;

public class Kullanici {
    @Id
    private int id;
    private String name;

    private HashMap attiribute;

}
