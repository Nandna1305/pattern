public class he
{
    //program for printing floyd's triangle
    public static void main(String args[]) 
    {
        //assigning value to integer num
    int num = 1;
    {
        //where outer loop works for printing columns
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(num+" " );
                num=num+1;
            }    
               System.out.println(" "); 
        }
    }
    }
}


