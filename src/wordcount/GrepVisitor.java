/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

import java.io.IOException;

/**
 *
 * @author Ankit Mahale
 */
public class GrepVisitor implements TreeProcessingVisitorI {
    
    public FileProcessor fileprocessor;
    public String searchString;
    int searchStringFrequency;
    public GrepVisitor(FileProcessor fileprocessorIn,String searchStringIn){

         fileprocessor = fileprocessorIn; 
         searchString=searchStringIn;

    }

    @Override
    public void visit(BinarySearchTree bst) {
        bst.findString(searchString);
        searchStringFrequency=bst.getsearchStringFrequency();
        String lineToBeWritten="The word "+searchString+" occurs the following times: "+searchStringFrequency;
        try {
            fileprocessor.writeLinesToFile(lineToBeWritten);
        } catch (IOException ex) {
        }
    }
    
}
