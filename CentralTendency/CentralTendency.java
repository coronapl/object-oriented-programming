/*******************************************************************************
*    Author: coronapl
*    Class: CentralTendency
*    Description:
*    Central Tendency class with methods for calculating the mean,
*    the median and the mode.
*******************************************************************************/

import java.util.*;

public class CentralTendency {

    private int[] data;

    public CentralTendency (int[] data) {
        this.data = data;
    }

    public float mean () {

        int sum = 0;

        for (int i = 0; i <= data.length-1; i++) {
            sum += data[i];
        }
        return (sum / data.length);
    }

    public int median () {

        int result = 0;
        Arrays.sort(data);

        if (data.length % 2 == 0) {
            result = ((data[data.length / 2] + data[(data.length + 1)/ 2]) / 2);
            return result;
        } else {
            return (data[data.length / 2]);
        }
    }

    public int mode () {

        int mode = 0;
        int sum = 0;
        int max = 0;

        for (int i = 0; i <= data.length-1; i++) {
            for (int j = 0; j <= data.length-1; j++) {
                if (data[i] == data[j]) {
                    sum++;
                }
            }

            if (sum >= max) {
                max = sum;
                mode = data[i];
            }
        }
        return mode;
    }
}
