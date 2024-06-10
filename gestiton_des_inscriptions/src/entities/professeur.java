package entities;

import java.util.ArrayList;

public class professeur {
    private int id;
    private String nom; 
    private String grade; 
    private String nci;

    ArrayList<classe> classeList=new ArrayList<>();

    public ArrayList<classe> getClasseList() {
        return classeList;
    }

    public void setClasseList(ArrayList<classe> classeList) {
        this.classeList = classeList;
    }

    public professeur(){

    }

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
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getNci() {
        return nci;
    }
    public void setNci(String nci) {
        this.nci = nci;
    }
    
}
