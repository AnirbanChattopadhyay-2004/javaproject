import java.util.Scanner;
import java.util.Arrays;

public class occurance {
    public static void count(int arr[])
    {
        Scanner in =new Scanner(System.in);
        int l=0;
        while(true)
        {
            System.out.println("Enter the element "+(l+1));
            arr[l]=in.nextInt();
            if(arr[l]==0)
            break;
            l++;
        }
        
        int arr1[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr1[i]=arr[i];
           
        }
        Arrays.sort(arr1);
        int c,k=0;
        
        for(int i=0;i<arr1.length;i++)
        {
            c=0;
       //    System.out.println("i is"+i);
            
            for(int j=i;j<arr1.length;j++)
            {
               // System.out.println("j is"+j);
                if(arr1[i]==arr1[j])
                {
                c++;
                k=k+1;    
               // System.out.println("k is "+k);
               }
               else
               {
               
               break;
               }
            }
           
            
          //  System.out.println("k final is "+k);
            if(c>1)
           {
            System.out.println(arr1[i]+" occurs "+c+" times ");
            
            }
            else 
            System.out.println(arr1[i]+" occurs "+c+" time ");
   
            i=k-1;
            
            
            
        }

    }
    


    public static void main(String[] args) {
       
        
        int arr[]=new int[100];
      
        count(arr);
    }
}
