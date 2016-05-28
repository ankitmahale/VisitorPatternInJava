/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ankit Mahale
 */
public class PopulateTreeVisitor implements TreeProcessingVisitorI{

    public FileProcessor fileProcessor;
    public PopulateTreeVisitor(FileProcessor fileProcessorIn) {
       fileProcessor = fileProcessorIn; 
    }

    @Override
    public void visit(BinarySearchTree bst) {
       
        ArrayList <String> words=null;
        try {
            words  =fileProcessor.readWordsFromFile();
        } catch (IOException ex) {
            Logger.getLogger(PopulateTreeVisitor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0;i<words.size();i++)
        {
           
            bst.insertIntoTree(words.get(i));
        
        }    
        //bst.printTree();
        
        
    }
 
}
