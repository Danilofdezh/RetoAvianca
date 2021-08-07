package com.avianca.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String numeroReserva, apellidoPasajero;

    public String getNumeroReserva() {
        return numeroReserva;
    }

    public String getApellidoPasajero() {
        return apellidoPasajero;
    }


    public DataInjection(){
        this.numeroReserva = faker.numerify("1");
        this.apellidoPasajero = faker.name().name();


    }


}
