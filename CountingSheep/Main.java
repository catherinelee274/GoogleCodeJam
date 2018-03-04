/**
Counting Sheep

**/
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
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
       String scanLine = in.nextLine();
       int input = Integer.parseInt(scanLine);
       out.println("Case #" + caseNum + ": " +solve(input));


     }


   // close files
       in.close();
       out.close();
  }
  public static String solve(int input)
  {
    if(input == 0)
    {
      return "INSOMNIA";
    }
    Hashtable<String, Integer> table = new Hashtable<String,Integer>();
    int count = 0;
    String temp = "";
    while(table.size() != 10)
    {
      count++;
      temp = input*count +"";
      char[] ch = (temp).toCharArray();
      for(int i = 0 ; i < ch.length; i ++)
      {
        table.put(ch[i]+"",1);
      }
    }
    System.out.println(count);
    return temp;
  }
}
