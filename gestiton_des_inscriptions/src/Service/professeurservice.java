package Service;

import java.util.List;

import entities.professeur;
import repository.professeurepository;

public class professeurservice {
    professeurepository professeurepository;

   public professeurservice(repository.professeurepository professeurepository2) {
        //TODO Auto-generated constructor stub
    }
public  List<professeur>listerpProfesseurs(){
    
        return professeurepository.selectAll();
    }
    public void ajouterprofesseur(professeur professeur){
        professeurepository.insert(professeur);
    }

    public  professeur rechercherprofesseurParNom(String Nom){
        return professeurepository.selectprofesseurByNom(Nom);
    }
    
}
