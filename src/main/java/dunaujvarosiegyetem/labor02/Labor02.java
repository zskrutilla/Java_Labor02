/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package dunaujvarosiegyetem.labor02;

import java.util.Scanner;

/**
 *
 * @author Zsolti
 */
public class Labor02 {

    static int aA, bB;

    public static void main(String[] args) {
        adatbekero();
        //Ez a két szám összeadására szolgál
        System.out.println(osszeadas(aA, bB));
        System.out.println(kivonas(aA, bB));
//        System.out.println(osztas(9.0, 5));
//        System.out.println(osztasM(9.54654, 5.159));
    }

    public static int osszeadas(int a, int b) {
        /*String teszt = "semmi";
        Töb soros
        Komment
         */
        //int c = a + b;
        return a + b;

    }

    public static int kivonas(int a, int b) {

        return a - b;

    }

    public static int szorzas(int a, int b) {

        return a * b;

    }

    public static int osztas(int a, int b) {

        return a / b;

    }

    public static double osztas(double a, double b) {

        return a / b;

    }

    public static double osztasM(double a, double b) {

        return a % b;

    }

    public static void adatbekero() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kérlek add meg az A számot: ");
        aA = scan.nextInt();
        System.out.print("Kérlek add meg a B számot: ");
        bB = scan.nextInt();
    }
}
