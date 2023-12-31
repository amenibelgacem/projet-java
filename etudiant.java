package ds;

public class etudiant {
	    private String nom;
	    private String ID;
	    private String classe;

	    public Etudiant(String nom, String ID, String classe) {
	        this.nom = nom;
	        this.ID = ID;
	        this.classe = classe;
	    }

	    public void consulterInfosCours() {
	        
	        System.out.println("Consultation des informations de cours par l'étudiant " + nom);
	    }

	    public void participerDiscussions() {
	        
	        System.out.println("Participation aux discussions en ligne par l'étudiant " + nom);
	    }

	    public void consulterAnnonces() {
	        
	        System.out.println("Consultation des annonces importantes par l'étudiant " + nom);
	    }
	}
}
