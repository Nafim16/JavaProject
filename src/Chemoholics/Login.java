package Chemoholics;


import java.util.Scanner;

public class Login {

    Scanner l = new Scanner(System.in);
    DisplayMenu display = new DisplayMenu();


    void login()
    {

        String Name1 = "Joyee", Name2 = "Abir", Name3 = "Arian", Name4 = "Nafim";
        String Pass = "password";

        String UserName,pass;
        System.out.print("Enter User Name : ");
        UserName = l.nextLine();
        if(UserName.equals(Name1))
        {
            System.out.print("Enter Password : ");
            pass=l.nextLine();
            if(pass.equals(Pass))
            {
                System.out.println("Login successful\n");
                display.display();
            }
            else
            {
                System.out.println("Wrong Password!!");
                login();
            }
        }
        else if(UserName.equals(Name2))
        {
            System.out.print("Enter Password : ");
            pass=l.nextLine();
            if(pass.equals(Pass))
            {
                System.out.println("Login successful\n");
                display.display();
            }
            else
            {
                System.out.println("Wrong Password!!");
                login();
            }
        }
        else if(UserName.equals(Name3))
        {
            System.out.print("Enter Password : ");
            pass=l.nextLine();
            if(pass.equals(Pass))
            {
                System.out.println("Login successful\n");
                display.display();
            }
            else
            {
                System.out.println("Wrong Password!!");
                login();
            }
        }
        else if(UserName.equals(Name4))
        {
            System.out.print("Enter Password : ");
            pass=l.nextLine();
            if(pass.equals(Pass))
            {
                System.out.println("Login successful\n");
                display.display();
            }
            else
            {
                System.out.println("Wrong Password!!");
                login();
            }
        }
        else
        {
            System.out.println("Worng user name!!");
            login();
        }

    }

}
