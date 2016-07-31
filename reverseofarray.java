import java.util.Scanner;

public class reverseofarray {

    public static void main(String[] args) {
        System.out.print("enter the length of array: ");
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        
        int array[]=new int[size];
        
        	System.out.println("enter array elements" );
        	array[i]=in.nextInt();
        	}
        
        for(int i=size-1;i>=0;i--)
        {
         
            System.out.println("reversed array elements: " + array[i]);
        }

        in.close();
        }

        }



