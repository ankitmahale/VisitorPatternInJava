/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

import java.util.ArrayList;

/**
 *
 * @author Ankit Mahale
 */
public class BinarySearchTree {
    
    private Node root;
    private int noOfWords;
    private int noOfCharacters;
    private ArrayList <String> mostFrequentlyUsedWord=new ArrayList(20);
    private int frequencyOfMFU;
    private int searchStringFrequency;
    
    public BinarySearchTree(Node rootIn){
    
    root=rootIn;
    }
    public Node getRoot(){
    
        return root;
    
    }
    public void setRoot(Node rootIn){
    
        root=rootIn;
    
    }
    public int getNoOfWords(){
    
        return noOfWords;
    
    }
    public void setNoOfWords(int noOfWordsIn){
    
        noOfWords=noOfWordsIn;
    
    }
    public int getnoOfCharacters(){
    
        return noOfCharacters;
    
    }
    public void setnoOfCharacters(int noOfCharactersIn){
    
        noOfCharacters=noOfCharactersIn;
    
    }
    
    public ArrayList getmostFrequentlyUsedWord(){
    
        return mostFrequentlyUsedWord;
    
    }
    public void setmostFrequentlyUsedWord(String mostFrequentlyUsedWordIn){
    
        mostFrequentlyUsedWord.add(mostFrequentlyUsedWordIn);
    
    }
    
    public int getfrequencyOfMFU(){
    
        return frequencyOfMFU;
    
    }
    public void setfrequencyOfMFU(int frequencyOfMFUIn){
    
        frequencyOfMFU=frequencyOfMFUIn;
    
    }
    
    public int getsearchStringFrequency(){
    
        return searchStringFrequency;
    
    }
    public void setsearchStringFrequency(int searchStringFrequencyIn){
    
        searchStringFrequency=searchStringFrequencyIn;
    
    }        
    
    public void accept(TreeProcessingVisitorI visitor){
    
    visitor.visit(this);
    
    }
    
    public Node createNode(){
    
        Node newnode=new Node();
        return newnode;
        
    }
    
    public void insertIntoTree(Node root,String word)
    {
        Node parent = null;
          while(root!=null)
          {  
              if(root.word.equals(word))
            {
                  root.frequency++;
                  root.characterCount+= root.word.length();
                  return;
            }
            else if(root.word.compareTo(word)<0)
            {
                 parent=root;
                 root=root.right;
            }
            else
            {
                 parent=root;
                 root=root.left;
            }    
          }   
          if(parent.word.compareTo(word)<0)
          {
               parent.right=createNode();
               parent.right.word=word;
               parent.right.frequency=1;
               parent.right.characterCount = word.length();
               //System.out.println(parent.right.word+"Inserted");
          } 
          else
          {
               parent.left=createNode();
               parent.left.word=word;
               parent.left.frequency=1;
               parent.left.characterCount = word.length();
               //System.out.println(parent.left.word+"Inserted");
          
          }
          
          return;
         
    }        
    public void insertIntoTree(String wordIn)
    {
         if(root==null)
         {
              setRoot(createNode());
              root.frequency=1;
              root.word=wordIn;
              root.characterCount= root.word.length();
              return;
         }    
         else
         {
              insertIntoTree(getRoot(),wordIn); 
         }    
    
    
    }        
    public void printTree()
    {
        printTree(getRoot());
    
    }
    public void printTree(Node root)
    {
        if(root!=null)
        {    printTree(root.left);
            System.out.print(root.word+"--"+root.frequency+"\n");
            
            printTree(root.right);
        }    
    
    }
    public void calculateStats()
    { 
        if(root==null)
        { return;
        }
        //mostFrequentlyUsedWord=root.word;
        frequencyOfMFU=root.frequency;
        calculateStats(root);
        findMFU(root);
        
    }        
    public void calculateStats(Node root)
    {
        if(root!=null)
        {
            calculateStats(root.left);
            noOfWords=noOfWords+root.frequency;
            noOfCharacters=noOfCharacters+root.characterCount;
            if(root.frequency>frequencyOfMFU)
            {
                frequencyOfMFU=root.frequency;
                //mostFrequentlyUsedWord=root.word;
            }    
            calculateStats(root.right);
        
        }    
    
    } 
    public void findMFU(Node root)
    {
        if(root!=null)
        {
            findMFU(root.left);
            if(root.frequency==frequencyOfMFU)
                setmostFrequentlyUsedWord(root.word);
            findMFU(root.right);
            
          
        }    
    
    
    }        
    
    public void findString(String searchString)
    {
        findString(getRoot(),searchString);
    }        
    public void findString(Node root,String searchString)
    {
        if(root!=null)
        {    
                findString(root.left,searchString);
                if(root.word.equals(searchString))
                {
                    setsearchStringFrequency(root.frequency);
                }    
                findString(root.right,searchString);
        }
    } 
    
    
    
    
    
}
