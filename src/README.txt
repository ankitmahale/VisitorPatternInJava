CS542 Design Patterns
Spring 2016
PROJECT <3> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: Thursday, April 22, 2016>
Submission Date: <DATE YOU SUBMIT, IN FORMAT:  Thursday, April 22, 2016>
Grace Period Used This Project: <0> Days
Grace Period Remaining: <0> Days
Author(s): <Divya Ladwa>
e-mail(s): <dladwa1@binghamton.edu>
Author(s): <Ankit Mahale>
e-mail(s): <amahale2@binghamton.edu>


PURPOSE:
[
 Using Trees for visitor pattern 
]

PERCENT COMPLETE:
[
 “We believe We have completed 100% of this project."
]

PARTS THAT ARE NOT COMPLETE:
[
  No parts of the assignment are incomplete.
]

BUGS:
[
  None.
]

FILES:
[
  Included with this project are files listed below:

  Driver.java, this contains the main function of the project.
  FileProcessor.java, the file which performs the file operations i.e reading from file and writing to the file
  WordCountVisitor.java
  TreeProcessingVisitorI.java
  PopulateTreeVisitor.java
  GrepVisitor.java
  Node.java
  BinarySearchTree.java
  README, the text file you are presently reading
]

SAMPLE OUTPUT:
[
  bingsuns2% ant -buildfile src/build.xml all
  bingsuns2% ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=output.txt -Darg2=100 -Darg3=the

Buildfile: src/build.xml

jar:

run:
     [java] 52 milliseconds for a single iteration

BUILD SUCCESSFUL
output.txt
The total number of words is: 6745
The most frequently used word is: [of]
The frequency of the most frequently used word is: 248
The number of characters (without whitespaces) is: 36505
The word the occurs the following times: 241


]

TO COMPILE:
[
  ant -buildfile src/build.xml all 
]

TO RUN:

[
   ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=output.txt -Darg2=100 -Darg3=the
]

EXTRA CREDIT:

[
 "N/A"
]


BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
<Divya Ladwa Ankit Mahale>

[
  Here are some samples:

  * http://www.opus-college.net/devcorner/HeadFirstJava2ndEdition.pdf
]

Choice of Data structure
[
    After comparison of various trees such as Avl tree and Red Black tree with Binary Search tree by inserting huge data set we found no much performance difference between them. Hence, as BST is widely used we used BST to implement this assignment.
This assignment is optimize in terms of IO operations are String manipulations.

Time Complexity: Insert: O(logn).
		  Search: O(logn).

]

Note:
Print Writer opens the file output.txt if available or if not present then creates new file output.txt




