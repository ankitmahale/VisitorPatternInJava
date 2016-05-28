/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Ankit Mahale
 */
public class FileProcessor {

    String inputFileName;
    String outputFileName;
    PrintWriter printWriter;
    static int close;
    
    public FileProcessor(String inputFileNameIn, String outputFileNameIn) 
    {    
            inputFileName= inputFileNameIn;
            outputFileName= outputFileNameIn;
    }
    public ArrayList readWordsFromFile() throws FileNotFoundException, IOException
    {
         BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
            ArrayList <String> words= new ArrayList();
            String[] line;
            String str;
            int i=0;
            int j=0;
            while((str=bufferedReader.readLine()) != null)
            {   line=null;
                line = str.split("\\s+");
                for(i=0;i<line.length;i++)
                {   if(line[i].matches("[A-z]+"))
                    words.add(line[i]);
                }
            }
            printWriter = new PrintWriter(outputFileName);
            return words;
    }      
    public void writeLinesToFile(String lineToBeWritten) throws IOException
    {
        
        printWriter.write(lineToBeWritten);
        close++;
        if(close%2==0)
        {    
            printWriter.close();
        }
    
    }        
    
}
