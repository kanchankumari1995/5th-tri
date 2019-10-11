import java.util.Scanner;


public class Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = new int[9];
        int sum = 0;
		Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i=0;i<array.length;i++)
        {
        	 array[i] = in.nextInt();
        	 sum = sum + array[i];
        }
        System.out.println("missing element is:"+(55-sum));
	}

}
