import java.util.Scanner;
public class uppercasewordb {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        String str1=" ";
        str=' '+str+' ';
        for(int i=0;i<str.length()-1;i++)
        {
            char chr=str.charAt(i);
            if(Character.isWhitespace(chr))
            str1=str1+Character.toUpperCase(str.charAt(i+1));
            else
            str1=str1+str.charAt(i+1);
        }
        System.out.println("The updated string is "+str1.trim());
        in.close();
    }
    
}
