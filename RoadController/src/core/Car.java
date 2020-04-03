package core;

public class Car
{
    //создаётся строка number
    //
    public String number;
    //создаётся целое число height
    public int height;
    //создаётся число с плавающей запятой weight
    public double weight;
    //создаётся логичаеская переменная hasVehicle
    public boolean hasVehicle;
    //создаётся логическая переменная isSpecial
    public boolean isSpecial;

    public String toString()
    {
        //создаётся строка special
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}