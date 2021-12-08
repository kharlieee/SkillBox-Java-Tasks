package core;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setHasVehicle(boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle;
    }

    public boolean getHasVehicle()
    {
        return hasVehicle;
    }


    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
                special + "Автомобиль с номером " + number +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}