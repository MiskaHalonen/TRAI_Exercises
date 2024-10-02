package Viikko_2;

import java.util.ArrayList;

public interface TRAI_24_X2 {

    /**
     * Difference of two lists that are in ascending order.
     *
     * Returns a new list that contains all the elements that are in list A
     * but are not in list B. If an element is in A several times, but not in list B at all,
     * it will be in result list as many times as it is in list A.
     * If an element is in B at least once, it will not be in result list.
     * Result list will be in ascending order.
     * If either of the lists is not in ascending order, result can be anything.
     * @param A first input list, elements in ascending order
     * @param B second input list, elements in ascending order
     * @return difference list, elements in ascending order
     */
    ArrayList<Integer> differeceOfGrowingLists(ArrayList<Integer> A, ArrayList<Integer> B);

}