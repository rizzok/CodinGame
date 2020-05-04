import java.util.*;

/**
 * Program  : Horse Racing Duals
 * Goal     : Find the smallest difference between 2 horses power in a list of horses
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nbHorses = in.nextInt(); // number of horses to compare
        int[] horsesPower = new int[nbHorses]; // int array in which will be stored each horse power
        int diff = 1000; // difference between horses power
        for (int i = 0; i < nbHorses; i++) {
            horsesPower[i] = in.nextInt(); // input of each horse power
        }
        Arrays.sort(horsesPower); // sort by power horses
        for (int i = 0; i < nbHorses-1; i++) {
            if (horsesPower[i+1] - horsesPower[i] < diff) {
                diff = horsesPower[i+1] - horsesPower[i]; // store the smallest difference
            }
        }
        System.out.println(diff);
    }
}