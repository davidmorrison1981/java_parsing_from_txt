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
        int totalLetters = 0;
        int nonLetter = 0;
        int next;

        while ((line=reader.readLine()) != null)
                    {
                        String st  = line.replaceAll("\\s+","");
                        charArray=Arrays.asList(st);
                        Arrays.sort(charArray, Collections.reverseOrder());
                        System.out.println(charArray);

                        // for(int i=0; i<charArray.length(); i++)
                        //    String letter = "a"
                        //    if letter ==

                    }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}