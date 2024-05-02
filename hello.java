//program for printing right half pyramid 
class hello
{
    public static void main(String args[])
    {
        //inner loop is for column ,outer is for rows
     for(int i =1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}            