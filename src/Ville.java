import java.util.Comparator;

public class Ville implements Comparable<Ville> {

    @Override
    public int compareTo(Ville o) {
        // tri par ordre alphabetique
        //return this.nom.compareTo(o.nom);
        return this.nbHabitants - o.nbHabitants;
    }

    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }



    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }

}
