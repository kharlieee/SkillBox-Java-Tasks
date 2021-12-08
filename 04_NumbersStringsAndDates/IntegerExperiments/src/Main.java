public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 12345;
        Container container2 = new Container();
        container2.count += 10;
        Container container3 = new Container();
        container3.count += 5059191;
        System.out.println("Number: " + container.count);
        System.out.println("Number count: " + sumDigits(container.count));
        System.out.println("Number: " + container2.count);
        System.out.println("Number count: " + sumDigits(container2.count));
        System.out.println("Number: " + container3.count);
        System.out.println("Number count: " + sumDigits(container3.count));
    }

    public static Integer sumDigits(Integer number) {

        String sNum1 = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < sNum1.length(); i++)
        {
            sNum1.charAt(i);
            sum += Character.getNumericValue(sNum1.charAt(i));
        }
        return sum;
    }
}
