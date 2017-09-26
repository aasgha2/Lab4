/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * I hate checkstyle.
 */
public class ReclamationProject {
    /**
     * @param a is a string
     * @param b is a string
     * @return string r
     */
    static String doit(final String a, final String b) {
        String aSub = a;
        String bSub = b;
        if (a.length() > b.length()) {
            String c = a;
            aSub = b;
            bSub = c;
            }

        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < aSub.length(); i++) {
            for (int j = aSub.length() - i; j > 0; j--) {
                for (int k = 0; k < bSub.length() - j; k++) {
                    if (aSub.regionMatches(i, b, k, j) && j > r.length()) {
                        r = aSub.substring(i, i + j);
                    }

                        }
                } // Ah yeah
        } return r; }
}
