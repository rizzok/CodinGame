package Java;

import java.util.*;

class Solution {
    public static void main(String args[]) {
        // declaration of HashMap
        Map<String, String> hmMime = new HashMap<>();
        // scanner declaration and inputs
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            // assigning inputs in HashMap
            hmMime.put(EXT, MT);
        }
        in.nextLine();
        // analyze of all filenames
        for (int i = 0; i < Q; i++) {
            // filenames inputs
            String FNAME = (in.nextLine()).toLowerCase(); // One file name per line.
            // get extension of file
            String extension = "";
            if (FNAME.contains(".")) {
                extension = FNAME.substring(FNAME.lastIndexOf(".") + 1);
            }
            // show Mime Type corresponding to extension or "UNKNOWN" if not
            if (!extension.equals("")) {
                String mimeType = hmMime.get(extension);
                if (mimeType != null && extension.length() <= 10) {
                    System.out.println(mimeType);
                } else {
                    System.out.println("UNKNOWN");
                }
            } else {
                System.out.println("UNKNOWN");
            }
        }
    }
}