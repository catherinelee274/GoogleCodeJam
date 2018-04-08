/**
Trouble Sort
Google Code Jam 2018 Qualification Round
**/
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Arrays;


public class Solution {
  public static int index = 0;
  public static int donezo = 0;
  public static void main(String[] args) throws IOException{


     // open files
     Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));


     int t = Integer.parseInt(in.nextLine());
     int caseNum = 0 ;
     for (int i = 0 ; i < t; i++)
     {
       String length = in.nextLine();
       String scanLine = in.nextLine();
       //String scanLine.split(" ");
       int[] a = Arrays.stream(scanLine.split(" ")).mapToInt(Integer::parseInt).toArray();
       TroubleSort(a);
       System.out.println("Case #" + (i+1) + ": " +check(a));
       index = 0;
       donezo = 0 ;
     }
     // while(in.hasNextLine())
     // {
     //   caseNum++;
     //   String length = in.nextLine();
     //   String scanLine = in.nextLine();
     //   //String scanLine.split(" ");
     //   int[] a = Arrays.stream(scanLine.split(" ")).mapToInt(Integer::parseInt).toArray();
     //   TroubleSort(a);
     //   System.out.println("Case #" + caseNum + ": " +check(a));
     //   index = 0;
     //   donezo = 0 ;
     //
     // }


   // close files
       in.close();
  }
  public static int[] TroubleSort(int[] L){

		//String answer = "OK";
    boolean done = false;
    //int index = 0;
		while(!done){
			done = true;
			for(int i = 0; i < L.length -2 ; i++)
			{
        index++;
				if (L[i] > L[i+2])
				{
					done = false;
					//reverse the sublist from L[i] to L[i+2], inclusive
					int temp = L[i];
					L[i] = L[i+2];
					L[i+2] = temp;
					if(L[i] > L[i+2])
					{
            donezo = index;
					}
				}
			}
		}
    return L;

	}
	public static String check(int[] L){
		String answer = "OK";
		for(int i = 0 ; i < L.length-1 ; i++)
		{
			if(L[i] > L[i+1])
			{
        if(donezo ==0)
        {
          return 1+"";
        }
        return donezo+"";
			}
		}
		return answer;
	}
}
