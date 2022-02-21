import java.util.random.*;
public class uc_1 {
	
	public static void main(String[] args) {
		  int heads = 0;
	      int tails = 0;
	      int chances = 10;
		 double randomCheck=Math.floor(Math.random() * 10) % 3;
	        int i = (int) randomCheck; 
	      if (i== 1) {
	    	  System.out.println("tails");
	      } else {
	    	  System.out.println("heads");
	      }
	
	    int  Toss Object t = new Toss();
	    int i=t;
	      for (int i = 1; i<= chances; i++) {
	         if (t.chanceFunc().equals("tails")) {
	            tails++;
	         } else {
	            heads++;
	         }
	      }
	      System.out.println("Chances = " + chances);
	      System.out.println("Heads: " + heads);
	      System.out.println("Tails: " + tails);
	   }
	}