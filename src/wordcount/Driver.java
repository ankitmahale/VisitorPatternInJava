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
public class Driver {

    
    public static void main(String[] args) throws IOException {
       
        Node root = null;
        
        String inputFileName="C:\\Users\\Ankit Mahale\\Desktop\\Netbeans projects\\wordcount\\src\\wordcount\\input.txt";
        String outputFileName="C:\\Users\\Ankit Mahale\\Desktop\\Netbeans projects\\wordcount\\src\\wordcount\\output.txt";
        String searchString="boy";
        FileProcessor fileProcessor=new FileProcessor(inputFileName,outputFileName);
        
        long startTime = System.currentTimeMillis();
        int count=0;
        while(count<=100)
        {
            
            BinarySearchTree bst=new BinarySearchTree(root);
            TreeProcessingVisitorI populateTreeVisitor = new PopulateTreeVisitor(fileProcessor);
            TreeProcessingVisitorI wordCountVisitor=new WordCountVisitor(fileProcessor);
            TreeProcessingVisitorI grepVisitor=new GrepVisitor(fileProcessor,searchString);
            bst.accept(populateTreeVisitor);
            bst.accept(wordCountVisitor);
            bst.accept(grepVisitor);
            count++;
        }
        long finishTime = System.currentTimeMillis();
        long total_time=(finishTime-startTime)/100;
        System.out.println(total_time+" milliseconds for a single iteration");
     
        
    }
    
}
