package Chemoholics;

import java.util.Scanner;

public class ScientistsInfo {

    Scanner sc = new Scanner(System.in);
    void scientist()
    {
        while(true) {
            String scientistName;
            System.out.println("\n\tScintist Name -------------->\n");
            System.out.println("\t1.Marie Curie \t2.Louis Pasteur    \t3.John Dalton \t4.George Washington Carver\n" +
                               "\t5.Alfred Nobel\t6.Rosalind Franklin\t7.Robert Boyle\t8.Mario Molina\n" +
                               "\t9.Otto Hahn   \t10.Thomas Graham\t\n\tType 'Exit' to return to main menu");

            System.out.println("These are some popular scientist Name. Type Their Number to Know their details");
            scientistName = sc.nextLine();
            if (scientistName.equals("1")) {
                System.out.println("Marie Curie (1867-1934)\n" +
                        "Famous For: Discovery of Radium and Polonium\n" +
                        "Marie Curie received the Nobel Prize in Chemistry in 1911 for her discovery of radium and polonium. \n" +
                        "She was able to isolate and study the compounds and nature of radium.");
            } else if (scientistName.equals("2")) {
                System.out.println("Louis Pasteur (1822-1895)\n" +
                        "Famous For: The process of Pasteurization and creation of Vaccines for Rabies and Anthrax\n" +
                        "In addition to developing the process of Pasteurization, Louis Pasteur discovered the assymetrical molecular structure on certain crytals. \n" +
                        "He made some of the earliest vaccines for rabies and anthrax, and the reduction of a bacterial infection in what is known as puerperal fever.");
            } else if (scientistName.equals("3")) {
                System.out.println("John Dalton (1766-1844)\n" +
                        "Famous For: Identification and presenting the atomic theory\n" +
                        "Recognized for his work on the atomic theory and research on color blindness. \n" +
                        "He successfully identified chemical compounds and reactions affected by interaction of atoms with one another.");
            } else if (scientistName.equals("4")) {
                System.out.println("George Washington Carver (1864-1943)\n" +
                        "Famous For: Promoting alternative crops to cotton, such as peanuts, soybeans, sweet potatoes\n" +
                        "George Washington Carver found different crops to use instead of cotton. " +
                        "He used peanuts, soybeans, sweet potatoes to keep the land productive. " +
                        "His intention was to keep the poor farmers healthy and productive.");
            } else if (scientistName.equals("5")) {
                System.out.println("Alfred Nobel (1833-1896)\n" +
                        "Famous For: Inventing the dynamite\n" +
                        "As the inventor of the dynamite, Alfred Nobel is seen as a chemist, innovator, engineer, and arms manufacturer. \n" +
                        "One of his earliest inventions include the gas meter. At one time, he held nearly 350 patents on various items.");
            } else if (scientistName.equals("6")) {
                System.out.println("Rosalind Franklin (1920-1958)\n" +
                        "Famous For: Discovery of the DNA structure in genetics\n" +
                        "Rosalind Elsie Franklin and her contributions to science involve the study of the structures of coal, graphite, " +
                        "DNA, RNA, and viruses in understing their molecular structures.");
            } else if (scientistName.equals("7")) {
                System.out.println("Robert Boyle (1627-1691)\n" +
                        "Famous For: Being the first Modern Chemist" +
                        "Boyle was the one of the earliest men to apply the scientific method in chemistry and physics. " +
                        "His book, The Sceptical Chymyst, is considered a foundational source of literature on the field of chemistry.");
            } else if (scientistName.equals("8")) {
                System.out.println("Mario Molina (1943)\n" +
                        "Famous For: Discovered the ozone hole in the Antarctic\n" +
                        "As one of three recipients of the Nobel Prize in Chemistry in 1995, " +
                        "Molina co-discovered the harm that chlorofluorocarbons had on the ozone layer.");
            } else if (scientistName.equals("9")) {
                System.out.println("Otto Hahn (1879-1968)\n" +
                        "Famous For: Being the Father of Nuclear Chemistry\n" +
                        "Hahn was one of the earliest men to work in the field of radiochemistry and radioactivity. \n" +
                        "During one of his experiments, he founded what is known as Applied Radiochemistry which eventually led to nuclear chemistry.");
            } else if (scientistName.equals("10")) {
                System.out.println("Thomas Graham (1805-1869)\n" +
                        "Famous For: His work on the diffusion of gases and the application of dialysis.\n" +
                        "The discovery of Graham on the use of dialysis has its roots on his study of colloids. " +
                        "He was able to separate crystalloids from colloids using a dialyzer. " +
                        "His work on the diffusion of gases has become to be known as Graham's law.");
            }
            else if(scientistName.equals("Exit")) {
                return;
            }
        }
    }
}

