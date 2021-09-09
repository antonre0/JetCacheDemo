package com.test.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resources;


@Repository
public class HelloDao {
    public String get(Integer id) {
        return "hello";
    }
}
