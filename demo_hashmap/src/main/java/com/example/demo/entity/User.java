package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author Hariom Yadav
 * @create 5/16/2021
 */
@Getter
@Setter
@ToString(callSuper = true)
public class User extends BaseEntity{
    String userName;
    String address;
}
