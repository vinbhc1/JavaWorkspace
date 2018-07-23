import java.util.Scanner;

public class Wordreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		read.close();
		 String reverse ="";
		 String finalstr = "";
		 
		 String str1[] = str.split(" ");
		 
		 for(int i = 0; i<=str1.length-1; i++)
		 {
			 
			 for(int j= str1[i].length()-1; j>=0;j--) {
				 reverse =  reverse + str1[i].charAt(j);
				
			 }
			 
			 finalstr = finalstr +reverse + " ";
			 
			 reverse ="";
			 
		 }
		
		System.out.println(finalstr);

	}

}
