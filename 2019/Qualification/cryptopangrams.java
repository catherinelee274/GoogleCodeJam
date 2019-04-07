// https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/000000000008830b

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

	  // File file = new File("/Users/admin/eclipse-workspace/Solution/src/crypt.txt"); 

		// Scanner in = new Scanner(file);

	      
	        int t = in.nextInt(); 
	        for (int i = 1; i <= t; ++i) {
	          int n = in.nextInt();

	            int len = in.nextInt(); //len

	          LinkedList<Integer> list = new LinkedList<>(); 
	          for(int j = 0; j < len; j++){

	        	  
	              int x = in.nextInt(); 

	              list.add(x);
	          } 

	          System.out.println("Case #" + i + ": " + solve(n,list));
	        }      
		
	}
	//euclid's algorithm 
    public static int gcd(int a, int b){
          while(b!=0){
              int t = b;
              b = a%b;
              a = t; 
          }
          return a; 
      }
    public static String solve(int n, LinkedList<Integer> list){
        //each letter is used at least ONCE
        //hashset? 

        //first one is to determine the mappings of numbers to letters
        Set<Integer> set = new HashSet<>(); 
        
        //when size of set gets to 26, you know you're good
        int first = gcd(list.get(0), list.get(1));
        set.add(list.get(0)/first); 

        for(int i = 0 ; i < list.size()-1; i++){
            int num = gcd(list.get(i), list.get(i+1)); 
            set.add(num); 
            set.add(list.get(i)/num); 
            set.add(list.get(i+1)/num); 
            if(set.size() >= 26){
                break; 
            }
        }

        //second one is to determine the actual letters
        //sort set by lowest int to highest int
        LinkedList<Integer> sorted = new LinkedList<>(); 
        for(int temp: set){
            sorted.add(temp); 
        }

        //now it is sorted
        Collections.sort(sorted); 

        //hash map to  map values to char
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i = 65; i < 91; i++){
            char c = (char)i; 

            map.put(sorted.get(i-65),c); 

        }


//Case #1: CJ QU IZ KN OW BE VY OF DP FL UX AL GO RI TH MS - len 31
//Case #2: SU BD ER MA TO GL YP HI CF JK NQ VW XZ - len 25
        
        //go over and decode
        String ans = ""; 
        ans+= map.get(list.get(0)/gcd(list.get(0),list.get(1))); 
        for(int i = 0 ; i < list.size()-1; i++){
            ans+= map.get(gcd(list.get(i),list.get(i+1))); 
        }
        //second to last step
        
        //if it is even then add condition..
        
        
        //last step
       
        
        
        //ans+= map.get(emp);
        int last = list.get(list.size()-1); 
        int secondlast = list.get(list.size()-2); 
        int d = gcd(secondlast, last); 

        ans+=map.get(last/d); 
        

        
        return ans;
        
        



    }

}
