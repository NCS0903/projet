package entities;

import java.util.ArrayList;

public class classe {
    private int id;
    private String libelle;
    
    ArrayList<etudiant> etudiantsList=new ArrayList<>();
    
    public ArrayList<etudiant> getetudiantList() {
        return etudiantsList;
    }
    public void setetudiantList(ArrayList<etudiant> compteList) {
        this.etudiantsList = getetudiantList();
    }

    public classe(){
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public void setNumero(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNumero'");
    }
    public void setAdresse(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAdresse'");
    }
    public void setTelephone(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTelephone'");
    } 
    
}
