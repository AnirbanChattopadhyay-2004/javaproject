import java.util.Scanner;
public class anagrams
{
    public static String sort(String str)
    {
        str=str.toUpperCase();
        StringBuilder sb=new StringBuilder(str);
        char chr=' ',chr1=' ',t=' ';
        System.out.println(sb.length());
        for(int i=1;i<sb.length();i++)
        {
          
            for(int j=0;j<sb.length()-i;j++)
            {
                chr=sb.charAt(j);
                chr1=sb.charAt(j+1);
                if(chr>chr1)
                {
                    t=chr;
                    sb.setCharAt(j,chr1);
                    sb.setCharAt(j+1,t);

                }
            }
          
        }
        String str1=sb.toString();
        return str1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the strings ");
        String str1=in.nextLine();
        String str2=in.nextLine();
        if(sort(str1).equals(sort(str2)))
        System.out.println(str1+" and "+str2+" are anagrams ");
        else
        System.out.println(str1+" and "+str2+" are not anagrams ");
        in.close();
    }
}