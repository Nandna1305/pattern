public class ji {
    //program for left half pyramid
    public static void main (String args[]) {
        //first loop is for printing rows,second loop is for printing empty spaces
        for (int i=0;i<=5;i++)
        {
            for (int j=5;j>=i;j--)
            {
              System.out.print( " ");
            
            }
            // third loop is for printing asterisk
            for( int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        
        }

    }
    
}
