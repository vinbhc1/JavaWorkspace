import java.util.Scanner;

public class ReverseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string to reverse ");
		Scanner read = new Scanner(System.in);
		String Str = read.nextLine();
		String reverse ="";
		
		System.out.println(Str.length());
		
		
		for (int i = Str.length()-1; i >=0 ; i--) {
			
			reverse = reverse + Str.charAt(i);
		}
			
		
		System.out.println(reverse);
		
		if (Str ==reverse){
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("Not palindrome" );
		}

	}

}
