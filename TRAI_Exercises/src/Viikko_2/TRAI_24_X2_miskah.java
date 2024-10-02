package Viikko_2;

import java.util.ArrayList;

public class TRAI_24_X2_miskah implements TRAI_24_X2 {
    //                  ^^^^^
    //             own userid here

    /**
     * SELF-EVALUATION HERE:
     *
     *Omasta mielestä sain toimivan ja tehokkaan algoritmin joka toimii lineaarisesti sillä se käy
     * molemmat listat vain kerran läpi. tehtävän tekoon meni reilusti aikaa
     * hyvä suunnittelu auttoi
     *
     */

    /**
     * Difference of two lists that are in ascending order.
     *
     * Returns a new list that contains all the elements that are in list L1
     * but are not in list L2. If an element is in L1 several times, but not in list L2 at all,
     * it will be in result list as many times as it is in list L1.
     * If an element is in L2 at least once, it will not be in result list.
     * Result list will be in ascending order.
     * If either of the lists is not in ascending order, result can be anything.
     * @param A first input list, elements in ascending order
     * @param B second input list, elements in ascending order
     * @return difference list, elements in ascending order
     */
    @Override
    public ArrayList<Integer> differeceOfGrowingLists(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<Integer> result = new ArrayList<>();

        int index = 0;
        for(int i = 0; i < A.size(); i++ ){
            // Jos olemme käyneet läpi kaikki B-listan elementit lisätään alkio tuloksiin
            if(index >= B.size()) {
                result.add(A.get(i));
            }
            // Jos A:n elementti on pienempi kuin B:n nykyinen elementti lisätään se tuloksiin
            else if(A.get(i) < B.get(index)){
                result.add(A.get(i));
            }
            // Jos A:n elementti on suurempi, päivitetään B:n indeksiä
            else if(A.get(i) > B.get(index)){
                while(index < B.size() && A.get(i) > B.get(index)){
                    index++;
                }
                if(index >= B.size() || A.get(i) < B.get(index)){
                    result.add(A.get(i));
                }
            }
        }
        // make a careful plan _before_ you write anything here
        // then transfer the plan to working code

        // use the fact that the lists are in ascending order _already_ in the plan!

        return result;
    }

}