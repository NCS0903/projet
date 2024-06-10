package Service;

import java.util.List;

import entities.etudiant;
import entities.professeur;
import repository.etudiantrepository;
import repository.professeurepository;

public class étudiantservice {

    private etudiantrepository etudiantrepository;
    public étudiantservice(repository.etudiantrepository etudiantrepository2) {
        //TODO Auto-generated constructor stub
    }



    public void etudiantservice(etudiantrepository etudiantrepository) {
       this.etudiantrepository = etudiantrepository;
     }

     

    public void etudiantservice(etudiantrepository etudiantepository, professeurepository professeurepository) {
        this.etudiantrepository = etudiantepository;
    }
    public void ajouteretudiant(professeur pr){
        etudiantrepository.insert(pr);
    }

    public List<etudiant> listereEtudiants(){
        return etudiantrepository.selectAll();
    }
}


