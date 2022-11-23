package pl.dianapro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("KALKULATOR CPM");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj p³eæ (K/M):");
        String userGender = scanner.nextLine();

        System.out.println("Podaj masê cia³a (w kg):");
        int weight = scanner.nextInt();

        System.out.println("Podaj wzrost (w cm):");
        int height = scanner.nextInt();

        System.out.println("Podaj wiek (w latach):");
        int age = scanner.nextInt();

        System.out.println("Podaj liczbê, okreœlaj¹c¹ aktywnoœæ fizyczn¹:");
        System.out.println("1 - niska; 2 - umiarkowana; 3 - wysoka.");
        int pal = scanner.nextByte();

        double bmrAverage = 0;
        double bmrMifflin;
        double bmrHarrisBenedict;
        double bmrRozaShizgal;
        if (userGender.equals("K")) {
            bmrMifflin = (10 * weight) + (6.25 * height) - (5 * age) - 161;
            bmrHarrisBenedict = 655 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
            bmrRozaShizgal = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
            bmrAverage = (bmrMifflin + bmrHarrisBenedict + bmrRozaShizgal) / 3;

        } else if (userGender.equals("M")) {
            bmrMifflin = (10 * weight) + (6.25 * height) - (5 * age) + 5;
            bmrHarrisBenedict = 66.5 + (13.76 * weight) + (5.003 * height) - (6.755 * age);
            bmrRozaShizgal = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
            bmrAverage = (bmrMifflin + bmrHarrisBenedict + bmrRozaShizgal) / 3;
        }
        double cpm = 0;

        if (pal == 1) {
            cpm = 1.5 * bmrAverage;
        } else if (pal == 2) {
            cpm = 1.75 * bmrAverage;
        } else if (pal == 3) {
            cpm = 2 * bmrAverage;
        }
        System.out.println("CPM wynosi: " + cpm);

    }


}

