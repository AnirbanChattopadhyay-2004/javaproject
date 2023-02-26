import java.util.Scanner;
public class Craps_Game {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p1,p2,pf,point,c=0,sf=0;
        do
        {
            pf=0;
            System.out.println("Roll the first die " );
            p1=in.nextInt();
            System.out.println("Roll the second die ");
            p2=in.nextInt();
             System.out.println("You rolled "+p1+" and "+p2);
             pf=p1+p2;// Each time storing the sum of die.
             point=0;
             
            
             sf=sf+pf;// storing the sum of die to check whether two consecutive dies are same or not.
            if(c==2) 
            sf=0;
            if(c==0)
            {
            switch(pf)//checking for the win or lose probablility.
            {
                case 2:
                case 3:
                case 12:
                {
                System.out.println("You lose ");
                break;
                }
                case 7:
                case 11:
                {
                    
                                       
                System.out.println("You win");
                break;
                }
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                {
                point =pf;//storing the point.
                System.out.println("Point is "+point);
               
                break;
                }
                
            }
        }
        else{
            if(pf==7){
            System.out.println("You lose ");
            }
            else
            {
            System.out.println("You Win ");

            }
        }
            c++;//counter to check whether a round is over or not.
            
        }
        while(pf!=7 && (sf != 2*point)&&c!=2);//checking the condition for program to run.
        
    }
}
