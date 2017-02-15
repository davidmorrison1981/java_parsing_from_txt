import java.io.*;
import java.util.Arrays;

public class ReadFiles 
{
    public static void main(String[] args) throws IOException
    {
        try
        {
        File inFile = new File("data.txt");
        BufferedReader reader = new BufferedReader(new java.io.FileReader(inFile));
        String line = null;

        while ((line=reader.readLine()) != null)
                    {
                        String st  = line.replaceAll("\\s+","");
                        char[] charArray = st.toCharArray();
                        Arrays.sort(charArray);
                        System.out.println(charArray);

                    }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}