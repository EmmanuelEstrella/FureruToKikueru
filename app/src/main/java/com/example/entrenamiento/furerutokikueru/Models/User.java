package com.example.entrenamiento.furerutokikueru.Models;

import java.util.Date;

/**
 * Created by Emmanuel on 24/02/2018.
 */

public class User {
    public String name;
    public Date birthday;

    public User(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
