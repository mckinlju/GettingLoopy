import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        for(int cnt = 0 ; cnt <= 30; cnt++ )
        {
            System.out.println(cnt);
        }

        for(int cnt = 30; cnt >= 0; cnt--)
        {
            System.out.println(cnt);
        }

        for(int cnt = 0; cnt <= 18; cnt = cnt + 3)
        {
            System.out.println(cnt);
        }

        for(int cnt = 10; cnt >= 0; cnt = cnt - 2)
        {
            System.out.println(cnt);
        }

        for(int row = 1; row <= 5; row++)
        {
            for(int col = 1; col <= row; col++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row = 5; row >= 1; row--)
        {
            for(int col = 1; col <= row; col++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row = 1; row <= 5; row++)
        {
            for(int col = 1; col <= 5; col++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;
        boolean done = false;

        do
        {
            System.out.println("Please enter a temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                done = true;
            }
            else
            {

                System.out.println("Please Enter a valid number");
                in.next();
            }
        }while (!done);
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

    }

}