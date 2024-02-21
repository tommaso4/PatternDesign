package it.patternDesign.adapter;

import java.time.LocalDate;

public class Info {
    private String name;
    private String surname;
    private LocalDate dataNascita;

    public Info(String name, String surname, LocalDate dataNascita) {
        this.name = name;
        this.surname = surname;
        this.dataNascita = dataNascita;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
}
