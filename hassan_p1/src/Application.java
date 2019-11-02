// Yoseph Hassan, COP3330
// Programming Assignment 4 Part 1

import java.io.FileNotFoundException;
import java.io.IOException;


public class Application {

    public static void main(String[] args) throws IOException
    {
        DuplicateRemover remover = new DuplicateRemover();
        remover.remove("problem1.txt");
        remover.write("unique_words.txt");
    }
}
