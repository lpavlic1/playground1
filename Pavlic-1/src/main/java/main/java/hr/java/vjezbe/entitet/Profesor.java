package main.java.hr.java.vjezbe.entitet;

import java.util.Scanner;

public class Profesor {
    private String sifra;
    private String ime;
    private String prezime;
    private String titula;

    public Profesor(String sifra, String ime, String prezime, String titula) {
        this.sifra = sifra;
        this.ime = ime;
        this.prezime = prezime;
        this.titula = titula;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
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

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public static Profesor unesiProfesora(Scanner scanner)
    {
        System.out.print("Unesite sifru profesora:");
        String sifra=scanner.nextLine();
        System.out.print("Unesite ime profesora:");
        String ime=scanner.nextLine();
        System.out.print("Unesite prezime profesora:");
        String prezime=scanner.nextLine();
        System.out.print("Unesite titulu profesora:");
        String titula=scanner.nextLine();

        return new Profesor(sifra,ime,prezime,titula);
    }
}
