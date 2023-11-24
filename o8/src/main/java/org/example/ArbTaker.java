package org.example;
import java.util.GregorianCalendar;


public class ArbTaker {
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    private Person personalia;
    private int arbtakernr;
    private int yearOfHiring;
    private double monthlyWage;
    private double skatteProsent;

    public ArbTaker(Person personalia, int arbtakernr, int yearOfHiring, double monthlyWage, double skatteProsent){
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.yearOfHiring = yearOfHiring;
        this.monthlyWage = monthlyWage;
        this.skatteProsent = skatteProsent;
    }

    public double getMonthlyWage() {
        return monthlyWage;
    }

    public double getSkatteProsent() {
        return skatteProsent;
    }

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getYearOfHiring() {
        return yearOfHiring;
    }

    public Person getPersonalia() {
        return personalia;
    }

    public void setMonthlyWage(double monthlyWage) {
        this.monthlyWage = monthlyWage;
    }

    public void setSkatteProsent(double skatteProsent) {
        this.skatteProsent = skatteProsent;
    }

    public double skatteTrekk(){
        return monthlyWage * skatteProsent;
    }
    public double salary(){
        return monthlyWage * 12;
    }
    public double yearlyTax(){
        return monthlyWage * skatteProsent * 10.5;
    }
    public String lastFirst(){
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }
    public int alder(){
        int currentYear = kalender.get(java.util.Calendar.YEAR);
        return currentYear - personalia.getBirthYear();
    }
    public int yearsEmployed(){
        int currentYear = kalender.get(java.util.Calendar.YEAR);
        return currentYear - yearOfHiring;
    }
    public boolean hiredMoreThan(int n){
        return yearsEmployed() > n;
    }

}
