
public class Loader
{
    public static void main(String[] args)
    {
        int milkAmount = 1000; // ml
        int powderAmount = 400; // g
        int eggsCount = 3; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (pancakesAllowed(milkAmount, powderAmount, eggsCount, sugarAmount, oilAmount, appleCount))
        {
            System.out.println("Pancakes");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if (omletteAllowed(milkAmount, powderAmount, eggsCount, sugarAmount, oilAmount, appleCount))
        {
            System.out.println("Omelette");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (applePieAllowed(milkAmount, powderAmount, eggsCount, sugarAmount, oilAmount, appleCount))
        {
            System.out.println("Apple pie");
        }
    }

    private static Boolean pancakesAllowed (int milkAmount, int powderAmount, int eggsCount,
                                            int sugarAmount, int oilAmount, int appleCount)
    {
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30)
        {
            return Boolean.TRUE;
        }
        else
        {
            return Boolean.FALSE;
        }
    }

    private static Boolean omletteAllowed (int milkAmount, int powderAmount, int eggsCount,
                                           int sugarAmount, int oilAmount, int appleCount)
    {
        if (powderAmount >= 5 && eggsCount >= 5 && milkAmount >= 300 )
        {
            return Boolean.TRUE;
        }
        else
        {
            return Boolean.FALSE;
        }
    }

    private static Boolean applePieAllowed(int milkAmount, int powderAmount, int eggsCount,
                                           int sugarAmount, int oilAmount, int appleCount)
    {
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount>= 4)
        {
            return Boolean.TRUE;
        }
        else
        {
            return Boolean.FALSE;
        }
    }
}