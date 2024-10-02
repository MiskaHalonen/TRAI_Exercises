package Viikko_4;

import fi.uef.cs.tra.BTree;
import fi.uef.cs.tra.BTreeNode;

public class TRAI_24_X4_miskah implements TRAI_24_X4 {
    //                        ^^^^^
    //                   own userid here

    /**
     * SELF-EVALUATION HERE:
     *      tehtävä oli todella haastava ja vaati tarkkaa perehtymistä siihen
     *      miten tra kirjasto ja binääripuu toimii, jossain kohtaa sain kuitenkin
     *      ahaa elmyksen siitä miten koodia kannattaa lähteä rakentamaan ja muutaman
     *      versinon jälkee sain kaikki testit läpi. aikavaatimus pysyy mielestäni lineaarisena
     *      sillä se ottaa jokaisen solmun vain kertaalleen tarkastttavaksi.
     *
     *
     */

    /**
     * Are the elements of a tree in in-order or not.
     * You may write additional methods as well as long as you keep this method header unchanged.
     * @param T binary tree to check
     * @return true if the elements are in in-order, false otherwise
     * @param <E> element type
     */


    // määritetään previousnode muuttuja
    private BTreeNode<?> previousNode = null;


    @Override
    public <E extends Comparable<? super E>> boolean isInOrder(BTree<E> T) {
        // Käytetään apumetodia tarkistamaan rekursiivisesti puun järjestys
        previousNode = null; // Nollataan previousNode ennen tarkistusta
        return isInOrderHelper(T.getRoot());
    }


     // Apumetodi, joka suorittaa rekursiivisen inorder-traversaation.

    private <E extends Comparable<? super E>> boolean isInOrderHelper(BTreeNode<E> node) {
        // Jos solmu on tyhjä, palautetaan true (tyhjä solmu ei riko järjestystä)
        if (node == null) {
            return true;
        }

        // Tarkista vasen alipuoli
        if (!isInOrderHelper(node.getLeftChild())) {
            return false;
        }

        // Tarkista nykyisen solmun arvo: sen tulee olla suurempi kuin edellinen vierailtu arvo
        if (previousNode != null && ((E) node.getElement()).compareTo((E) previousNode.getElement()) <= 0) {
            return false;
        }
        // Päivitä edellinen vierailtu solmu nykyiseksi
        previousNode = node;

        // Tarkista oikea alipuoli
        return isInOrderHelper(node.getRightChild());
    }


}