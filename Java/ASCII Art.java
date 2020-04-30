package Java;

import java.util.*;

class Solution {

    public static void main(String args[]) {
        // large and height inputs
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        in.nextLine();
        int H = in.nextInt();
        in.nextLine();
        // get the String input and transform to upper case
        String word = in.nextLine().toUpperCase();

        for (int i = 0; i < H; i++) {
            String row = in.nextLine();
            for (int j = 0; j < word.length(); ++j) {
                // take every char of the word and conversion of char in int
                int charInt = word.charAt(j) - 'A';
                if (charInt < 0 || charInt >= 26) {
                    charInt = 26;
                }
                // print the row
                System.out.print(row.substring(L * charInt, L * (charInt + 1)));
            }
            System.out.println();
        }
    }
    
}