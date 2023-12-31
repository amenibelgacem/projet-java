package ds;

public class Enseignant {
	private String nom;
    private String ID;

    public Enseignant(String nom, String ID) {
        this.nom = nom;
        this.ID = ID;
    }

    public void planifierContenus() {
        
        System.out.println("Planification des contenus par l'enseignant " + nom);
    }

    public void attribuerTravaux() {
        
        System.out.println("Attribution de travaux par l'enseignant " + nom);
    }

    public void evaluerProgression() {
        
        System.out.println("Évaluation de la progression des étudiants par l'enseignant " + nom);
    }
}

}
