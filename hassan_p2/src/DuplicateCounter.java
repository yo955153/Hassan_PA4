// Yoseph Hassan, COP3330
// Programming Assignment 4 Part 2

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.util.HashMap;


public class DuplicateCounter
{
    HashMap<String, Integer> wordCounter;

    public DuplicateCounter()
    {
        this.wordCounter = new HashMap<String, Integer>();
    }

    public void count(String dataFile) throws FileNotFoundException
    {
        Scanner scnr;
        scnr = new Scanner(new File(dataFile));

        while(scnr.hasNext() != false)
        {
            String input = scnr.next();
            Integer count = wordCounter.get(input);

            if(count == null)
                count = 1;
            else
                count++;

            wordCounter.put(input, count);
        }
    }

    public void write(String outputFile) throws IOException
    {
        // Variable declaration and initialization
        FileWriter writer;
        File out = new File(outputFile);

        if(out.exists() == true)
        {

            writer= new FileWriter(new File(outputFile));

            // For loop to write the information from the HashMap to the file
            for (HashMap.Entry<String, Integer> entry : wordCounter.entrySet())
            {
                writer.write(entry.getKey() + " " + entry.getValue());
                writer.write("\n");

            }

            // Close File
            writer.close();

            System.out.println("An exceptional IO event occurred");
        }

        else
        {
            new FileOutputStream(outputFile).close();

            writer= new FileWriter(new File(outputFile));

            // For loop to write the information from the HashMap to the file
            for (HashMap.Entry<String, Integer> entry : wordCounter.entrySet())
            {
                writer.write(entry.getKey() + " " + entry.getValue());
                writer.write("\n");

            }

            // Close File
            writer.close();

            System.out.println("An exceptional IO event occurred");
        }
    }

}
