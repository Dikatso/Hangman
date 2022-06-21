import java.util.*;
import java.util.Scanner;

public class Hangman
{
    int storePoints = 0;
    int missedWords = 0;
    int diffMode = 0;
    String[] wrongLetters = {};
    String[] easyMode = {"Doll","Toy","Red","Jug","Van","Yak","Zip"};
    String[] mediumMode = {"Honey","Mother","Eight","Family","Jelly","Jump","Boat","Dust"};
    String[] hardMode = {"Drawing","Birthday","Elephant","Animal","Queue","Unable"};


    void printBoard(int numErrors)
    {
        System.out.println("------------");
        System.out.printf("%-11s", "|");
        switch(numErrors)
        {
            case 0:
                System.out.println("|");
                System.out.printf("%-11s", "|");
                System.out.println("");
                System.out.printf("%-10s", "|");
                System.out.println("");
                System.out.printf("%-11s", "|");
                System.out.println("");
                System.out.printf("%-10s", "|");
                System.out.println("");
                System.out.println("|");
                System.out.println("'------------\n");
                break;

            case 1:
                System.out.println("|");
                System.out.printf("%-11s", "|");
                System.out.println("O");
                System.out.printf("%-10s", "|");
                System.out.println("");
                System.out.printf("%-11s", "|");
                System.out.println("");
                System.out.printf("%-10s", "|");
                System.out.println("");
                System.out.println("|");
                System.out.println("'------------\n");
                break;
            
            case 2:
                System.out.println("|");
                System.out.printf("%-11s", "|");
                System.out.println("O");
                System.out.printf("%-11s", "|");
                System.out.println("|");
                System.out.printf("%-11s", "|");
                System.out.println("|");
                System.out.printf("%-10s", "|");
                System.out.println("");
                System.out.println("|");
                System.out.println("'------------\n");
                break;

            case 3:
                System.out.println("|");
                System.out.printf("%-11s", "|");
                System.out.println("O");
                System.out.printf("%-10s", "|");
                System.out.println("/|");
                System.out.printf("%-11s", "|");
                System.out.println("|");
                System.out.printf("%-10s", "|");
                System.out.println("");
                System.out.println("|");
                System.out.println("'------------\n");
                break;

            case 4:
                System.out.println("|");
                System.out.printf("%-11s", "|");
                System.out.println("O");
                System.out.printf("%-10s", "|");
                System.out.println("/|\\");
                System.out.printf("%-11s", "|");
                System.out.println("|");
                System.out.printf("%-10s", "|");
                System.out.println("");
                System.out.println("|");
                System.out.println("'------------\n");
                break;
            
            case 5:
                System.out.println("|");
                System.out.printf("%-11s", "|");
                System.out.println("O");
                System.out.printf("%-10s", "|");
                System.out.println("/|\\");
                System.out.printf("%-11s", "|");
                System.out.println("|");
                System.out.printf("%-10s", "|");
                System.out.println("/");
                System.out.println("|");
                System.out.println("'------------\n");
                break;
            
            case 6:
                System.out.println("|");
                System.out.printf("%-11s", "|");
                System.out.println("O");
                System.out.printf("%-10s", "|");
                System.out.println("/|\\");
                System.out.printf("%-11s", "|");
                System.out.println("|");
                System.out.printf("%-10s", "|");
                System.out.println("/ \\");
                System.out.println("|");
                System.out.println("'------------\n");
                break;


        }

    }

    void initializeGame()
    {
        System.out.println("+-----------------+");
        System.out.println("    Hangman v1.0   ");
        System.out.println("+-----------------+");
        System.out.println("");
        System.out.println("Please choose a mode: \n1. Easy\n2. Medium\n3. Hard");
        System.out.print("->");

        Scanner myScanner = new Scanner(System.in);
        diffMode = myScanner.nextInt();

        
        play(diffMode);
    }

    void play(int mode)
    {
        switch (mode)
        {
            case 1:
                Random randomIndex = new Random();
                Scanner guessWord = new Scanner(System.in);

                System.out.println(randomIndex.nextInt(easyMode.length));
                String word = easyMode[randomIndex.nextInt(easyMode.length)].toString();
                
                StringBuilder myName = new StringBuilder(word);
                StringBuilder wrongLetters = new StringBuilder();
                for (int i = 0; i < word.length(); i++)
                {
                    myName.setCharAt(i, '*');
                    
                }
                

                while (missedWords < 7)
                {
                    
                    System.out.println("Your word looks like this:");
                    System.out.println(myName);

                    System.out.println("Enter your guess :");
                    System.out.print("->");
                    char currentGuessedLetter = guessWord.next().charAt(0);

                    for (int i = 0; i < word.length(); i++) 
                    {
                        if (currentGuessedLetter == word.charAt(i))
                        {
                            myName.setCharAt(i, currentGuessedLetter);

                        }

                        else
                        {
                            wrongLetters.append(currentGuessedLetter);
                            missedWords += 1;
                        }
                       
                    
                    }

                    printBoard(missedWords);
                    System.out.println("Points : " + storePoints);
                    System.out.println("Wrong Letters " + wrongLetters.toString());



                }

                

                System.out.println(word);
                break;
        }
    }

    public static void main(String[] args)
    {
       // initializeGame();
        // printBoard(0);
        // printBoard(1);
        // printBoard(2);
        // printBoard(3);
        // printBoard(4);
        // printBoard(5);
        // printBoard(6);
    }

}