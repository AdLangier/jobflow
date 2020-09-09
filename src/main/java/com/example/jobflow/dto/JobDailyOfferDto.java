package com.example.jobflow.dto;


import lombok.Getter;
import lombok.Setter;

/*
DTO = data transfer object, wzorzec projektowy, klasa, która jest odpowiedzialna za zwracanie JSON
Jak ten JSON może wyglądać
 */
@Getter
@Setter
public class JobDailyOfferDto {


    private String tagName;

    private String city;

    private Integer quantity;

    public JobDailyOfferDto(String tagName, String city, Integer quantity) {
        this.tagName = tagName;
        this.city = city;
        this.quantity = quantity;


    }



}
