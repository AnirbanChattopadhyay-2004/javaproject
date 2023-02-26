import java.util.Scanner;
public class insertdelete {
  public static void create(int arr[],int n)
  {
    Scanner in=new Scanner(System.in);
    for(int i=0;i<n;i++)
    {
      System.out.println("Enter the element "+(i+1));
      arr[i]=in.nextInt();
    }
  }
  public static void display(int arr[])
  {
    System.out.print("{ ");
    for(int i =0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.print("}");
  }
  public static void insert(int arr[],int pos,int ele)
  {
    for(int i=arr.length-2;i>=pos-1;i--)
    {
      arr[i+1]=arr[i];
      }
      arr[pos-1]=ele;
    }
    public static void deletion(int arr[],int pos)
    {
      
      for(int i=pos-1;i<arr.length-1;i++)
      {
            arr[i]=arr[i+1];
      }
    }
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the range of array ");
         int n=in.nextInt();
        int arr[]=new int[n];
        
        
        while(true)
        {
          System.out.println("\nMenu :\n"+
          "1:- Create\n"+
          "2:- Display\n"+
          "3:- Insertion\n"+
          "4:- Deletion\n"+
          "5:- Exit");
          System.out.println("Enter your choise ");
          int ch=in.nextInt();
        switch(ch)
        {
        case 1:
        {
          create(arr,n);
          break;
        }
        case 2:
        {
          display(arr);
          break;
        }
        case 3:
        {
        System.out.println("Enter the position and element to be added respectively ");
        int pos=in.nextInt();
        int ele=in.nextInt();
        insert(arr,pos,ele);
        System.out.print("{ ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("}");
        break;
      }
      case 4:
      {
        System.out.println("Enter the postion from which element has to be deleted ");
        int pos=in.nextInt();
          System.out.println("The array being deleted ");
          deletion(arr,pos); 
          System.out.print("{ ");
          for(int i=0;i<arr.length-1;i++)
          {
              System.out.print(arr[i]+" ");
          }
          System.out.print("}");
          break;
      }
      case 5:
      break;
      default:
      System.out.println("Invalid choises ");
      break;
    }
    if(ch==5)
    {
      break;
    }
  }


    }
    
}
