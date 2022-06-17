import java.util.*;

public class Hangman
{
    String[] easyMode = {"Doll","Toy","Red","Jug","Van","Yak","Zip"};
    String[] mediumMode = {"Honey","Mother","Eight","Family","Jelly","Jump","Boat","Dust"};
    String[] hardMode = {"Drawing","Birthday","Elephant","Animal","Queue","Unable"};


    static void printBoard(int numErrors)
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

    public static void main(String[] args)
    {
        printBoard(0);
        printBoard(1);
        printBoard(2);
        printBoard(3);
        printBoard(4);
        printBoard(5);
        printBoard(6);
    }

}