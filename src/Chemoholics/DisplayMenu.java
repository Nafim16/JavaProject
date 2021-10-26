package Chemoholics;

import java.util.Scanner;
//import java.util.Random;
public class DisplayMenu {

    Scanner d = new Scanner(System.in);
    PeriodicTable pt = new PeriodicTable();
    ScientistsInfo sc = new ScientistsInfo();
    Quiz q = new Quiz();
    RockPaperScissor e = new RockPaperScissor();
    //Login l = new Login();
    //Main main = new Main();

    void display()
    {
        System.out.println("_______________________________________________________________________________________");
        System.out.println("1. Periodic Table\n" +
                "2. Something Interesting About Chemistry\n" +
                "3. Quiz\n" +
                "4. Entertainment\n" +
                "5. Logout");

        System.out.print("Enter Your Choice --> ");

        int Choice;
        Choice = d.nextInt();

        if(Choice==1)
        {
            System.out.println("_______________________________________________________________________________________");
            pt.PT();
            display();
            System.out.println("_______________________________________________________________________________________");
        }
        else if(Choice==2)
        {
            System.out.println("_______________________________________________________________________________________");
            sc.scientist();
            display();
            System.out.println("_______________________________________________________________________________________");
        }
        else if(Choice==3)
        {
            System.out.println("_______________________________________________________________________________________");
            q.quiz();
            display();
            System.out.println("_______________________________________________________________________________________");
        }
        else if(Choice==4)
        {
            System.out.println("_______________________________________________________________________________________");
            e.RPS();
            //e.GRandom();
            display();
            System.out.println("_______________________________________________________________________________________");
        }
        else if(Choice==5)
        {
            System.out.println("_______________________________________________________________________________________");
            System.out.println("_______________________________________________________________________________________");

            //l.login();
            System.out.println("Logging Out");
            System.out.println("_______________________________________________________________________________________");

        }

    }

}
