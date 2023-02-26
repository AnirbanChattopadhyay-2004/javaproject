import java.util.Scanner;
public class systemconverter {
    public static int dectobin(int n)
    {
        int i=0,b=0;
        String str="",str1="";
        while(n!=0)
        {
            int a=n%2;
            str=str+a;
            //b=b+a*(int)Math.pow(10,i);
            //i++;
            n=n/2;
        }
        
        for(i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);       
        }
        b=Integer.parseInt(str1);

        return b;
    } 
    public static int bintodec(int n1)
    {
        int i=0,s=0,d=0;


        while(n1!=0)
        {
            d=n1%10;
            s=s+d*(int)Math.pow(2,i);
            n1=n1/10;
            i++;
            }
        return s;
    }
    public static void main(String args[])
    {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n=in.nextInt();
        
        int b=dectobin(n);
        System.out.println("The binary number is "+b);
        System.out.println("Enter a binary number ");
        int n1=in.nextInt();
        int c=bintodec(n1);
        System.out.println("The decimal number of binary number is "+c);
        in.close();
    }
}
