package com.demo.serverapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: leesanghyuk
 * Date: 2019-09-11 14:57
 * Description:
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User{
    private String name;
    private Integer age;
}