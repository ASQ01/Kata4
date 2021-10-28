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
    private String fileName;
    private List<Mail> mailList;
    private Histogram<String> mailHisto;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Kata4 executable = new Kata4();
        executable.setFileName("email.txt");
        executable.execute();
    }
    
    
    public void execute() throws IOException{
        this.input();
        this.process();
        this.output();
    }
    
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    private void input() throws IOException{
        this.mailList = MailListReader.read(this.fileName);
    }
    
    private void process(){
        this.mailHisto = MailHistogramBuilder.build(this.mailList);
    }
    
    private void output(){
        new HistogramDisplay(this.mailHisto).execute();
    }
    
}