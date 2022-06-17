import java.util.*;

public class Hangman
{
    String[] easyMode = {"Doll","Toy","Red","Jug","Van","Yak","Zip"};
    String[] mediumMode = {"Honey","Mother","Eight","Family","Jelly","Jump","Boat","Dust"};
    String[] hardMode = {"Drawing","Birthday","Elephant","Animal","Queue","Unable"};


    static void printBoard()
    {
        System.out.println("-------------");
        System.out.printf("%-11s |\n", "|");
        System.out.printf("%-11s O\n", "|");
        System.out.printf("%-10s /|\\ \n", "|");
        System.out.printf("%-11s |\n", "|");
        System.out.printf("%-10s / \\\n", "|");
        System.out.println("|");
        System.out.println("'------------");


    }

    public static void main(String[] args)
    {
        printBoard();
    }

}