import java.io.*;
import java.util.*;

public class ReadFiles 
{
    public static void main(String[] args) throws IOException
    {
        try
        {
        File inFile = new File("data.txt");
        BufferedReader reader = new BufferedReader(new java.io.FileReader(inFile));
        int[] counter = new int[26];
        int totalChars = 0;
        int nonLetter = 0;
        int charNext;

       while ((charNext = reader.read()) != -1) {
            char checkedChar = (char) charNext;
            checkedChar = Character.toLowerCase(checkedChar);
            if (checkedChar >= 'a' && checkedChar <= 'z') {
                counter[checkedChar - 'a']++;
                totalChars++;
            } else {
                nonLetter++;
            }
        }

        Map letters = sorting(counter);  
        printMap(letters);

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}