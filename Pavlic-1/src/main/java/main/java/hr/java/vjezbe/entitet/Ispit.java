package main.java.hr.java.vjezbe.entitet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ispit {
    private Predmet predmet;
    private Student student;
    private int ocjena;
    private LocalDateTime datumIVrijeme;

    public Ispit(Predmet predmet, Student student, int ocjena, LocalDateTime datumIVrijeme) {
        this.predmet = predmet;
        this.student = student;
        this.ocjena = ocjena;
        this.datumIVrijeme = datumIVrijeme;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }

    public LocalDateTime getDatumIVrijeme() {
        return datumIVrijeme;
    }

    public void setDatumIVrijeme(LocalDateTime datumIVrijeme) {
        this.datumIVrijeme = datumIVrijeme;
    }

    public static Ispit unesiIspit(Scanner scanner, Predmet [] predmeti, Student[] studenti)
    {
        System.out.println("Odaberi predmet:");
        for(int i=0;i<3;i++)
        {
            System.out.println((i+1)+"."+predmeti[i].getNaziv());
        }
        System.out.print("Odabir >> ");
        int odabir1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Odaberi studenta:");
        for(int i=0;i<3;i++)
        {
            System.out.println((i+1)+"."+studenti[i].getIme()+" "+studenti[i].getPrezime());
        }
        System.out.print("Odabir >> ");
        int odabir2=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unesite ocjenu na ispitu (1-5):");
        int ocjena=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unesite datum i vrijeme ispita u formatu (dd.MM.yyyy.THH:mm):");
        String datumIVrijemeString=scanner.nextLine();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd.MM.yyyy.'T'HH:mm");
        LocalDateTime datumIVrijeme=LocalDateTime.parse(datumIVrijemeString,dateTimeFormatter);


        return new Ispit(predmeti[odabir1-1],studenti[odabir2-1],ocjena,datumIVrijeme);

    }
}
