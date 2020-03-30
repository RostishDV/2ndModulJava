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

        boolean firstAgeIsSmallest = firstAge <= secondAge && firstAge <=thirdAge;
        boolean secondAgeIsSmallest = secondAge <= firstAge && secondAge <= thirdAge;
        if (firstAgeIsSmallest)
        {
            if (secondAge >= thirdAge)
            {
                min = firstAge;
                mid = thirdAge;
                max = secondAge;
            }else
            {
                min = firstAge;
                mid = secondAge;
                max = thirdAge;
            }
        }else if (secondAgeIsSmallest)
        {
            if (firstAge >= thirdAge)
            {
                min = secondAge;
                mid = thirdAge;
                max = firstAge;
            }else
            {
                min = secondAge;
                mid = firstAge;
                max = thirdAge;
            }
        }else
        {
            if (firstAge >= secondAge)
            {
                min = thirdAge;
                mid = secondAge;
                max = firstAge;
            }else
            {
                min = thirdAge;
                mid = firstAge;
                max = secondAge;
            }
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + mid);
        System.out.println("Maximum age: " + max);
    }
}
