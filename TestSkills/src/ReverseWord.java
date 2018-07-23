import java.util.Scanner;

public class ReverseWord {

	
	
    public static void main(String args[]){
    	
    	Scanner read = new Scanner(System.in);
    	String str = read.nextLine();
    	read.close();
    
    	System.out.println(str.length());
    	
	    String str1[] = str.split(" ");
	    String finalStr="";
	        for(int i = str1.length-1; i>= 0 ;i--){
	        	
	        	//System.out.println(str1.length);
	        	
	        	//System.out.println(str1[i]);
	        	
	            finalStr += str1[i]+" ";
	            //System.out.println(finalStr);
	            
	        }
	        System.out.println(finalStr);
	    }
	}

