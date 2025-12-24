package ma.projet.tp2;


import java.util.List;

public class TestTripletH {
    public static void main(String[] args) {
        // Triplet hétérogène : Integer, String, Double
        TripletH<Integer, String, Double> th =
            new TripletH<>(42, "Answer", 3.14);
        th.affiche();  // affiche [42, Answer, 3.14]

        // Affichage via toList()
        List<Object> elements = th.toList();
        System.out.println("Liste : " + elements);

        // Exemple avec des objets métiers : String, Integer, Boolean
        TripletH<String, Integer, Boolean> th2 =
            new TripletH<>("Alice", 30, true);
        th2.affiche();
        System.out.println("Liste : " + th2.toList());
    }
}
