
import java.util.Scanner;
class pyramidProg
{
    public static void main(String args[])
    {
       int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        for(i=1;i<=rows;i++)
	 {
	    for(j=0;j<(rows-i);j++)
	     {
		System.out.print(" ");
	     }
	    for(k=0;k<i;k++)
	     {
		System.out.print(" *");
	     }
	  System.out.println();
        }
        
    }
    
}