public class rose 
{
    //program to print rhombus pattern
    public static void main (String args[]) 
    {
        //inner loop is for managing the no.of.columns and for creating required spaces
        //outer loop is for rows
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
              System.out.print( " ");
            
            }
            //this loop is for printing the asterisk
            for(int k=1;k<=4;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        
        }

    }
    
}

