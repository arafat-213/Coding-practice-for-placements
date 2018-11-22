package com.random_shit;

import java.util.Arrays;

/*
* Mr.Woods, an electrician has made some faculty connections of eight street lights in Timberland city.
* The connections are such that if the street lights adjacent to a particular light are both ON (represented as 1)
* or are both OFF (represented as 0), then that street light goes OFF the next night. Otherwise, it remains ON the next night.
* The two street lights at the end of the road have a single adjacent street light,
* so the other adjacent light can be assumed to be always OFF.
* The state of the lights on a particular day is considered for the next day and not for the same day
Due to this fault, the people of the city are facing difficulty in during on the road at night. So they have filed a complaint about this to the Head of the Federal Highway Administration. Based i=on this complaint the head has asked for the report of the state of street lights after M*/
public class StreetLightProblem {
    public static void main(String[] args) {
        int[] cells = {0, 0, 1, 1, 1, 1, 0, 0};
        int days = 7;
        printLightStates(cells, days);
    }

    private static void printLightStates(int cells[], int days) {
        int[] cellsAfter = new int[8];
        for (int d = 0; d < days; d++) {
            for (int i = 0; i < 8; i++) {
                cellsAfter[i] = cells[i];
            }

            for (int j = 1; j < 7; j++) {
                if (cellsAfter[j - 1] == cellsAfter[j + 1])
                    cellsAfter[j] = 0;
                else
                    cellsAfter[j] = 1;
            }

            System.out.println(Arrays.toString(cellsAfter));
        }
    }
}
