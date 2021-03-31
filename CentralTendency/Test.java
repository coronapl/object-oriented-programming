/*******************************************************************************
*    Author: coronapl
*    Class: Test
*    Description:
*    Simple program for calculating the mean, the median and the mode.
*******************************************************************************/

import java.util.*;

public class Test {
    public static void main (String[] args) {


        float mean;
        int median;
        int mode;

        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        CentralTendency thisObj = new CentralTendency(data);

        mean = thisObj.median();
        median = thisObj.median();
        mode = thisObj.mode();

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);

    }
}
