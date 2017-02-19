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

        Map letters = sortLetters(counter);  
        printMap(letters);

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }


 private static Map sortLetters(int[] counter) {
        Map letterHash = new LinkedHashMap<String, Integer>() {};
        int k = 0 ;
        for (int i = 0; i < 26; i++) {
             int maxCount =-1;
            for (int j = 0; j < 26; j++) {
                if(maxCount < counter[j]){
                    maxCount = counter[j];
                    k = j;
                }
            }     
            counter[k] = -1;
            if(maxCount!=0)
            letterHash.put(((char)(k+97))+"", maxCount);
            maxCount=0;
        }
        return letterHash;
    }


    public static void printMap(Map<String, Integer> map)
    {
      System.out.println("Quantity   "+ " Letter");
       for (Map.Entry<String, Integer> entry : map.entrySet()) {
         String key = entry.getKey().toString();
         Integer value = entry.getValue();
         System.out.println("   "+value + "         "+ key);
      }
   }
}