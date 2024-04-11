
import java.util.Scanner;
public class Conditinoal {
    
   public void ifelse(int x)
   {
       if(x>10)
        {
         System.out.println("it is more than "+x);
        }
        else{
          System.out.println("it is less then "+x);
        }
   }
   public void ifelseladder(int x,char gender)
   {
    if((x>=18)&&(gender=='M')){
      System.out.println("you are eligible to vote sir");
    }
    else if((x>18)&&(gender=='F')){
      System.out.println("you are eligible to vote mam");
    }
    else{
      System.out.print("you are not eligible");
    }
    
   } 
    public static void main(String args[])
    {
      Conditinoal t=new Conditinoal();
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      sc.nextLine();
      char c=sc.next().charAt(0);

      t.ifelse(x);
      t.ifelseladder(x,c);
        
    }
}