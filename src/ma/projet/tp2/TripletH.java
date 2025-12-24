package ma.projet.tp2;

import java.util.Arrays;
import java.util.List;

/**
 * Classe générique TripletH pour trois objets de types potentiellement distincts.
 * @param <A> type du premier élément
 * @param <B> type du second élément
 * @param <C> type du troisième élément
 */
public class TripletH<A, B, C> {
    private final A premier;
    private final B second;
    private final C troisieme;

    /** Constructeur principal */
    public TripletH(A premier, B second, C troisieme) {
        this.premier   = premier;
        this.second    = second;
        this.troisieme = troisieme;
    }

    /** Getters */
    public A getPremier()   { return premier; }
    public B getSecond()    { return second; }
    public C getTroisieme() { return troisieme; }

    /** Affiche le contenu du triplet */
    public void affiche() {
        System.out.println("TripletH : [" 
            + premier + ", " 
            + second  + ", " 
            + troisieme + "]");
    }

    /** Retourne les éléments sous forme de List<Object> */
    public List<Object> toList() {
        return Arrays.asList(premier, second, troisieme);
    }

}
