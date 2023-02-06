
/*                                                                                   AFFINE CIPHER :-
 *                                                                      :- A PROJECT DONE BY ANIRBAN CHATTOPADHYAY
 *                                                                      :- SECTION - 2241003    BRANCH :- CSE
 *                                                                      :- ITER SOA DEEMED UNIVERSITY
 */



import java.util.Scanner;
public class affinecipher 
{
    
    
    public static String encryption(String str,int k1,int k2)        //function prototype.
    {
        int t,c;
        String str1="abcdefghijklmnopqrstuvwxyz";       //taking all the alphabets in the string.
            String str2="";
            String st=str.toLowerCase();        //converting the string to lower case.
           for(int i=0;i<st.length();i++)
           {
            t=0;
            c=0;
            if(st.charAt(i)==' ')       //checking for white spaces.
                str2=str2+' ';
                 for(int j=0;j<=25;j++)
                 {
                   

                    if(st.charAt(i)==str1.charAt(j))        //comparing the two strings.
                    {
                        t=(j*k1)%26;
                        c=(t+k2)%26;
                        if(Character.isUpperCase(str.charAt(i)))        //checking for uppercase letter.
                            str2=str2+Character.toUpperCase(str1.charAt(c));
                        else
                            str2=str2+str1.charAt(c);       //concatinating string.
                        break;      //applying break statement to come out of loop when required.
                    }

                 }
            }
            return str2;        //returning the required string.
         }

    public static String decryption(String str,int k1,int k2)
    {
        int r1=26,r2=k1,t1=0,t2=1,t,r,T,c,q;
        String str2="";
        String str1="abcdefghijklmnopqrstuvwxyz";       //taking all the alphabets in the string.
        while(r1!=1)        //running loop till r1==1
        {
            q=r1/r2;        //finding quotient
            r=r1%r2;        //finding remainder
            r1=r2;          //left swapping
            r2=r;           //left swapping
            t=t1-(q*t2);    //finding value of t
            t1=t2;          //left swapping
            t2=t;           //left swapping
            
           
        }


        int k1i=t1;         //finding inverse of key1
        if(k1i<0)
            k1i=k1i+26;
        
            
            String st=str.toLowerCase();            //cpnverting to lowercase
        for(int i=0;i<st.length();i++)
        {
            T=0;
            c=0;
            if(st.charAt(i)==' ')
                str2=str2+' ';                      //additions of blanks
            for(int j=0;j<=25;j++)
            {
                if(st.charAt(i)==str1.charAt(j))
                    {
                        T=(j-k2)%26;                //main part of decrypting message
                        c=(T*k1i)%26;               //main steps
                      
                        if(c<0)
                            c=c+26;
                        if(Character.isUpperCase(str.charAt(i)))
                            str2=str2+Character.toUpperCase(str1.charAt(c));            //checkin and converting to desired cases
                        else
                            str2=str2+str1.charAt(c);           //concatinating string
                        break;
                    }
            }
        }
        return str2;

    }

    public static void main(String[] args) throws InterruptedException {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the message ");
            String str=in.nextLine();
            System.out.println("Enter the key 1");
            int k1=in.nextInt();
            System.out.println("Enter the key 2");
            int k2=in.nextInt();
            String enc=encryption(str,k1,k2);       //function call with arguments.
            System.out.println("The cipher text is "+enc);
            System.out.print("Cipher text being decrypted");
            for(int i=1;i<=10;i++)
            {
                System.out.print(".");
                Thread.sleep(100);
            }
            System.out.println();
            System.out.println("The plain text received by receiver after decryption is "+decryption(enc,k1,k2)+".");

            in.close();
        
    }
        
}
    

