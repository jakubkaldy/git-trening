package com.company;
import java.util.Scanner;
public class Main
{
    static void scitaj(float c1, float c2)
    {
        float vysledok = c1 + c2;
        System.out.println(vysledok);
    }

    static void odcitaj(float c1, float c2)
    {
        float vysledok = c1 - c2;
        System.out.println(vysledok);
    }

    static void nasobenie(float c1, float c2)
    {
        float vysledok = c1 * c2;
        System.out.println(vysledok);
    }

    static void delenie(float c1, float c2)
    {
        float vysledok = c1 / c2;
        System.out.println(vysledok);
    }

    public static void main(String[] args)
    {





        boolean c4 = true;
        while (c4)
        {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chces scitanie, odcitanie, nasobenie, delenie (s/o/n/d): ");
            String text = scanner.nextLine();
            System.out.println("Zadaj prve cislo: ");
            float c1 = scanner.nextInt();
            System.out.println("Zadaj druhe cislo: ");
            float c2 = scanner.nextInt();

            if (text.equals("s")) {
                scitaj(c1,c2);
            }
            if (text.equals("o")) {
                odcitaj(c1,c2);
            }
            if (text.equals("n")) {
                nasobenie(c1,c2);
            }
            if (text.equals("d")) {
                delenie(c1,c2);
            }
            scanner.nextLine();
            System.out.println("Chces dalsi priklad (a/n): ");
            String c3 = scanner.nextLine();

            if (c3.equals("n"))
            {
                c4 = false;
                System.out.println("cau");
            }
            else
            {
                continue;
            }
        }


    }



}





