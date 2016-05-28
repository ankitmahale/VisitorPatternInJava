/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ankit Mahale
 */
public class WordCountVisitor implements TreeProcessingVisitorI{

    
    public FileProcessor fileprocessor;
    public int noOfWords;
    public int noOfCharacters;
    public int frequencyOfMFU;
    public ArrayList mostFrequentlyUsedWord;
    
    public WordCountVisitor(FileProcessor fileprocessorIn){
    
    fileprocessor = fileprocessorIn; 
    }
    
    
    @Override
    public void visit(BinarySearchTree bst) {
        
        bst.calculateStats();
        noOfWords=bst.getNoOfWords();
        noOfCharacters= bst.getnoOfCharacters();
        frequencyOfMFU=bst.getfrequencyOfMFU();
        mostFrequentlyUsedWord=bst.getmostFrequentlyUsedWord();
        String lineToBeWritten="The total number of words is: "+noOfWords+"\nThe most frequently used word is: "+mostFrequentlyUsedWord+"\nThe frequency of the most frequently used word is: "+frequencyOfMFU+"\nThe number of characters (without whitespaces) is: "+noOfCharacters+"\n";
        try {
            fileprocessor.writeLinesToFile(lineToBeWritten);
        } catch (IOException ex) {
        }
    }
    
}
