package ds;
public class main {
	public class Main {
	    public static void main(String[] args) {
	        Etudiant etudiant = new Etudiant("Alice", "123", "Informatique de Gestion");
	        Enseignant enseignant = new Enseignant("Professeur Smith", "456");
	        Administrateur admin = new Administrateur("Admin1", "789");

	        etudiant.consulterInfosCours();
	        enseignant.planifierContenus();
	        admin.gererUtilisateurs();
	    }
	}

}
