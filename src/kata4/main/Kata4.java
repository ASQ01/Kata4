package kata4.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kata4.model.*;
import kata4.view.*;

public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        HistogramDisplay histo = new HistogramDisplay(MailHistogramBuilder.build(MailListReader.read("email.txt")));
        histo.execute();
    }
    
}