package Viikko_5;
// TRAI_24_t21.java SJ

import fi.uef.cs.tra.TraSet;

import java.util.Collection;
import java.util.Random;

public class TRAI_24_t21_miskah {

    public static void main(String[] args) {

        int N = 10;
        if (args.length > 0)
            N = Integer.parseInt(args[0]);

        TraSet<Integer> S1 = new TraSet<>();
        TraSet<Integer> S2 = new TraSet<>();
        TraSet<Integer> S3 = new TraSet<>();

        Random r = new Random(42);
        Integer x, y;
        for (int i = 0; i < N; i++) {
            x = r.nextInt(N + 2);
            y = r.nextInt(N + 2);
            S1.add(x);
            S2.add(x - y);
            S3.add(x + y);
        }

        System.out.println("S1:      " + S1);
        System.out.println("S2:      " + S2);
        System.out.println("S3:      " + S3);

        System.out.println("OneInTreeTRA: " + oneInThree(S1, S2, S3));

    } // main()


    /**
     * 21. Write an algorithm that retrieves from three sets the elements that appear in exactly
     * one of the sets. The algorithm takes three sets as parameters (TraSet) and creates a new
     * set of elements that belong to exactly one of the input sets. In other words, it should not
     * include elements that are present in two or more of the input sets. Do not modify the
     * input sets. Hints: use set operations; itâ€™s not advisable to iterate over the sets element
     * by element. What is the time complexity of your algorithm? Do not use a map (Map)
     * or the java.util.Set.
     *
     * @param A   input set
     * @param B   input set
     * @param C   input set
     * @param <E> element type
     * @return a new set containing the elements that apprear in exactly one input set
     */
    public static <E> TraSet<E> oneInThree(TraSet<E> A, TraSet<E> B, TraSet<E> C) {

        TraSet<E> helpSet1 = new TraSet<E>(A.difference(B.union(C))); //GREEN
        TraSet<E> helpSet2 = new TraSet<E>(B.difference(A.union(C))); //RED
        TraSet<E> helpSet3 = new TraSet<E>(C.difference(A.union(B)));  //BLUE

        TraSet<E> ans = new TraSet<E>(helpSet1.union(helpSet2.union(helpSet3)));

        return ans;




    } //oneInThree()


} // class TRAI_24_t