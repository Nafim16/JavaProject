package Chemoholics;

import java.util.Scanner;

public class PeriodicTable {

    Scanner in = new Scanner(System.in);
    //DisplayMenu display = new DisplayMenu();

    void PT()
    {
        while(true) {
            String element;
            System.out.print("Enter element: ");
            element = in.nextLine();
            //System.out.println("Type 'Exit' to Return to main menu");

            if (element.equals("H")) {
                System.out.println("Full name              > : Hydrogen");
                System.out.println("Atomic Number          > : 1");
                System.out.println("Mass Number            > : 1.00794");
                System.out.println("Electron Configuration > : 1s1 ");
                System.out.println("Period Number          > : 1");
                System.out.println("Group Number           > : 1");
                System.out.println("Oxidation Number       > : -1,1");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("He")) {
                System.out.println("Full name              > : Helium");
                System.out.println("Atomic Number          > : 2");
                System.out.println("Mass Number            > : 4.002602");
                System.out.println("Electron Configuration > : 1s2");
                System.out.println("Period Number          > : 1");
                System.out.println("Group Number           > : 18");
                System.out.println("Oxidation Number       > : 0");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Li")) {
                System.out.println("Full name              > : Lithium");
                System.out.println("Atomic Number          > : 3");
                System.out.println("Mass Number            > : 6.941");
                System.out.println("Electron Configuration > : 1s2 2s1");
                System.out.println("Period Number          > : 2");
                System.out.println("Group Number           > : 1");
                System.out.println("Oxidation Number       > : 1");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Be")) {
                System.out.println("Full name              > : Beryllium");
                System.out.println("Atomic Number          > : 4");
                System.out.println("Mass Number            > : 9.012182");
                System.out.println("Electron Configuration > : 1s2 2s2");
                System.out.println("Period Number          > : 2");
                System.out.println("Group Number           > : 2");
                System.out.println("Oxidation Number       > : 2");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("B")) {
                System.out.println("Full name              > : Borun");
                System.out.println("Atomic Number          > : 5");
                System.out.println("Mass Number            > : 10.811");
                System.out.println("Electron Configuration > : 1s2 2s2 2p1");
                System.out.println("Period Number          > : 2");
                System.out.println("Group Number           > : 13");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("C")) {
                System.out.println("Full name              > : Carbon");
                System.out.println("Atomic Number          > : 6");
                System.out.println("Mass Number            > : 12.011");
                System.out.println("Electron Configuration > : 1s2 2s2 2p2");
                System.out.println("Period Number          > : 2");
                System.out.println("Group Number           > : 14");
                System.out.println("Oxidation Number       > : -4,2,4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("N")) {
                System.out.println("Full name              > : Nitrogen");
                System.out.println("Atomic Number          > : 7");
                System.out.println("Mass Number            > : 14.00674");
                System.out.println("Electron Configuration > : 1s2 2s2 2p3");
                System.out.println("Period Number          > : 2");
                System.out.println("Group Number           > : 15");
                System.out.println("Oxidation Number       > : -3,1,2,3,4,5");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("O")) {
                System.out.println("Full name              > : Oxygen");
                System.out.println("Atomic Number          > : 8");
                System.out.println("Mass Number            > : 15.9994");
                System.out.println("Electron Configuration > : 1s2 2s2 2p4");
                System.out.println("Period Number          > : 2");
                System.out.println("Group Number           > : 16");
                System.out.println("Oxidation Number       > : -2,-1,2");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("F")) {
                System.out.println("Full name              > : Fluorine");
                System.out.println("Atomic Number          > : 9");
                System.out.println("Mass Number            > : 18.9984032");
                System.out.println("Electron Configuration > : 1s2 2s2 2p5");
                System.out.println("Period Number          > : 2");
                System.out.println("Group Number           > : 17");
                System.out.println("Oxidation Number       > : -1");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ne")) {
                System.out.println("Full name              > : Neon");
                System.out.println("Atomic Number          > : 10");
                System.out.println("Mass Number            > : 20.1797");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6");
                System.out.println("Period Number          > : 2");
                System.out.println("Group Number           > : 18");
                System.out.println("Oxidation Number       > : 0");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("NA")) {
                System.out.println("Full name              > : Soduim");
                System.out.println("Atomic Number          > : 11");
                System.out.println("Mass Number            > : 22.98768");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s1");
                System.out.println("Period Number          > : 3");
                System.out.println("Group Number           > : 1");
                System.out.println("Oxidation Number       > : 1");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Mg")) {
                System.out.println("Full name              > : Magnesium");
                System.out.println("Atomic Number          > : 12");
                System.out.println("Mass Number            > : 24.3050");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2");
                System.out.println("Period Number          > : 3");
                System.out.println("Group Number           > : 2");
                System.out.println("Oxidation Number       > : 2");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Al")) {
                System.out.println("Full name              > : Aluminum");
                System.out.println("Atomic Number          > : 13");
                System.out.println("Mass Number            > : 26.981539");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p1");
                System.out.println("Period Number          > : 3");
                System.out.println("Group Number           > : 13");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Si")) {
                System.out.println("Full name              > : Silicon");
                System.out.println("Atomic Number          > : 14");
                System.out.println("Mass Number            > : 28.0855");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p2");
                System.out.println("Period Number          > : 3");
                System.out.println("Group Number           > : 14");
                System.out.println("Oxidation Number       > : -4,4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("P")) {
                System.out.println("Full name              > : Phosphorus");
                System.out.println("Atomic Number          > : 15");
                System.out.println("Mass Number            > : 30.973762");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p3");
                System.out.println("Period Number          > : 3");
                System.out.println("Group Number           > : 15");
                System.out.println("Oxidation Number       > : -3, 3, 5");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("S")) {
                System.out.println("Full name              > : Sulfer");
                System.out.println("Atomic Number          > : 16");
                System.out.println("Mass Number            > : 32.066");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p4");
                System.out.println("Period Number          > : 3");
                System.out.println("Group Number           > : 16");
                System.out.println("Oxidation Number       > : -2,2,4,6");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Cl")) {
                System.out.println("Full name              > : Chlorine");
                System.out.println("Atomic Number          > : 17");
                System.out.println("Mass Number            > : 35.4527");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p5");
                System.out.println("Period Number          > : 3");
                System.out.println("Group Number           > : 17");
                System.out.println("Oxidation Number       > : -1,1,3,4,5,6,7");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ar")) {
                System.out.println("Full name              > : Argon");
                System.out.println("Atomic Number          > : 18");
                System.out.println("Mass Number            > : 39.948");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6");
                System.out.println("Period Number          > : 3");
                System.out.println("Group Number           > : 18");
                System.out.println("Oxidation Number       > : 0");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("K")) {
                System.out.println("Full name              > : Kalium");
                System.out.println("Atomic Number          > : 19");
                System.out.println("Mass Number            > : 39.0983");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 4s1");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 1");
                System.out.println("Oxidation Number       > : 1");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ca")) {
                System.out.println("Full name              > : Calcium");
                System.out.println("Atomic Number          > : 20");
                System.out.println("Mass Number            > : 40.078");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 4s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 2");
                System.out.println("Oxidation Number       > : 2");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Sc")) {
                System.out.println("Full name              > : Scandium");
                System.out.println("Atomic Number          > : 21");
                System.out.println("Mass Number            > : 44.955910");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d1 4s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 3");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ti")) {
                System.out.println("Full name              > : titanium");
                System.out.println("Atomic Number          > : 22");
                System.out.println("Mass Number            > : 47.88");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d2 4s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 4");
                System.out.println("Oxidation Number       > : 2,3,4");
                System.out.println("Type 'Exit' to Return to main menu");


            } else if (element.equals("V")) {
                System.out.println("Full name              > : Vanadium");
                System.out.println("Atomic Number          > : 23");
                System.out.println("Mass Number            > : 50.9415");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d3 4s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 5");
                System.out.println("Oxidation Number       > : 2,3,4,5");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Cr")) {
                System.out.println("Full name              > : Chromium");
                System.out.println("Atomic Number          > : 24");
                System.out.println("Mass Number            > : 51.9961");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d5 4s1");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 6");
                System.out.println("Oxidation Number       > : 2,3,4,5,6");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Mn")) {
                System.out.println("Full name              > : Manganese");
                System.out.println("Atomic Number          > : 25");
                System.out.println("Mass Number            > : 54.93805");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d5 4s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 7");
                System.out.println("Oxidation Number       > : 2,3,4,6,7");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Fe")) {
                System.out.println("Full name              > : Iron");
                System.out.println("Atomic Number          > : 26");
                System.out.println("Mass Number            > : 55.847");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d6 4s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 8");
                System.out.println("Oxidation Number       > : 2,3,6");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Co")) {
                System.out.println("Full name              > : Cobalt");
                System.out.println("Atomic Number          > : 27");
                System.out.println("Mass Number            > : 58.93320");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d7 4s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 9");
                System.out.println("Oxidation Number       > : 2,3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ni")) {
                System.out.println("Full name              > : Nikel");
                System.out.println("Atomic Number          > : 28");
                System.out.println("Mass Number            > : 58.69");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d8 4s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 10");
                System.out.println("Oxidation Number       > : 2,3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Cu")) {
                System.out.println("Full name              > : Copper");
                System.out.println("Atomic Number          > : 29");
                System.out.println("Mass Number            > : 63.546");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s1");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 11");
                System.out.println("Oxidation Number       > : 1,2,3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Zn")) {
                System.out.println("Full name              > : Zinc");
                System.out.println("Atomic Number          > : 30");
                System.out.println("Mass Number            > : 65.39");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : 12");
                System.out.println("Oxidation Number       > : 2");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ga")) {
                System.out.println("Full Name               > :  Gallium   ");
                System.out.println("Atomic Number           > :   31       ");
                System.out.println("Mass Number             > : 69.723     ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p1   ");
                System.out.println("Period Number           > :    4       ");
                System.out.println("Group Number            > :  13        ");
                System.out.println("oxidation Number        > :  +3        ");
                System.out.println("Type 'Exit' to Return to main menu");
            } else if (element.equals("Ge")) {
                System.out.println("Full Name               > :  Germanium   ");
                System.out.println("Atomic Number           > :   32         ");
                System.out.println("Mass Number             > : 72.64        ");
                System.out.println("Electron Configuration  > :   1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p2  ");
                System.out.println("Period Number           > :    4         ");
                System.out.println("Group Number            > :  14          ");
                System.out.println("oxidation Number        > :  +2, +4      ");
                System.out.println("Type 'Exit' to Return to main menu");
            } else if (element.equals("As")) {
                System.out.println("Full Name               > :   Arsenic    ");
                System.out.println("Atomic Number           > :   33         ");
                System.out.println("Mass Number             > :   74.9216    ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p3    ");
                System.out.println("Period Number           > :   4          ");
                System.out.println("Group Number            > :  15          ");
                System.out.println("oxidation Number        > :  -3, +3, +5  ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Se")) {
                System.out.println("Full Name               > :  Selenium");
                System.out.println("Atomic Number           > :   34");
                System.out.println("Mass Number             > :   78.96");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p4");
                System.out.println("Period Number           > :   4 ");
                System.out.println("Group Number            > :  16 ");
                System.out.println("oxidation Number        > :   −2, +4, +6");
                System.out.println("Type 'Exit' to Return to main menu");
            } else if (element.equals("Br")) {
                System.out.println("Full Name               > :  Bromine");
                System.out.println("Atomic Number           > :  35");
                System.out.println("Mass Number             > : 79.904    ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p5");
                System.out.println("Period Number           > :   4  ");
                System.out.println("Group Number            > :  17   ");
                System.out.println("oxidation Number        > :   −1, +1, +3, +5, +7  ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Kr")) {
                System.out.println("Full Name               > : Krypton    ");
                System.out.println("Atomic Number           > :  36   ");
                System.out.println("Mass Number             > :   83.798  ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6   ");
                System.out.println("Period Number           > :  4   ");
                System.out.println("Group Number            > :  18   ");
                System.out.println("oxidation Number        > :   0, +2  ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Rb")) {
                System.out.println("Full Name               > :  Rubidium   ");
                System.out.println("Atomic Number           > :   37  ");
                System.out.println("Mass Number             > :   87.62  ");
                System.out.println("Electron Configuration  > :   1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 5s1  ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :   1  ");
                System.out.println("oxidation Number        > :  −1, +1    ");
                System.out.println("Type 'Exit' to Return to main menu");
            } else if (element.equals("Sr")) {
                System.out.println("Full Name               > :  Strontium   ");
                System.out.println("Atomic Number           > :   38  ");
                System.out.println("Mass Number             > :   87.62  ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 5s2   ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :   2   ");
                System.out.println("oxidation Number        > :  +2   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Y")) {
                System.out.println("Full Name               > :  Yttrium   ");
                System.out.println("Atomic Number           > : 39    ");
                System.out.println("Mass Number             > : 88.90585     ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d1 5s2    ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  3   ");
                System.out.println("oxidation Number        > : +3   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Zr")) {
                System.out.println("Full Name               > : Zirconium    ");
                System.out.println("Atomic Number           > :  40   ");
                System.out.println("Mass Number             > :  91.224   ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d2 5s2   ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  4   ");
                System.out.println("oxidation Number        > : +4    ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Nb")) {
                System.out.println("Full Name               > :  Niobium   ");
                System.out.println("Atomic Number           > :  41   ");
                System.out.println("Mass Number             > : 92.90638    ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s1 4d4   ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  5   ");
                System.out.println("oxidation Number        > : +2, +3, +4, +5    ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Mo")) {
                System.out.println("Full Name               > : Molybdenum    ");
                System.out.println("Atomic Number           > :  42   ");
                System.out.println("Mass Number             > : 95.95    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d5 5s1    ");
                System.out.println("Period Number           > : 5    ");
                System.out.println("Group Number            > : 6    ");
                System.out.println("oxidation Number        > : 0, +2, +3, +4, +5, +6    ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Tc")) {
                System.out.println("Full Name               > :  Technetium   ");
                System.out.println("Atomic Number           > :   43  ");
                System.out.println("Mass Number             > :  98   ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d5 5s2   ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  7   ");
                System.out.println("oxidation Number        > :−3, −1, 0, +1, +2, +3, +4, +5, +6, +7 ");
                System.out.println("Type 'Exit' to Return to main menu");
            } else if (element.equals("Ru")) {
                System.out.println("Full Name               > : Ruthenium    ");
                System.out.println("Atomic Number           > :  44   ");
                System.out.println("Mass Number             > :  101.07   ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d7 5s1   ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  8   ");
                System.out.println("oxidation Number        > :  +8   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Rh")) {
                System.out.println("Full Name               > :  Rhodium   ");
                System.out.println("Atomic Number           > :   45  ");
                System.out.println("Mass Number             > :  102.9055   ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d8 5s1   ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  9   ");
                System.out.println("oxidation Number        > :  +2, +3, +4, +5  ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Pd")) {
                System.out.println("Full Name               > : Palladium    ");
                System.out.println("Atomic Number           > :  46   ");
                System.out.println("Mass Number             > : 106.42    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s0    ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  10   ");
                System.out.println("oxidation Number        > : +2, +4    ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ag")) {
                System.out.println("Full Name               > : Silver    ");
                System.out.println("Atomic Number           > :   47  ");
                System.out.println("Mass Number             > :107.8682     ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s1   ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > : 11    ");
                System.out.println("oxidation Number        > : +1, +2, +3    ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Cd")) {
                System.out.println("Full Name               > : Cadmium    ");
                System.out.println("Atomic Number           > :    48 ");
                System.out.println("Mass Number             > : 112.411    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2    ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  12   ");
                System.out.println("oxidation Number        > :  +2   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("In")) {
                System.out.println("Full Name               > : Indium    ");
                System.out.println("Atomic Number           > :   49  ");
                System.out.println("Mass Number             > : 114.82    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p1    ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  13   ");
                System.out.println("oxidation Number        > : +1, +3    ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Sn")) {
                System.out.println("Full Name               > : Tin    ");
                System.out.println("Atomic Number           > :   50  ");
                System.out.println("Mass Number             > : 118.710    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p2    ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  14   ");
                System.out.println("oxidation Number        > :  +2, +4   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Sb")) {
                System.out.println("Full Name               > : Antimony    ");
                System.out.println("Atomic Number           > :   51  ");
                System.out.println("Mass Number             > : 121.75    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p3    ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  15   ");
                System.out.println("oxidation Number        > : -3, +3, +5    ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Te")) {
                System.out.println("Full Name               > :  Tellurium   ");
                System.out.println("Atomic Number           > :  52   ");
                System.out.println("Mass Number             > : 127.60   ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p4   ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  16   ");
                System.out.println("oxidation Number        > :  -2, +2, +4, +6   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("I")) {
                System.out.println("Full Name               > :  Iodine   ");
                System.out.println("Atomic Number           > :    53 ");
                System.out.println("Mass Number             > : 126.90447    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p5   ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  17   ");
                System.out.println("oxidation Number        > : -1, +1, +3, +5, +7   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Xe")) {
                System.out.println("Full Name               > : Xenon    ");
                System.out.println("Atomic Number           > :   54  ");
                System.out.println("Mass Number             > : 131.29    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6    ");
                System.out.println("Period Number           > :  5   ");
                System.out.println("Group Number            > :  18   ");
                System.out.println("oxidation Number        > :  +2, +4, +6, +8   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Cs")) {
                System.out.println("Full Name               > :  Cesium   ");
                System.out.println("Atomic Number           > :   55  ");
                System.out.println("Mass Number             > : 132.90543    ");
                System.out.println("Electron Configuration  > :1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 6s1     ");
                System.out.println("Period Number           > :  6   ");
                System.out.println("Group Number            > :  1   ");
                System.out.println("oxidation Number        > :  +1   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ba")) {
                System.out.println("Full Name               > : Barium    ");
                System.out.println("Atomic Number           > :   56  ");
                System.out.println("Mass Number             > : 137.327    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 6s2    ");
                System.out.println("Period Number           > :  6   ");
                System.out.println("Group Number            > :  2   ");
                System.out.println("oxidation Number        > :  +2   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("La")) {
                System.out.println("Full Name               > :  Lanthanum   ");
                System.out.println("Atomic Number           > :   57  ");
                System.out.println("Mass Number             > :	138.9055     ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 5d1 6s2   ");
                System.out.println("Period Number           > :  6   ");
                System.out.println("Group Number            > :   3  ");
                System.out.println("oxidation Number        > :  +3   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ce")) {
                System.out.println("Full Name               > :  Cerium   ");
                System.out.println("Atomic Number           > :   58  ");
                System.out.println("Mass Number             > : 140.115    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f1 5d1 6s2    ");
                System.out.println("Period Number           > :  6   ");
                System.out.println("Group Number            > :   4  ");
                System.out.println("oxidation Number        > : +3, +4    ");
                System.out.println("Type 'Exit' to Return to main menu");
            } else if (element.equals("Pr")) {
                System.out.println("Full Name               > : Praseodymium  ");
                System.out.println("Atomic Number           > :  59   ");
                System.out.println("Mass Number             > : 140.90765    ");
                System.out.println("Electron Configuration  > :  1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f3 5d0 6s2   ");
                System.out.println("Period Number           > :  6   ");
                System.out.println("Group Number            > :  5   ");
                System.out.println("oxidation Number        > :  +3, +4   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Nd")) {
                System.out.println("Full Name               > :  Neodymium   ");
                System.out.println("Atomic Number           > :  60   ");
                System.out.println("Mass Number             > : 144.24    ");
                System.out.println("Electron Configuration  > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f4 5d0 6s2    ");
                System.out.println("Period Number           > :  6   ");
                System.out.println("Group Number            > :  6   ");
                System.out.println("oxidation Number        > :  +3   ");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Pe")) {
                System.out.println("Full name              > : Promethium");
                System.out.println("Atomic Number          > : 61");
                System.out.println("Mass Number            > : 144.9127");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f5 5s2 5p6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 7");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Sm")) {
                System.out.println("Full name              > : Samarium");
                System.out.println("Atomic Number          > : 62");
                System.out.println("Mass Number            > : 150.36");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f6 5s2 5p6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 8");
                System.out.println("Oxidation Number       > : 2, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Eu")) {
                System.out.println("Full name              > : Europium");
                System.out.println("Atomic Number          > : 63");
                System.out.println("Mass Number            > : 151.964");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f7 5s2 5p6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 9");
                System.out.println("Oxidation Number       > : 2, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Gd")) {
                System.out.println("Full name              > : Gadolinium");
                System.out.println("Atomic Number          > : 64");
                System.out.println("Mass Number            > : 157.25");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f7 5s2 5p6 5d1 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 10");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Tb")) {
                System.out.println("Full name              > : Terbium");
                System.out.println("Atomic Number          > : 65");
                System.out.println("Mass Number            > : 158.92534");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f9 5s2 5p6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 11");
                System.out.println("Oxidation Number       > : 3, 4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Dy")) {
                System.out.println("Full name              > : Dysprosium");
                System.out.println("Atomic Number          > : 66");
                System.out.println("Mass Number            > : 162.500");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f10 5s2 5p6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 12");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ho")) {
                System.out.println("Full name              > : Holmium");
                System.out.println("Atomic Number          > : 67");
                System.out.println("Mass Number            > : 164.93032");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f11 5s2 5p6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 13");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Er")) {
                System.out.println("Full name              > : Erbium");
                System.out.println("Atomic Number          > : 68");
                System.out.println("Mass Number            > : 167.259");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f12 5s2 5p6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 14");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Tm")) {
                System.out.println("Full name              > : Thulium");
                System.out.println("Atomic Number          > : 69");
                System.out.println("Mass Number            > : 168.93421");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f13 5s2 5p6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 15");
                System.out.println("Oxidation Number       > : 2, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Yb")) {
                System.out.println("Full name              > : Ytterbium");
                System.out.println("Atomic Number          > : 70");
                System.out.println("Mass Number            > : 173.04");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 16");
                System.out.println("Oxidation Number       > : 2, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Lu")) {
                System.out.println("Full name              > : Lutetium");
                System.out.println("Atomic Number          > : 71");
                System.out.println("Mass Number            > : 174.967");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d1 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 17");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Hf")) {
                System.out.println("Full name              > : Hafnium");
                System.out.println("Atomic Number          > : 72");
                System.out.println("Mass Number            > : 178.49");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d2 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 4");
                System.out.println("Oxidation Number       > : 4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ta")) {
                System.out.println("Full name              > : Tantalum");
                System.out.println("Atomic Number          > : 73");
                System.out.println("Mass Number            > : 180.9479");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d3 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 5");
                System.out.println("Oxidation Number       > : 5");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("W")) {
                System.out.println("Full name              > : Tungsten");
                System.out.println("Atomic Number          > : 74");
                System.out.println("Mass Number            > : 183.84");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d4 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 6");
                System.out.println("Oxidation Number       > : 2, 3, 4, 5, 6");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Re")) {
                System.out.println("Full name              > : Rhenium");
                System.out.println("Atomic Number          > : 75");
                System.out.println("Mass Number            > : 186.207");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d5 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 7");
                System.out.println("Oxidation Number       > : 2, 4, 7");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Os")) {
                System.out.println("Full name              > : Osmium");
                System.out.println("Atomic Number          > : 76");
                System.out.println("Mass Number            > : 190.23");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d6 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 8");
                System.out.println("Oxidation Number       > : 2, 3, 4, 6, 8");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ir")) {
                System.out.println("Full name              > : Iridium");
                System.out.println("Atomic Number          > : 77");
                System.out.println("Mass Number            > : 192.217");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d7 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 9");
                System.out.println("Oxidation Number       > : 1, 2, 3, 4, 6");
                System.out.println("Type 'Exit' to Return to main menu");
            } else if (element.equals("Pt")) {
                System.out.println("Full name              > : Platinum");
                System.out.println("Atomic Number          > : 78");
                System.out.println("Mass Number            > : 195.078");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d9 6s1");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 10");
                System.out.println("Oxidation Number       > : 2, 4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Au")) {
                System.out.println("Full name              > : Gold");
                System.out.println("Atomic Number          > : 79");
                System.out.println("Mass Number            > : 196.96655");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s1");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 11");
                System.out.println("Oxidation Number       > : 1, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Hg")) {
                System.out.println("Full name              > : Mercury");
                System.out.println("Atomic Number          > : 80");
                System.out.println("Mass Number            > : 200.59");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 12");
                System.out.println("Oxidation Number       > : 1, 2");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Tl")) {
                System.out.println("Full name              > : Thallium");
                System.out.println("Atomic Number          > : 81");
                System.out.println("Mass Number            > : 204.3833");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2 6p1");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 13");
                System.out.println("Oxidation Number       > : 1, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Pb")) {
                System.out.println("Full name              > : Lead");
                System.out.println("Atomic Number          > : 82");
                System.out.println("Mass Number            > : 207.2");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2 6p2");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 14");
                System.out.println("Oxidation Number       > : 2, 4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Bi")) {
                System.out.println("Full name              > : Bismuth");
                System.out.println("Atomic Number          > : 83");
                System.out.println("Mass Number            > : 208.98038");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2 6p3");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 15");
                System.out.println("Oxidation Number       > : 3, 5");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Po")) {
                System.out.println("Full name              > : Polonium");
                System.out.println("Atomic Number          > : 84");
                System.out.println("Mass Number            > : 208.9824");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2 6p4");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 16");
                System.out.println("Oxidation Number       > : 2, 4, 6");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("At")) {
                System.out.println("Full name              > : Astatine");
                System.out.println("Atomic Number          > : 85");
                System.out.println("Mass Number            > : 209.9871");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2 6p5");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 17");
                System.out.println("Oxidation Number       > : -1, 1, 3, 5, 7");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Rn")) {
                System.out.println("Full name              > : Radon");
                System.out.println("Atomic Number          > : 86");
                System.out.println("Mass Number            > : 222.0176");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2 6p6");
                System.out.println("Period Number          > : 6");
                System.out.println("Group Number           > : 18");
                System.out.println("Oxidation Number       > : 2");
                System.out.println("Type 'Exit' to Return to main menu");
            } else if (element.equals("Fr")) {
                System.out.println("Full name              > : Francium");
                System.out.println("Atomic Number          > : 87");
                System.out.println("Mass Number            > : 223.0197");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2 6p6 7s1");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : 1");
                System.out.println("Oxidation Number       > : 1");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ra")) {
                System.out.println("Full name              > : Radium");
                System.out.println("Atomic Number          > : 88");
                System.out.println("Mass Number            > : 226.0254");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2 6p6 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : 2");
                System.out.println("Oxidation Number       > : 2");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ac")) {
                System.out.println("Full name              > : Actinium");
                System.out.println("Atomic Number          > : 89");
                System.out.println("Mass Number            > : 227.0277");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 6s2 6p6 6d1 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : 3");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Th")) {
                System.out.println("Full name              > : Thorium");
                System.out.println("Atomic Number          > : 90");
                System.out.println("Mass Number            > : 232.03806");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f0 6d2 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : IV.B");
                System.out.println("Oxidation Number       > : 4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Pa")) {
                System.out.println("Full name              > : Protaktinium");
                System.out.println("Atomic Number          > : 91");
                System.out.println("Mass Number            > : 231.0359");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f2 6d1 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : V.B");
                System.out.println("Oxidation Number       > : 4, 5");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("U")) {
                System.out.println("Full name              > : Uranium");
                System.out.println("Atomic Number          > : 92");
                System.out.println("Mass Number            > : 238.0289");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f3 6d1 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : VI.B");
                System.out.println("Oxidation Number       > : 3, 1, 5, 6");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Np")) {
                System.out.println("Full name              > : Neptunium");
                System.out.println("Atomic Number          > : 93");
                System.out.println("Mass Number            > : 237.0482");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f4 6d1 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 3, 4, 5, 6, 7");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Pu")) {
                System.out.println("Full name              > : Plutonium");
                System.out.println("Atomic Number          > : 94");
                System.out.println("Mass Number            > : 244.0642");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f6 6d0 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 3, 4, 5, 6");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Am")) {
                System.out.println("Full name              > : Americium");
                System.out.println("Atomic Number          > : 95");
                System.out.println("Mass Number            > : 243.0614");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f7 6d0 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 3, 4, 5, 6");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Cm")) {
                System.out.println("Full name              > : Cuprum");
                System.out.println("Atomic Number          > : 96");
                System.out.println("Mass Number            > : 63.546");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 4f14 5s2 5p6 5d10 5f7 6s2 6p6 6d1 7s2");
                System.out.println("Period Number          > : 4");
                System.out.println("Group Number           > : I.B");
                System.out.println("Oxidation Number       > : 1, 2, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Bk")) {
                System.out.println("Full name              > : Berkelium");
                System.out.println("Atomic Number          > : 97");
                System.out.println("Mass Number            > : 247.0703");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f9 6d0 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 3, 4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Cf")) {
                System.out.println("Full name              > : Californium");
                System.out.println("Atomic Number          > : 98");
                System.out.println("Mass Number            > : 251.0796");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f10 6d0 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 2, 3, 4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Es")) {
                System.out.println("Full name              > : Einsteinium");
                System.out.println("Atomic Number          > : 99");
                System.out.println("Mass Number            > : 252.0829");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f11 6d0 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 2, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Fm")) {
                System.out.println("Full name              > : Fermium");
                System.out.println("Atomic Number          > : 100");
                System.out.println("Mass Number            > : 257.0951");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f12 6d0 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 2, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Md")) {
                System.out.println("Full name              > : Mendelevium");
                System.out.println("Atomic Number          > : 101");
                System.out.println("Mass Number            > : 258.0986");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f13 6d0 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 2, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("No")) {
                System.out.println("Full name              > : Nobelium");
                System.out.println("Atomic Number          > : 102");
                System.out.println("Mass Number            > : 259.1009");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d0 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 2, 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Lr")) {
                System.out.println("Full name              > : Lawrencium");
                System.out.println("Atomic Number          > : 103");
                System.out.println("Mass Number            > : 260.1053");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d1 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Rf")) {
                System.out.println("Full name              > : Rutherfordium");
                System.out.println("Atomic Number          > : 104");
                System.out.println("Mass Number            > : 261.1087");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d2 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.B");
                System.out.println("Oxidation Number       > : 4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Db")) {
                System.out.println("Full name              > : Dubnium");
                System.out.println("Atomic Number          > : 105");
                System.out.println("Mass Number            > : 262.1138");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d3 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : V.B");
                System.out.println("Oxidation Number       > : 5");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Sg")) {
                System.out.println("Full name              > : Seaborgium");
                System.out.println("Atomic Number          > : 106");
                System.out.println("Mass Number            > : 263.9182");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d4 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : VI.B");
                System.out.println("Oxidation Number       > : 6");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Bh")) {
                System.out.println("Full name              > : Bohrium");
                System.out.println("Atomic Number          > : 107");
                System.out.println("Mass Number            > : 262.1229");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d5 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : VII.B");
                System.out.println("Oxidation Number       > : 7");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Hs")) {
                System.out.println("Full name              > : Hassium");
                System.out.println("Atomic Number          > : 108");
                System.out.println("Mass Number            > : 265");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d6 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : VIII.B");
                System.out.println("Oxidation Number       > : N/O");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Mt")) {
                System.out.println("Full name              > : Meitnerium");
                System.out.println("Atomic Number          > : 109");
                System.out.println("Mass Number            > : 266");
                System.out.println("Electron Configuration > : 1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d7 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : VIII.B");
                System.out.println("Oxidation Number       > : N/O");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ds")) {
                System.out.println("Full name              > : Darmstadtium");
                System.out.println("Atomic Number          > : 110");
                System.out.println("Mass Number            > : 281");
                System.out.println("Electron Configuration > : 5f14 6d8 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : VII.B");
                System.out.println("Oxidation Number       > : N/O");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Rg")) {
                System.out.println("Full name              > : Roentgenium");
                System.out.println("Atomic Number          > : 111");
                System.out.println("Mass Number            > : 281");
                System.out.println("Electron Configuration > : 5f14 6d9 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : I.B");
                System.out.println("Oxidation Number       > : 3");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Cn")) {
                System.out.println("Full name              > : Copernicium");
                System.out.println("Atomic Number          > : 112");
                System.out.println("Mass Number            > : 285");
                System.out.println("Electron Configuration > : 5f14 6d10 7s2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : II.B");
                System.out.println("Oxidation Number       > : 4");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Nh")) {
                System.out.println("Full name              > : Nihonium");
                System.out.println("Atomic Number          > : 113");
                System.out.println("Mass Number            > : 286");
                System.out.println("Electron Configuration > : 5f14 6d10 7s2 7p1");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : III.A");
                System.out.println("Oxidation Number       > : 1");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Fl")) {
                System.out.println("Full name              > : Flerovium");
                System.out.println("Atomic Number          > : 114");
                System.out.println("Mass Number            > : 289");
                System.out.println("Electron Configuration > : 5f14 6d10 7s2 7p2");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : IV.A");
                System.out.println("Oxidation Number       > : 2");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Mc")) {
                System.out.println("Full name              > : Moscovium");
                System.out.println("Atomic Number          > : 115");
                System.out.println("Mass Number            > : 289");
                System.out.println("Electron Configuration > : 5f14 6d10 7s2 7p3");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : V.A");
                System.out.println("Oxidation Number       > : 1");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Lv")) {
                System.out.println("Full name              > : Livermorium");
                System.out.println("Atomic Number          > : 116");
                System.out.println("Mass Number            > : 293");
                System.out.println("Electron Configuration > : 5f14 6d10 7s2 7p4");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : VI.A");
                System.out.println("Oxidation Number       > : -2, 2");
                System.out.println("Type 'Exit' to Return to main menu");

            } else if (element.equals("Ts")) {
                System.out.println("Full name              > : Tennessine");
                System.out.println("Atomic Number          > : 117");
                System.out.println("Mass Number            > : 294");
                System.out.println("Electron Configuration > : 5f14 6d10 7s2 7p5");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : VII.A");
                System.out.println("Oxidation Number       > : 1, 3");
                System.out.println("Type 'Exit' to Return to main menu");
            } else if (element.equals("Og")) {
                System.out.println("Full name              > : Oganesson");
                System.out.println("Atomic Number          > : 118");
                System.out.println("Mass Number            > : 294");
                System.out.println("Electron Configuration > : 5f14 6d10 7s2 7p6");
                System.out.println("Period Number          > : 7");
                System.out.println("Group Number           > : VIII.A");
                System.out.println("Oxidation Number       > : 2, 4");
                System.out.println("Type 'Exit' to Return to main menu");
            }
            else if(element.equals("Exit"))
            {
                return;
                //display.display();
            }
            else
            {
                System.out.println("Invalid Input !!!\nPlease enter again");
            }
        }
    }

}
