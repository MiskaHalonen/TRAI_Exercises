package Viikko_3;

import java.util.LinkedList;
import java.util.ListIterator;

public class TRAI_24_X3_skeleton implements TRAI_24_X3 {
    //                        ^^^^^
    //                   own userid here

    /**
     * SELF-EVALUATION HERE:
     *  Ensiksi tehtävä vaikutti vaikealta mutta
     *  Hetken tuota list-iteratoria googlailtuani tehtävästä muuttui
     *  varsin inhimillisempi tehtävä
     *
     *  ensin tosin meinasi unohtua vielä lopussa lisätä yli jääneet alkiot
     *
     *
     */


    /**
     * Add all elements to a sorted list.
     * @param A The list that will get new elements. In ascending order.
     * @param B The elements that will be added. In ascending order.
     * @param <E> element type
     */
    @Override
    public <E extends Comparable<? super E>> void addAllSorted(LinkedList<E> A, LinkedList<E> B) {
        // TODO

        ListIterator<E> itA = A.listIterator();
        ListIterator<E> itB = B.listIterator();

        while (itB.hasNext()) {
            E arvoB = itB.next();

            while (itA.hasNext()) {
                E arvoA = itA.next();

                if (arvoA.compareTo(arvoB) >= 0) {
                    itA.previous();
                    itA.add(arvoB);
                    break;
                }
            }


            if (!itA.hasNext()) {
                itA.add(arvoB);
            }
        }
    }


}