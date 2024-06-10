package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.classe;

public class classerepository extends Database implements Iclasse{
 
     private static final String SQL_SELECT_BY_lIBELLE = null;
    private final  String SQL_SELECT_ALL="select * from classe" ;
     private final  String SQL_SELECT_BY_NUM="select * from agence where libelle_clt like ? " ;
     private final  String SQL_INSERT="INSERT INTO classe (id_cl, lebelle_clt) VALUES (?,?)";
    
    public  List<classe> selectAll(){
         List<classe> classes=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
               
                 classe cl=new classe();
                 cl.setId(rs.getInt("id_ag"));
                 cl.setNumero(rs.getString("numero_ag"));
                 cl.setAdresse(rs.getString("adresse_ag"));
                 cl.setTelephone(rs.getString("tel_ag"));
                 classe.add(cl);
             }
             rs.close();
           closeConnexion();
        }
       catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
      }
        return  classes;
    }
    public  Classe selectBylibelle(String lib){
        Classe cl=null;
     try {
          openConnexion();
          initPreparedStatement(SQL_SELECT_BY_lIBELLE);
          String libelle;
        statement.setString(1, libelle);
          ResultSet rs= executeSelect();
           if (rs.next()) {
               
                 cl=new Classe();
                 cl.setId(rs.getInt("id_cl"));
                 cl.setNumero(rs.getString("liblle_cl"));
                 
                 
           }
           rs.close();
           closeConnexion();
      } 
      catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
    }
      return  cl;
     }
   
    public  void insert(classe classe){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                entities.classe agence;
                statement.setString(1, agence.getId());
                statement.setString(2, agence.getLibelle());
                
                int nbreLigne=executeUpdate();
               closeConnexion();
             } catch (SQLException e) {
              e.printStackTrace();
             }
           
     }
}

