 //acccepted!
 // https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/0000000000088231
 
 import java.util.*;
    import java.io.*;
    public class Solution {
      public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
          int n = in.nextInt();
            int[] arr = foo(n); 
          System.out.println("Case #" + i + ": " + arr[0] + " " +arr[1]);
        }
      }

      public static int[] foo(int n){
          //until it adds to n
          int[] ans = new int[2]; 
          ans[0] = n-1;
          ans[1] = 1;
          for(int i = 0; i <= n ; i++){
              if(!check(i) && !check(n-i)){
                  ans[0] = i;
                  ans[1] = n-i; 
                  return ans; 
              }
              else{
                  //some condiiton if one contains a 4
                //subtract 4 with the and add it 
                String s = i+"";
                int e = (int) Math.pow(10,(s.length()-s.indexOf('4')-1))*4;

                int a = i-e;
                int b = n-i+e;
                if(!check(a) && !(check(b))){
                    ans[0] = a;
                    ans[1] = b;
                    return ans; 
                } 
              }
          }
          return ans; 
      }
      
      //checks if a number contains a 4
      //input: an integer 
      //output: true if it contains a 4 , false if it doesnt
      public static boolean check(int l){
          String s = l+"";
          if(s.indexOf('4') < 0){
              return false; 
          }
          return true; 
      }
    }
