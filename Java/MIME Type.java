package Java;

import java.util.*;

class Solution {

    public static void main(String args[]) {
        // déclaration du HashMap
        Map<String, String> hmMime = new HashMap<>();
        // saisie des entrées
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            // assignation des entrées dans le HashMap
            hmMime.put(EXT, MT);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            // entrée des noms de fichiers
            String FNAME = (in.nextLine()).toLowerCase(); // One file name per line.
            // récupération de l'extention
            String extension = "";
            if (FNAME.contains(".")) {
                extension = FNAME.substring(FNAME.lastIndexOf(".") + 1);
            }

            if (!extension.equals("")) {
                // affichage du MIME correspondant à l'extension
                String rep = hmMime.get(extension);
                if (rep != null && extension.length() <= 10) {
                    System.err.println("FNAME = " + FNAME);
                    System.err.println("extension = " + extension);
                    System.out.println(rep);
                } else {
                    System.out.println("UNKNOWN");
                }
            } else {
                System.out.println("UNKNOWN");
            }
        }

    }
}