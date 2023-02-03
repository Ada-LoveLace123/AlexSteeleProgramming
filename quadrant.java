import java.util.*;
public class quadrant
{
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter x ye olden coordinate");
        int x = SC.nextInt();
        System.out.println("Enter y ye olden coordinate");
        int y = SC.nextInt();
        if (x < 0 && y < 0)
        {
            System.out.println("Quadrant# 3");
        }
        else if (x > 0 && y > 0)
        {
            System.out.println("Quadrant# 1");
        }
        else if (x < 0 && y > 0)
        {
            System.out.println("Quadrant# 2");
        }
        else
        {
            System.out.println("Quadrant# 4");
        }
    }}
