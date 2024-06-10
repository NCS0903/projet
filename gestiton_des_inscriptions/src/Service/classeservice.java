package Service;

import java.util.List;

import entities.classe;
import repository.Iclasse;

public class classeservice {

    private Iclasse classeRepository;
     
     public classeservice(Iclasse classeRepository) {
        this.classeRepository = classeRepository;
     }
   public List<classe> listercClasse(){
      return classeRepository.selectAll();
   }
   public classe listerclasse(String libelle){
    return classeRepository.selectBylibelle(libelle);
   }
   public void ajouterclasse(classe classe){
    classeRepository.insert(classe);
   }
public Classe rechercherClasseParlib(String lib) {
    
    throw new UnsupportedOperationException("Unimplemented method 'rechercherClasseParlib'");
}

}


