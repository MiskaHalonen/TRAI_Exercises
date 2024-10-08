package Viikko_5;
import java.util.HashSet;
import java.util.Set;

public class TRAI_24_X5_miskah implements TRAI_24_X5 {
    //                        ^^^^^
    //                   own userid here

    /**
     * SELF-EVALUATION HERE:
     *      Tein t21 ensin joten tämä sujui aika nopeasti
     *      aika vaativuus O(n) hashsetin toimintoja käyttämällä
     *
     *
     *
     */

    /**
     * One-in-three union.
     * Creates and returns a new set that contains those elements that
     * are contained in exactly one of the three input sets.
     * If no element fulfills the requirement, returns a new empty set.
     * Does not modify input sets.
     * @param s1    input set
     * @param s2    input set
     * @param s3    input set
     * @param <E>   element type
     * @return      result set
     */
    @Override
    public <E> Set<E> oneInThree(Set<E> s1, Set<E> s2, Set<E> s3) {

        Set<E> result = new HashSet<>();


        Set<E> onlyS1 = new HashSet<>(s1);
        onlyS1.removeAll(s2);
        onlyS1.removeAll(s3);

        Set<E> onlyS2 = new HashSet<>(s2);
        onlyS2.removeAll(s1);
        onlyS2.removeAll(s3);

        Set<E> onlyS3 = new HashSet<>(s3);
        onlyS3.removeAll(s1);
        onlyS3.removeAll(s2);

        result.addAll(onlyS1);
        result.addAll(onlyS2);
        result.addAll(onlyS3);

        return result;
    }
}