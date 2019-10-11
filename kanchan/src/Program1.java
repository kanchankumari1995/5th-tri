import java.util.Scanner;


public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a[] = new int[10];
		int max=0,min=100;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 10 array elements");
		for(int i=0;i<10;i++)
		{
			a[i] = s.nextInt();
		}
	
	    for(int i=0;i<10;i++)
	    {
	        if(max<a[i])
	    	{
	    		max = a[i];
	    	}

	    }
	    System.out.println("max element of array is:"+max);
	
	    for(int i=0;i<10;i++)
	    {
	    	
	    	if(min>a[i])
	    	{
	    	   min=a[i];
	    	}
	    }
	    System.out.println("min element of array is:"+min);
	}
	int b[] = new int[10];
	

}
