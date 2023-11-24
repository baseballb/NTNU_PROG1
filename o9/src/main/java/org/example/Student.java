package org.example;

public class Student {
    private String navn;
    private int antOppg;
    public String getNavn(){
        return navn;
    }
    public int getAntOppg(){
        return antOppg;
    }
    public void okAntOppg(int okning){
        antOppg = antOppg + okning;
    }
    public Student(String navn, int antOppg){
        this.navn = navn;
        this.antOppg = antOppg;
    }
}
