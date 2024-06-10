package repository;

import java.util.List;
import entities.classe;

public interface Iclasse {
    List<classe> selectAll() ; 
    classe selectBylibelle(String libelle);
    void insert(classe classe);
}
