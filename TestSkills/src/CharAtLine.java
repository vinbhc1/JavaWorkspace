import java.util.Scanner;

public class CharAtLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter text");
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
	
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
			
		}
		
		
	}

}
