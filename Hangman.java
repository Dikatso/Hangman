import java.util.*;
import java.util.Scanner;

public class Hangman
{
    int storePoints = 0;
    int missedWords = 0;
    int diffMode = 0;
    String[] wrongLetters = {};
    String[] easyMode = {"DOLL","TOY","RED","JUG","VAN","YAK","ZIP"};
    String[] mediumMode = {"HONEY","MOTHER","EIGHT","FAMILY","JELLY","JUMP","BOAT","DUST"};
    String[] hardMode = {"DRAWING","BIRTHDAY","ELEPHANT","ANIMAL","QUEUE","UNABLE"};


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
        myScanner.close();
    }

    void play(int mode)
    {
        if (mode == 1)
        {
            Random randomIndex = new Random();              // Used to get random word from list
            Scanner guessWord = new Scanner(System.in);     // Scanner to read user input

            String word = easyMode[randomIndex.nextInt(easyMode.length)].toString();    // Word randomly chosen from list
            StringBuilder myName = new StringBuilder(word);                 //Hides the word to be guessed and unveils it as the user guesses
            StringBuilder wrongLetters = new StringBuilder();               //Stores the wrong guessed letters
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
                char fUpper = Character.toUpperCase(guessWord.next().charAt(0));

                if(!(word.contains(String.valueOf(fUpper))))
                {
                    wrongLetters.append(fUpper + " ");
                    missedWords += 1;
                }
                for (int i = 0; i < word.length(); i++) 
                {
                    if (fUpper == word.charAt(i))
                    {
                        myName.setCharAt(i, fUpper);
                        storePoints += 1;
                    }
                }
                printBoard(missedWords);
                //System.out.println("Points: " + storePoints);
                System.out.println("Wrong Letters: " + wrongLetters.toString());
                if(word.equals(myName.toString()))
                {
                    System.out.println("Game Won!");
                    break;
                }
                else if(missedWords == 6)
                {

                    System.out.println("Game Lost...");
                    System.out.println("Word to be guessed :" + word);
                    break;
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                guessWord.close();
            }
        }

        else if (mode == 2)
        {
            Random randomIndex = new Random();              // Used to get random word from list
            Scanner guessWord = new Scanner(System.in);     // Scanner to read user input

            String word = mediumMode[randomIndex.nextInt(mediumMode.length)].toString();    // Word randomly chosen from list
            StringBuilder myName = new StringBuilder(word);                 //Hides the word to be guessed and unveils it as the user guesses
            StringBuilder wrongLetters = new StringBuilder();               //Stores the wrong guessed letters
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
                char fUpper = Character.toUpperCase(guessWord.next().charAt(0));

                if(!(word.contains(String.valueOf(fUpper))))
                {
                    wrongLetters.append(fUpper + " ");
                    missedWords += 1;
                }
                for (int i = 0; i < word.length(); i++) 
                {
                    if (fUpper == word.charAt(i))
                    {
                        myName.setCharAt(i, fUpper);
                        storePoints += 1;
                    }
                }
                printBoard(missedWords);
                //System.out.println("Points: " + storePoints);
                System.out.println("Wrong Letters: " + wrongLetters.toString());
                if(word.equals(myName.toString()))
                {
                    System.out.println("Game Won!");
                    break;
                }
                else if(missedWords == 6)
                {
                    System.out.println("Game Lost...");
                    System.out.println("Word to be guessed :" + word);
                    break;
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                guessWord.close();
            }
        }

        else if (mode == 3)
        {
            Random randomIndex = new Random();              // Used to get random word from list
            Scanner guessWord = new Scanner(System.in);     // Scanner to read user input

            String word = hardMode[randomIndex.nextInt(hardMode.length)].toString();    // Word randomly chosen from list
            StringBuilder myName = new StringBuilder(word);                 //Hides the word to be guessed and unveils it as the user guesses
            StringBuilder wrongLetters = new StringBuilder();               //Stores the wrong guessed letters
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
                char fUpper = Character.toUpperCase(guessWord.next().charAt(0));

                if(!(word.contains(String.valueOf(fUpper))))
                {
                    wrongLetters.append(fUpper + " ");
                    missedWords += 1;
                }
                for (int i = 0; i < word.length(); i++) 
                {
                    if (fUpper == word.charAt(i))
                    {
                        myName.setCharAt(i, fUpper);
                        storePoints += 1;
                    }
                }
                printBoard(missedWords);
                //System.out.println("Points: " + storePoints);
                System.out.println("Wrong Letters: " + wrongLetters.toString());
                if(word.equals(myName.toString()))
                {
                    System.out.println("Game Won!");
                    break;
                }
                else if(missedWords == 6)
                {
                    System.out.println("Game Lost...");
                    System.out.println("Word to be guessed :" + word);
                    break;
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                guessWord.close();
            }
        }
    }
}