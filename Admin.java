package ds;

public class Admin {
	private String nom;
    private String ID;

    public Administrateur(String nom, String ID) {
        this.nom = nom;
        this.ID = ID;
    }

    public void gererUtilisateurs() {
        
        System.out.println("Gestion des utilisateurs par l'administrateur " + nom);
    }

    public void assurerCohérenceDonnees() {
        
        System.out.println("Assurance de la cohérence des données par l'administrateur " + nom);
    }

    public void maintenirPlateforme() {
       
        System.out.println("Maintenance de la plateforme par l'administrateur " + nom);
    }
}

}
