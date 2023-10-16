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
    }

}