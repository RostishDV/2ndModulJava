public class Main
{
    public static void main(String[] args)
    {
        int firstAge = 25;
        int secondAge = 20;
        int thirdAge = 15;

        int min = -1;
        int max = -1;
        int mid = -1;
       
        if (firstAge >= secondAge && firstAge >= thirdAge)
        {
            max = firstAge;
            if (secondAge >= thirdAge)
            {
                mid = secondAge;
                min = thirdAge;
            }
            else
            {
                mid = thirdAge;
                min = secondAge;
            }
        }
        else if (secondAge >= firstAge && secondAge >= thirdAge)
        {
            max = secondAge;
            if (firstAge >= thirdAge)
            {
                mid = firstAge;
                min = thirdAge;
            }
            else
            {
                mid = thirdAge;
                min = firstAge;
            }
        }
        else
        {
            max = thirdAge;
            if (firstAge >= secondAge)
            {
                mid = firstAge;
                min = secondAge;
            }
            else
            {
                mid = secondAge;
                min = firstAge;
            }
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + mid);
        System.out.println("Maximum age: " + max);
    }
}
