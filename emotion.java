import java.util.*;
import java.io.*;
public class emotion
{
    public static void main(String[] args)
    {
        int happy = 0;
        int sad = 0;
        try 
        {
        File file = new File("happyorsad.txt");
        Scanner SC = new Scanner(file);
        String text = SC.nextLine();
        for (String word: text.split(" "))
        {
            if (word.equals(":-("))
            {
                sad ++;
            }
            else if (word.equals(":-)"))
            {
                happy ++;
            }
        }
        }
        catch(Exception e)
        {
            System.out.println("??? I dont see no file");
        }
        if (happy > sad){
            System.out.println("happy");
        }
        else if (happy < sad){
            System.out.println("sad");
        }
        else if (happy == sad){
            System.out.println("unsure");
        }
        else{
            System.out.println("none");
        }
        
    }}
