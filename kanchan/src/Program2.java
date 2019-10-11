import java.util.Scanner;


public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter a string");
		str = in.nextLine();
		System.out.println("your stringn is"+str);
	
        for(int i=0;i<str.length();i++)
        {
        	System.out.println(str.substring(0,i));
        }
        for(int i=str.length();i>=0;i--)
        {
        	System.out.println(str.substring(0,i));
        }
        
        
	}

}
