/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise9 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length? ");
        String length = in.nextLine();
        int len = 0;
        try {
            len = Integer.parseInt(length);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

        System.out.print("What is the width? ");
        String width = in.nextLine();
        int wid = 0;
        try {
            wid = Integer.parseInt(width);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

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
