package Viikko_1;

public interface TRAI_24_X1 {

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
    Integer maxMinDiff(Integer[] A);

}
