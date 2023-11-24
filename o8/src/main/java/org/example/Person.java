package org.example;

final class Person {
    private String fornavn;
    private String etternavn;
    private int birthYear;

    public Person(String fornavn, String etternavn, int birthYear){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

}
