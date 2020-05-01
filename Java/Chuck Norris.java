import java.util.*;

/**
 * Program  : Chuck Norris
 * Goal     : https://www.codingame.com/training/easy/chuck-norris
 */
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine(); // input
        String binaryStr = "";
        // convert String into binaryStr
        for (char letter : text.toCharArray()) {
            String charToBin = Integer.toBinaryString(letter);
            while (charToBin.length() < 7) {
                charToBin = "0" + charToBin;
            }
            binaryStr += charToBin;
        }
        // convert binStr into Chuck Norris notation
        String result = "";
        char lastChar = '2';
        for (char letter : binaryStr.toCharArray()) {
            if (letter == lastChar) {
                result += "0";
            } else {
                if (lastChar != '2') {
                    result += " ";
                }
                lastChar = letter;
                if (lastChar == '0') {
                    result += "0";
                }
                result += "0 0";
            }
        }
        System.out.println(result);
    }
}