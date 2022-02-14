package com.carara.springappdemo.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class UserModel {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}