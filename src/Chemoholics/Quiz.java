package Chemoholics;

import java.util.Scanner;

public class Quiz {
    Scanner q = new Scanner(System.in);

    void quiz()
    {
        int score=0;
        String Ans1,Ans2,Ans3,Ans4,Ans5,Ans6,Ans7,Ans8,Ans9,Ans10;
        //Ans1=q.nextLine();
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("1.Of the elements listed below, which one is most likely to have the following properties:\n" +
                "Silver-coloured, good conductor of electricity and low-density metal");
        System.out.println("  a.    Fluorine\n" +
                "  b.    Carbon\n" +
                "  c.    Magnesium\n" +
                "  d.    Oxygen");
        System.out.print("Your Choice--> ");
        Ans1=q.nextLine();
        if(Ans1.equals("a"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'a'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("2.Which one of the following groups of elements generally do not react?");
        System.out.println("  a.    The halogens\n" +
                "  b.    The noble gases\n" +
                "  c.    The alkali metals\n" +
                "  d.    The transition metals");
        System.out.print("Your Choice--> ");
        Ans2=q.nextLine();
        if(Ans2.equals("b"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'b'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("3.Which of the following alkali metals is the most reactive?");
        System.out.println("  a.    Rubidium\n" +
                "  b.    Lithium\n" +
                "  c.    Potassium\n" +
                "  d.    Sodium");
        System.out.print("Your Choice--> ");
        Ans3=q.nextLine();
        if(Ans3.equals("a"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'a'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("4.Why are the elements in group 0 unreactive?");
        System.out.println("  a.    They are all gases.\n" +
                "  b.    They each have a stable nucleus.\n" +
                "  c.    They have a full outer shell of electrons.\n" +
                "  d.    They have an even number of electrons in their outer shell.");
        System.out.print("Your Choice--> ");
        Ans4=q.nextLine();
        if(Ans4.equals("c"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'c'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("5.Of the elements listed below, which one is most likely to have the following properties:\n" +
                "Silver-coloured, good conductor of electricity and low-density metal");
        System.out.println("  a.    Carbon\n" +
                "  b.    Fluorine\n" +
                "  c.    Magnesium\n" +
                "  d.    Oxygen");
        System.out.print("Your Choice--> ");
        Ans5=q.nextLine();
        if(Ans5.equals("c"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'c'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("6.A substance made up on only one type of atom is called");
        System.out.println("  a.    an element\n" +
                "  b.    a molecule\n" +
                "  c.    a compound\n" +
                "  d.    a non-metal");
        System.out.print("Your Choice--> ");
        Ans6=q.nextLine();
        if(Ans6.equals("a"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'a'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("7.To which group in the Periodic Table does the unreactive element argon belong?");
        System.out.println("  a.    Group 0\n" +
                "  b.    Group II (2)\n" +
                "  c.    Group VII (7)\n" +
                "  d.    Group I");
        System.out.print("Your Choice--> ");
        Ans7=q.nextLine();
        if(Ans7.equals("a"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'a'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("8.Which of the following are both added to drinking water at the water treatment plant?");
        System.out.println("  a.    Fluorine and chlorine\n" +
                "  b.    Oxygen and magnesium\n" +
                "  c.    Calcium and fluorine\n" +
                "  d.    Chlorine and bromine");
        System.out.print("Your Choice--> ");
        Ans8=q.nextLine();
        if(Ans8.equals("a"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'a'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("9.Which one of the following metals floats on water?quest12a1.jpg");
        System.out.println("  a.    Sodium\n" +
                "  b.    Mercury\n" +
                "  c.    Magnesium\n" +
                "  d.    Copper");
        System.out.print("Your Choice--> ");
        Ans9=q.nextLine();
        if(Ans9.equals("a"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'a'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("10.Why are the elements fluorine, chlorine and iodine placed in the same group of the Periodic Table?");
        System.out.println("  a.    They all readily react with oxygen.\n" +
                "  b.    They have the same density.\n" +
                "  c.    They have the same number of electrons in their outer shell.\n" +
                "  d.    They are all metals.");
        System.out.print("Your Choice--> ");
        Ans10=q.nextLine();
        if(Ans10.equals("c"))
        {
            System.out.println("Good Job! That's correct!");
            score++;
        }
        else
        {
            System.out.println("Opps!! Wrong Answer");
            System.out.println("Correct answer is 'c'");
        }
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("Total Score : "+score);

    }


}

