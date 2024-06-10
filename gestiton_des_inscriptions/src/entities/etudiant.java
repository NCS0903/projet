package entities;

public class etudiant {
    private int id;
    private String nom; 
    private String matricule ; 
    private String tuteur;

    professeur professeur;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getTuteur() {
        return tuteur;
    }
    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
    public professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(professeur professeur) {
        this.professeur = professeur;
    }
    
}
