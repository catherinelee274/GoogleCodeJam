//something was wrong with the recursion
// https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/00000000000881da

 import java.util.*;
    import java.io.*;
    
    public class Solution {
      public static void main(String[] args) throws FileNotFoundException {
        //Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        File file = new File("/Users/admin/Desktop/codejam/ow.txt"); 

		 Scanner in = new Scanner(file);
        
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
        	
          int n = in.nextInt();
          String trash = in.nextLine();
          String s = in.nextLine(); 
   
          System.out.println("Case #" + i + ": " + solve(n,s));
        }
      }
      public static String solve(int n, String s){
          //start at 0,0
          //goalx = n-1;
          //goaly = n-1;

          int oppx = 0;
          int oppy = 0; 

          HashMap<String, String> map = new HashMap<String, String>();
          //find areas traversed by opponent
          for(int i= 0 ; i < s.length(); i++){
              char c= s.charAt(i); 
              String temp = oppx+""+oppy;
              if(c == 'S'){
                oppy++; 
              }
              else{ 
                  //E
                  oppx++; 

              }
              System.out.println(temp+" "+oppx+""+oppy);
              map.put(temp,oppx+""+oppy); 
          }

          return maze(n,0,0,map,"");

      }
      public static String maze(int n, int x, int y, HashMap<String,String> map, String s ){
          System.out.println(x+""+y); 
    	  if(x >= n || y >= n) {
        	  return "";
          }
    	  if(x == n-1 && y == n-1){
              return s; 
          }
          else {
              int temp = x+1;
              int temp2 = y+1;
              if(map.get(x+""+y) == null || !map.get(x+""+y).equals(temp+""+y)){
                  return "E"+maze(n, x+1,y, map,s);
              }
              if(map.get(x+""+y) == null || !map.get(x+""+y).equals(x+""+temp2) ){
                return "S"+maze(n, x,y+1, map, s); 
              }
            	  return s;
              
            }
    }
}
