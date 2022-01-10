package com.github.autolog.dto;

import lombok.Data;
import lombok.Getter;

/**
 * @author fengyue
 * @date 2021/11/8
 */
@Data
public class Person {

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


}
