// Yoseph Hassan, COP3330
// Programming Assignment 4 Part 2

import java.io.IOException;
import java.io.FileNotFoundException;


public class Application
{
    public static void main(String[] args) throws IOException
    {
        DuplicateCounter counter = new DuplicateCounter();
        counter.count("problem2.txt");
        counter.write("unique_word_counts.txt");
    }
}
