package Viikko_1;

public class TRAI_24_X1_miskah implements TRAI_24_X1 {
    //            ^^^^^
    // own userid here

    /**
     * SELF-EVALUATION HERE:
     *  heti aluksi tehtävä kuulosti helpolta mutta tekeytyikin
     *  hyvin haastavaksi kolmannen vuoden opisklijan ohjeiden jälkeen
     *  päätin toteuttaa tehtävän käyttäen for looppeja lukujen etsimiseen mutta aluksi
     *  käytin if lausekkseissa >= ja <= joka ei toiminut. pitkän tuskan jälkeen ongelma
     *  löytyi ja sain testit läpi
     *
     * lopuksi vielä siistin koodia jotta se on tehokkaampi
     *
     */

    /**
     * Difference between the largest and the smallest element of an integer array.
     * <p>
     * Finds the largest and smallest number in the array, subtract the smallest from the largest,
     * and return the difference as the result.
     * If the array contains only one element, that element is both the largest
     * and smallest, so the result should be 0 (the difference of the number with itself). If the
     * array is empty, return null.
     * <p>
     * You can assume that the array contains only valid integers (i.e., no null values).
     * Do not modify the input array.
     *
     * @param A Input array
     * @return difference of the largest and smallest element, or null if the array is empty.
     */
    @Override
    public Integer maxMinDiff(Integer[] A) {
        if (A.length < 1)
            return null;

        // TODO
        int isoin=A[0];
        int pienin=A[0];

        for (int i = 0; i < A.length; i++) {

            if(A[i]>isoin){
                isoin = A[i];

            }
            if (A[i]<pienin) {
                pienin = A[i];

            }
        }

        return isoin - pienin;

    }
}
