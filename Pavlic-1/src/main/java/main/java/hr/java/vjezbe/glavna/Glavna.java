package main.java.hr.java.vjezbe.glavna;

import main.java.hr.java.vjezbe.entitet.Ispit;
import main.java.hr.java.vjezbe.entitet.Predmet;
import main.java.hr.java.vjezbe.entitet.Profesor;
import main.java.hr.java.vjezbe.entitet.Student;

import java.time.LocalDate;
import java.util.Scanner;

import static main.java.hr.java.vjezbe.entitet.Ispit.unesiIspit;
import static main.java.hr.java.vjezbe.entitet.Predmet.unesiPredmet;
import static main.java.hr.java.vjezbe.entitet.Profesor.unesiProfesora;
import static main.java.hr.java.vjezbe.entitet.Student.unesiStudenta;


public class Glavna {
    private static final int BR_PROFESORA=2;
    private static final int BR_PREDMETA=3;

    private static final int BR_STUDENTA=3;

    private static final int BR_ISPITA=1;

    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);

        Profesor[] profesori;
        profesori=new Profesor[BR_PROFESORA];
        Predmet[] predmeti;
        predmeti=new Predmet[BR_PREDMETA];
        Student[] studenti;
        studenti=new Student[BR_STUDENTA];
        Ispit[] ispiti;
        ispiti=new Ispit[BR_ISPITA];

        for(int i=0;i<BR_PROFESORA;i++)
        {
            System.out.println("Unesi "+ (i+1) +". profesora:");
            profesori[i]=unesiProfesora(scanner);
        }
        for(int i=0;i<BR_PREDMETA;i++)
        {
            System.out.println("Unesi "+ (i+1)+". predmet:");
            predmeti[i]=unesiPredmet(scanner,profesori);
        }

//        for(int i=0;i<BR_PREDMETA;i++)
//        {
//            System.out.println((i+1)+". Sifra: "+predmeti[i].getSifra());
//            System.out.println((i+1)+". Naziv: "+predmeti[i].getNaziv());
//            System.out.println((i+1)+". ECTS: "+predmeti[i].getBrojEctsBodova());
//            System.out.println((i+1)+". Profesor: "+predmeti[i].getNositelj().getIme()+predmeti[i].getNositelj().getPrezime());
//            System.out.println((i+1)+". Broj studenta: "+predmeti[i].getBr_studenta());
//
//        }
        for(int i=0;i<BR_STUDENTA;i++)
        {
            System.out.println("Unesi "+ (i+1)+". studenta:");
            studenti[i]=unesiStudenta(scanner);
        }
        for(int i=0;i<BR_ISPITA;i++)
        {
            System.out.println("Unesi "+ (i+1)+". ispitni rok:");
            ispiti[i]=unesiIspit(scanner,predmeti,studenti);

        }
        for(int i=0;i<BR_ISPITA;i++)
        {
            if(ispiti[i].getOcjena()==5)
            {
                System.out.println("Student "+ispiti[i].getStudent().getIme()+" "+ispiti[i].getStudent().getPrezime()+" je ostvario ocjenu 'izvrstan' na predmetu "+ispiti[i].getPredmet().getNaziv());
            }

        }








    }

}
