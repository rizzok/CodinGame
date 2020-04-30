import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Program  : Defibrillators
 * Goal     : Find the closest defibrillator
 */
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float lonUser = stringToFloat(in.next()); // user longitude (in degrees)
        float latUser = stringToFloat(in.next()); // user latitude (in degrees)
        int N = in.nextInt(); // number of defibrillators in the city
        if (in.hasNextLine()) {
            in.nextLine();
        }
        // String array to implement splitted defibrillator data
        String[][] defibrillators = new String[N][6];
        float closestDef = 10000;
        int defNumber = 0;
        for (int i = 0; i < N; i++) {
            String defib = in.nextLine(); // defibrillator data input
            defibrillators[i] = defib.split(";"); // split String into array
            float lonDef = stringToFloat(defibrillators[i][4]);
            float latDef = stringToFloat(defibrillators[i][5]);
            float defDist = distanceD(lonUser, latUser, lonDef, latDef);
            // is this defibrillator closest than the last one ?
            if (defDist < closestDef) {
                closestDef = defDist;
                defNumber = i;
            }
        }
        // show the closest defibrillator
        System.out.println(defibrillators[defNumber][1]);
    }

    /**
     * Distance calculation between user and defibrillator
     * @param lonUser
     * @param latUser
     * @param lonDef
     * @param latDef
     * @return
     */
    public static float distanceD(float lonUser, float latUser, float lonDef, float latDef) {
        double lonA = floatToRadian(lonUser);
        double latA = floatToRadian(latUser);
        double lonB = floatToRadian(lonDef);
        double latB = floatToRadian(latDef);
        double x, y, d;
        x = (lonB - lonA) * Math.cos((latA + latB) / 2);
        y = (latB - latA);
        d = Math.sqrt((x * x) + (y * y)) * 6371;
        return (float) d;
    }

    /**
     * Conversion of inputs in radians
     * @param number
     * @return
     */
    public static double floatToRadian(float number) {
        return number * Math.PI / 180;
    }

    /**
     *  Replacement of ',' by '.' and conversion of String in float
     * @param coordinate
     * @return
     */
    public static float stringToFloat(String coordinate) {
        return Float.parseFloat(coordinate.replace(',', '.'));
    }
}