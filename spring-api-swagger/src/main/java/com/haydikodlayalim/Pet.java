package com.haydikodlayalim;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="Pet Object")
public class Pet {

    @ApiModelProperty(value="ID")
    private int id;

    @ApiModelProperty(value="AD")
    private String name;
    @ApiModelProperty(value = "TARIH")
    private Date date;
}
