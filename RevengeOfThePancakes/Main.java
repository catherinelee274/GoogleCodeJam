/***

Revenge of the Pancakes

***/

import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException{

     // check number of command line arguments is at least 2
     if(args.length < 2){
        System.out.println("Usage: java –jar FileCopy.jar <input file> <output file>");
        System.exit(1);
     }

     // open files
     Scanner in = new Scanner(new File(args[0]));
     PrintWriter out = new PrintWriter(new FileWriter(args[1]));



     int caseNum = 0;
     String numofCases = in.nextLine();
     while(in.hasNextLine())
     {
       caseNum++;
       String input = in.nextLine();
       out.println("Case #" + caseNum + ": " +solve(input));


     }


   // close files
       in.close();
       out.close();
  }
  public static int solve(String input)
  {

    Queue<String> q = new Queue<Integer>();
    Stack<String> s = new Stack<String>();
    char[] pancakes = input.toCharArray();
    for(char n : pancakes)
    {
      q.add(n);
    }
    //now has the pancakes in order



  }
}
