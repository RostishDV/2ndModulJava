import java.util.Scanner;

public class Main
{
    //создаются используемые далее константы
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args)
    {
        //расчёт минимальной суммы дохода для инвестирования
        double minimalIncumeToAllowInvestment = ((minInvestmentsAmount / (1 - mainTaxPercent)) + calculateFixedCharges())/(1 - managerPercent);
        System.out.println("Minimal income for investment: " + minimalIncumeToAllowInvestment);
        while(true)
        {
            //выодим текст с пояснением что вводить
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            //получаем введённое значение и приводим его к виду int, после чего записываем в income
            int income = (new Scanner(System.in)).nextInt();

            //проверяем на корректность введённых данных, при выходе за границы диапазона начинается новый цикл
            if(!checkIncomeRange(income)) {
                continue;
            }

            //проводим необходимые подсчёты
            double managerSalary = income * managerPercent;
            double pureIncome = income - managerSalary -
                calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome;
            double pureIncomeAfterTax = pureIncome - taxAmount;

            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount;

            //формируем вывод на экран
            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
            //при налогах ниже нуля будет отображаться 0
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));
            if(pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }


    private static boolean checkIncomeRange(int income)
    {
        if(income < minIncome)
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }


    private static int calculateFixedCharges()
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
