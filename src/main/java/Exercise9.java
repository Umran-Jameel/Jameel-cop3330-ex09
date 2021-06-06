import java.util.*;

public class Exercise9 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length? ");
        String length = in.nextLine();
        int len = Integer.parseInt(length);

        System.out.print("What is the width? ");
        String width = in.nextLine();
        int wid = Integer.parseInt(width);

        int perGal = 350;
        int sqFeet = len * wid;

        if (sqFeet % perGal != 0)
        {
            System.out.printf("You will need %d gallons of paint to cover %d square feet.", ((sqFeet / perGal) + 1), sqFeet);
        }
        else
        {
            System.out.printf("You will need %d gallons of paint to cover %d square feet.", sqFeet / perGal, sqFeet);
        }
    }
}
