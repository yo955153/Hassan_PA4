// Yoseph Hassan, COP3330
// Programming Assignment 4 Part 1

import java.util.Iterator;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.HashSet;



public class DuplicateRemover
{
    HashSet<String> uniqueWords = new HashSet<String>();

    public void remove(String dataFile) throws FileNotFoundException
    {
        Scanner scnr = new Scanner(new File(dataFile));
        String input;

        // Taking in input to the hashset
        while(scnr.hasNext() != false)
        {
            input = scnr.next();
            uniqueWords.add(input);

        }

        //closing file
        scnr.close();
    }

    public void write(String outputFile) throws IOException
    {
        File out = new File(outputFile);
        FileWriter writer;

        if(!out.exists())
        {
            out.createNewFile();
            writer = new FileWriter(out);
            Iterator rator = uniqueWords.iterator();

            while(rator.hasNext())
            {
                String str = (String)rator.next();
                writer.write(str);
                writer.write("\n");
            }
            writer.close();
            System.out.println("An exceptional IO event occurred");
        }

        else
        {
            new FileOutputStream(outputFile).close();
            writer = new FileWriter(out, true);
            Iterator rator = uniqueWords.iterator();

            while(rator.hasNext() != false)
            {
                String str = (String)rator.next();
                writer.write(str);
                writer.write("\n");
            }
            writer.close();
            System.out.println("An exceptional IO event occurred");
        }
    }
}
