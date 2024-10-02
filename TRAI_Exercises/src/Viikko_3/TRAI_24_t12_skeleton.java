package Viikko_3;

import fi.uef.cs.tra.ListNode;
import fi.uef.cs.tra.TraLinkedList;

import java.util.Random;

public class TRAI_24_t12_skeleton {
    public static void main(String[] args) {

        Random rnd = new Random();
        // input size
        int N = 10;
        if (args.length > 0)
            N = Integer.parseInt(args[0]);

        // seed
        int siemen = N;
        if (args.length > 1)
            siemen = Integer.parseInt(args[1]);

        rnd.setSeed(siemen);

        // test a couple of inputs
        TraLinkedList<String> L = randomStringList(rnd, N, 4, 1);
        System.out.println("\nInput: " + listToString(L));
        removeConsecutiveDuplicates(L);
        System.out.println("Output: " + listToString(L));

        L = randomStringList(rnd, N, 3, 1);
        System.out.println("\nInput: " + listToString(L));
        removeConsecutiveDuplicates(L);
        System.out.println("Output: " + listToString(L));


        L = randomStringList(rnd, N, 2, 1);
        System.out.println("\nInput: " + listToString(L));
        removeConsecutiveDuplicates(L);
        System.out.println("Output: " + listToString(L));

        L = randomStringList(rnd, N, 1, 1);
        System.out.println("\nInput: " + listToString(L));
        removeConsecutiveDuplicates(L);
        System.out.println("Output: " + listToString(L));




    }



    static public <E> void removeConsecutiveDuplicates(TraLinkedList<E> L) {

        // TODO
        ListNode<E> p = L.first();

        while(p != L.last()){
            ListNode<E> q = p.next();
            if(p.getElement().equals(q.getElement())){
                L.remove(q);
            }
            else{
                p=q;
            }
        }


    }




    public static TraLinkedList<String> randomStringList(Random r, int n, int s, int len) {
        TraLinkedList<String> L = new TraLinkedList<>();

        for (int i = 0; i < n; i++)
            L.insert(L.EOL, randomString(r, len, s));

        return L;
    }

    public static String randomString(Random r, int len, int s) {
        char[] C = new char[len];
        for (int i = 0; i < len; i++)
            C[i] = (char) (r.nextInt(s) + 'a');
        return new String(C);
    }

    public static  <E> String listToString(TraLinkedList<E> L) {
        StringBuilder sb = new StringBuilder();
        sb.append("( ");
        ListNode<E> n = L.first();
        while (n != L.EOL) {
            sb.append(n.getElement());
            sb.append(" ");
            n = n.next();
        }
        sb.append(")");
        return sb.toString();
    }


}