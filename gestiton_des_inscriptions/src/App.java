import java.util.List;
import java.util.Scanner;

import Service.classeservice;
import Service.professeurservice;
import Service.étudiantservice;
import entities.classe;
import entities.etudiant;
import entities.professeur;
import repository.Iclasse;
import repository.etudiantrepository;
import repository.professeurepository;

public class App {
    public static void main(String[] args) throws Exception {
       int choix;
       Scanner sc=new Scanner(System.in);

         etudiantrepository etudiantrepository=new etudiantrepository();
         professeurepository professeurepository=new professeurepository();
         Iclasse classerepository=(Iclasse) new classerepository();
       
         classeservice classeservice=new classeservice(classerepository);
         professeurservice professeurservice=new professeurservice(professeurepository);
         étudiantservice etudiantservice=new étudiantservice(etudiantrepository);

         do {
            System.out.println("1-creer des classes");
            System.out.println("2-Lister des classes"); 
            System.out.println("3-ajouter professeur"); 
            System.out.println("4-lister professeur");
            System.out.println("5-faire une inscription"); 
            System.out.println("7-lister les etudiants"); 
            System.out.println("8-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();

             switch (choix) {
                case 1 :
                     System.out.println("Entrer le libelle");
                     String lib = sc.nextLine();
                     String libelle;
                     Classe classe=  classeservice.rechercherClasseParlib(lib);
                     if (classe!=null) {
                          System.out.println("Cette clsse existe deja");
                     } else {
                         System.out.println("Entrer un id");
                         String id = sc.nextLine(); 
                         System.out.println("Entrer un libelle");
                         libelle=sc.nextLine();
                         classe=new Classe();
                         classe.setId(id);
                         classe.setLibelle(libelle);
                         classeservice.ajouterclasse(null);
                     }
                   break;
                   case 2:
                    List<classe> classes=  classeservice.listercClasse();
                     for ( classe classesClasse: classes) {
                          System.out.println("id "+ classe.getId());
                          System.out.println("libelle "+ classe.getLibelle());
                          System.out.println("=================================");
                     }
                    break;
                    case 3:
                     System.out.println("Entrer un Nom");
                     String nom=sc.nextLine(); 
                     System.out.println("Entrer une grade");
                     String grade=sc.nextLine();  
                     System.out.println("Entrer un nci");
                     String nci=sc.nextLine();   
                     professeur pr=new professeur();
                      pr.setNom(nom);
                      pr.setGrade(grade);
                      pr.setNci(nci);
                    professeurservice.ajouterprofesseur(pr);
                    break;
                
                    case 4:
                    List<professeur> professeurs=  professeurservice.listerpProfesseurs();
                     for (professeur professeur: professeurs) {
                          System.out.println("id "+ classe.getId());
                          System.out.println("Nom "+ classe.getNom());
                          System.out.println("grade "+ classe.getGrade());
                          System.out.println("cdi "+ classe.getCdi());

                          System.out.println("=================================");
                     }
                    break;
                    case 5:
                     System.out.println("Entrer un Nom");
                     String Nom=sc.nextLine(); 
                     System.out.println("Entrer une matricule");
                     String matricule=sc.nextLine();  
                     System.out.println("Entrer un tuteur");
                     String tuteur=sc.nextLine();   
                     etudiant etd=new etudiant();
                      etd.setNom(nom);
                      etd.setMatricule(matricule);
                      etd.setTuteur(tuteur);
                    etudiantservice.ajouteretudiant(pr);
                    break;
                    case 6:
                    List<etudiant> etudiants=  etudiantservice.listereEtudiants();
                     for (etudiant etudiant: etudiants) {
                          System.out.println("id "+ classe.getId());
                          System.out.println("Nom "+ classe.getNom());
                          System.out.println("matricule"+ classe.getMatricule());
                          System.out.println("=================================");
                     }
                    break;

             }
         } while (choix!=7);
       


    }
}
