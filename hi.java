//program for printing inverted half pyramid
public class hi {
    public static void main(String args[])
    {
        //inner loop is for rows
     for(int i =5;i>=1;i--)
        {
            for(int j=1; j<=i ;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}             

