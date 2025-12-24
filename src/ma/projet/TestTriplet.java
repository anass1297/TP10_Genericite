package ma.projet;

public class TestTriplet {

    public static void main(String[] args) {

        Triplet<Integer> t1 = new Triplet<>(1, 2, 3);
        Triplet<Integer> t2 = new Triplet<>(1, 2, 3);

        t1.affiche();

        Triplet<Integer> tSwap = t1.swap();
        tSwap.affiche();   // [2, 1, 3]

        System.out.println("t1 equals t2 ? " + t1.equals(t2)); // true

      
    }
}
