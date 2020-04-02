public class Main
{
    public static void main(String[] args)
    {
        //for
        for (int i = 200000; i <= 235000 ; i ++)
        {
            if (i <= 210000 || i >= 220000)
            {
                System.out.println("Ticket number is: " + i);
            }
        }
    }
}
