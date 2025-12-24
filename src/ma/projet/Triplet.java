package ma.projet;

import java.util.Objects;

/**
 * Classe générique Triplet pour stocker trois objets du même type.
 * @param <T> le type des éléments
 */
public class Triplet<T> {

    private final T premier;
    private final T second;
    private final T troisieme;

    public Triplet(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public T getPremier() {
        return premier;
    }

    public T getSecond() {
        return second;
    }

    public T getTroisieme() {
        return troisieme;
    }

    /** Affichage du triplet */
    public void affiche() {
        System.out.println("Triplet : [" 
            + premier + ", " 
            + second + ", " 
            + troisieme + "]");
    }

    
    public Triplet<T> swap() {
        return new Triplet<>(second, premier, troisieme);
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triplet<?> other)) return false;
        return Objects.equals(premier, other.premier)
            && Objects.equals(second, other.second)
            && Objects.equals(troisieme, other.troisieme);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(premier, second, troisieme);
    }
}
