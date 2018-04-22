/***
No Nine - Google Kickstart 
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
        System.out.println("Usage: java -jar FileCopy.jar <input file> <output file>");
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
	   String[] tokens = input.split(" ");
       out.println("Case #" + caseNum + ": " +solve(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])));


     }


   // close files
       in.close();
       out.close();
  }
  public static int solve(int lower, int upper)
  {
	  int count = 0; 
	for(int i = lower; i <= upper; i++){
		int increment = 1;
	    if(i%9 == 0){
		    increment = 0; ; 
		}
		char[] arr = (i+"").toCharArray(); 
		for(char c: arr){
			if(Integer.parseInt(c+"") == 9){
				increment = 0; 
			}
		}
		count +=increment; 
	}
	return count; 
    



  }
}
