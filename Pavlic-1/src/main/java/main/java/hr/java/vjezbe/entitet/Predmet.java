package main.java.hr.java.vjezbe.entitet;

import java.util.Scanner;

public class Predmet {
    private String sifra;
    private String naziv;
    private int brojEctsBodova;
    private Profesor nositelj;
    private Student[] studenti;
    private int br_studenta;

    public Predmet(String sifra, String naziv, int brojEctsBodova, Profesor nositelj,int br_studenta) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.brojEctsBodova = brojEctsBodova;
        this.nositelj = nositelj;
        this.br_studenta=br_studenta;

    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojEctsBodova() {
        return brojEctsBodova;
    }

    public void setBrojEctsBodova(int brojEctsBodova) {
        this.brojEctsBodova = brojEctsBodova;
    }

    public Profesor getNositelj() {
        return nositelj;
    }

    public void setNositelj(Profesor nositelj) {
        this.nositelj = nositelj;
    }

    public int getBr_studenta() {
        return br_studenta;
    }

    public void setBr_studenta(int br_studenta) {
        this.br_studenta = br_studenta;
    }

    public static Predmet unesiPredmet(Scanner scanner, Profesor[] profesori)
    {
        System.out.print("Unesite sifru predmeta:");
        String sifra=scanner.nextLine();
        System.out.print("Unesite naziv predmeta:");
        String naziv=scanner.nextLine();
        System.out.print("Unesite broj ECTS bodova za predmet '"+naziv+"':");
        int brojEctsBodova=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Odaberi profesora:");
        for(int i=0;i<2;i++)
        {
            System.out.println((i+1)+"."+profesori[i].getIme()+" "+profesori[i].getPrezime());
        }

        System.out.print("Odabir >> ");
        int odabir=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unesite broj studenta na predmetu '"+naziv+"':");
        int br_studenta=scanner.nextInt();
        scanner.nextLine();

            return new Predmet(sifra,naziv,brojEctsBodova,profesori[odabir-1],br_studenta);









    }
}
