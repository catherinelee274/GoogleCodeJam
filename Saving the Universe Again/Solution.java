import java.util.*;
import java.io.*;
public class Solution {
  public static int max;

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = Integer.parseInt(in.nextLine()); // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      String line = in.nextLine();
      String[] tokens= line.split(" ");
      String m = tokens[1];
      char[] a = m.toCharArray();
      max = Integer.parseInt(tokens[0]);

      int x = 0;
      System.out.println("Case #" + i + ": " +solve(a,x,0));
    }
  }
  public static String solve(char[] m, int i,int swapTimes){
    if(calculate(m) <= max)
    {
      return swapTimes+"";
    }
    else if (i>=m.length-1)
    {
      return "IMPOSSIBLE";
    }

    swap(m,i,i+1);
    //i++;
    return solve(m,i+1,swapTimes+1);


  }
  public static int calculate(char[] m)
  {
    int answer = 0;
    int point = 1;

    for(int i = 0 ; i < m.length; i++){
      if(m[i] == 'S')
      {
        answer+= point;
      }
      else if (m[i] =='C')
      {
        point= point*2;
      }
    }
    System.out.println("len:"+answer);
    return answer;
  }
  public static void swap(char[] m, int a, int b)
  {
    char temp = m[a];
    m[a] = m[b];
    m[b] = temp;
  }
}
