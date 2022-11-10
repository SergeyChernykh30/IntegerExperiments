public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        Integer sum = sumDigits(1234567890);

        System.out.println(sum);

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
