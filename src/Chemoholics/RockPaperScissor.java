package Chemoholics;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    Scanner x = new Scanner(System.in);

    int GRandom()
    {
        int max=3;
        int min=0;
        Random random= new Random();
        return min + random.nextInt(max-min);
    }
    /*
    int GRandom()
    {
        Random random=new Random();
        return 0+random.nextInt(3);
    }
    */

    void RPS()
    {
        System.out.println("\t\t\tWellcome to the Game \n" +
                "\t\t\tRock, Paper, Scissor\n");
        int r;
        String userName;

        System.out.print("Enter Your Name: ");
        userName=x.nextLine();

        System.out.print("Total Rounds Of Game: ");
        r =x.nextInt();

        int userScore=0;
        int pcScore=0;

        while(r<=0)
        {
            System.out.println("invalid input!!!\nEnter total rounds of game: ");
            r=x.nextInt();
        }
        for(int i=0; i<r; i++)
        {
            System.out.println(userName+" 's Score: "+userScore);
            System.out.println("Computer Score: "+pcScore);


            System.out.println("\n0. Rock\n1. Paper\n2. Scissor\n");
            System.out.print(userName+"'s choice: ");
            int n;
            n= x.nextInt();
            int pcChoice=GRandom();
            System.out.println("Computers Choice: "+pcChoice);
            if(pcChoice==0 && n==1)
            {
                userScore++;
            }
            else if(pcChoice==0 && n==2)
            {
                pcScore++;
            }
            else if(pcChoice==1 && n==0)
            {
                pcScore++;
            }
            else if(pcChoice==1 && n==2)
            {
                userScore++;
            }
            else if(pcChoice==2 && n==0)
            {
                userScore++;
            }
            else if(pcChoice==2 && n==1)
            {
                pcScore++;
            }
            else if(pcChoice==n)
            {
                System.out.println("Computers Choice & "+userName+"'s Choice are same.\nSo no one scored!\n");
            }
            if(n>=3 || n<0)
            {
                System.out.println("Invalid input!!\n");
                r++;
                continue;
            }

        }
        System.out.println("Final score of "+userName+" :"+userScore);
        System.out.println("Final score of Computer: "+pcScore);

        if(userScore > pcScore)
        {
            System.out.println(userName+" wins the game");
        }
        else if(userScore < pcScore)
        {
            System.out.println("Compute wins the game");
        }
        else
        {
            System.out.println("Scores are equal.\nSo it's a tie!!");
        }

    }

}



