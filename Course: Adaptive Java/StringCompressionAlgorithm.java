import java.util.Scanner;


public class StringCompressionAlgorithm {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	      String dna = scanner.nextLine();
	      
	      scanner.close();
	      
	      if(dna.equals(""))
	    	  return;
	      	      
	      StringBuilder sb = new StringBuilder();
	      int count = 1;
	      
	      if (dna.length() == 1) {
	    	  String a = "" + dna.charAt(0);
	    	  sb.append(a);
              sb.append(1);
              System.out.println(sb.toString());
              return;
	      }
	      
	      String a = "" + dna.charAt(0);
    	  String b = "" + dna.charAt(1);
	      
	      for(int i = 0; i < dna.length() - 1; i++) {
	      
	    	  a = "" + dna.charAt(i);
	    	  b = "" + dna.charAt(i + 1);
	    	  	    	  
	          if(a.equals(b)) {
	              count++;
	          } else {
	        	  sb.append(a);
	              sb.append(count);
	              count = 1;
	              
	          }

	      }
	      
	      a = "" + dna.charAt(dna.length() - 2);
    	  b = "" + dna.charAt(dna.length() - 1);
    	  	    	  
          if(a.equals(b)) {
        	  sb.append(a);
              sb.append(count);
          } else {
        	  sb.append(b);
              sb.append(1);
          }
	      
	      System.out.println(sb.toString());
	
	}

}
