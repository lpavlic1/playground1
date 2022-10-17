package main.java.hr.java.vjezbe.entitet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Student {
    private String ime;
    private String prezime;
    private String JMBAG;
    private LocalDate datumRodjenja;

    public Student(String ime, String prezime, String JMBAG, LocalDate datumRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBAG = JMBAG;
        this.datumRodjenja = datumRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJMBAG() {
        return JMBAG;
    }

    public void setJMBAG(String JMBAG) {
        this.JMBAG = JMBAG;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public static Student unesiStudenta(Scanner scanner)
    {
        System.out.print("Unesite ime studenta:");
        String ime=scanner.nextLine();
        System.out.print("Unesite prezime studenta:");
        String prezime=scanner.nextLine();
        System.out.print("Unesite datum rodenja studenta "+prezime+" "+ime+" u formatu (dd.MM.yyyy.):");
        String datumRodjenjaString=scanner.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy.");
        LocalDate datumRodjenja=LocalDate.parse(datumRodjenjaString,formatter);
        System.out.print("Unesite JMBAG studenta: "+prezime+" "+ime+":");
        String JMBAG=scanner.nextLine();
        return new Student(ime,prezime,JMBAG,datumRodjenja);
    }
}
