public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        Integer sum = sumDigits(1234567890);

        System.out.println(sum);

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;

        System.out.println("Byte min value is: " + byteMinValue);
        System.out.println("Byte max value is: " + byteMaxValue);

        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;

        System.out.println("Short min value is: " + shortMinValue);
        System.out.println("Short max value is: " + shortMaxValue);

        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer min value is: " + intMinValue);
        System.out.println("Integer max value is: " + intMaxValue);

        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;

        System.out.println("long min value is: " + longMinValue);
        System.out.println("long max value is: " + longMaxValue);

        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;

        System.out.println("Float min value is: " + floatMinValue);
        System.out.println("Float max value is: " + floatMaxValue);

        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;

        System.out.println("Double min value is: " + doubleMinValue);
        System.out.println("Double max value is: " + doubleMaxValue);

    }

    public static Integer sumDigits(Integer number)
    {
        Integer sumTotal = 0;

        for (int i = 0; i < number.toString().length(); i++)
        {
            sumTotal += (number.toString().charAt(i) - '0');
        }

        return sumTotal;
    }
}
