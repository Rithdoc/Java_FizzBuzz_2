/**
 * Created by Shaun on 3/3/17.
 */
public class FizzBuzz
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println("I am ready!");

        System.out.println("Please input an integer value.  Robot will count down from integer value to 0!");
        System.out.println("Input value on next line:");

        //TODO: User input, but I only have 5 more minute or so, just roll with a standard integer for now
        int countdown = 25;
        while (countdown >= 0)
        {
            if ((countdown % 3 == 0) && (countdown % 5 == 0))
            {
                System.out.println("FIZZBUZZ!!!");
            }
            else if (countdown % 5 == 0)
            {
                System.out.println("BUZZ!!");
            }
            else if (countdown % 3 == 0)
            {
                System.out.println("FIZZ!");
            }
            else
            {
                System.out.println(countdown);
            }
            countdown--;
        }

    }
}
