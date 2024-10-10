package Viikko_5;

// TRAI_24_t22_23.java SJ

import java.util.*;

public class TRAI_24_t22_23_skeleton {

    public static void main(String[] args) {

        int N = 6;
        if (args.length > 0)
            N = Integer.parseInt(args[0]);

        Set<Set<Integer>> SS = new HashSet<>();

        Random r = new Random(N + 1);
        System.out.println("Inputs:");
        for (int i = 0; i < N; i++) {
            Set<Integer> S = new HashSet<>();
            for (int j = 0; j < N; j++) {
                S.add(r.nextInt(N * 2));
            }
            SS.add(S);
            System.out.println("S" + i + ": " + S);
        }

        Set<Integer> result = union(SS);
        System.out.println("\nUnion of all: " + result);
        System.out.println();

        result = inOneOnly(SS);
        System.out.println("InOneOnly: " + result);
        System.out.println();


        LinkedList<Set<Integer>> LS = new LinkedList<>(SS);
        System.out.println("List of sets:");
        printByLines(LS);

    } // main()

    /**
     * Print collection element/line
     *
     * @param CC  input collection
     * @param <E> element type
     */
    static <E> void printByLines(Collection<E> CC) {
        System.out.println("(");
        for (E x : CC) {
            System.out.println(x.toString());
        }
        System.out.println(")");
    }

    /**
     * 22. Write an algorithm that takes as a parameter a set of sets (Set<Set<E>>) and returns
     * as a set (Set<E>) all the elements that are in one (or more) of the input sets. In other
     * words, the union of the sets. Hint: use a foreach iteration and set operations. What is
     * the time complexity of your algorithm?
     *
     * @param SS  set of sets
     * @param <E> element type of sets
     * @return all elements that appear in one or more of the sets
     */
    public static <E> Set<E> union(Set<Set<E>> SS) {
        Set<E> result = new HashSet<>();

        // TODO
        for (Set<E> set : SS) {
            result.addAll(set);

        }

        return result;
    }

    /**
     * 23. Write an algorithm that takes as a parameter a set of sets (Set<Set<E>>) and returns
     * as a set (Set<E>) all the elements that appear in exactly one of the input sets. Elements
     * that appear in more than one of the input sets should not be included in the result. Do
     * not modify the input sets. Hint: Use a foreach iteration and a map. What is the time
     * complexity of your algorithm?
     *
     * @param SS  set of sets
     * @param <E> element type of sets
     * @return all elements that appear in exactly one of the sets
     */
    public static <E> Set<E> inOneOnly(Set<Set<E>> SS) {
        Set<E> result = new HashSet<>();

        // TODO

        return result;
    } // inOneOnly



} // class