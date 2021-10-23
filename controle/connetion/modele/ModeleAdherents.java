/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.connetion.modele;
//import com.sun.accessibility.internal.resources.accessibility;
import entite.adherents;
import java.util.ArrayList;
//import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
//import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle;
/**
 *
 * @author lenovo
 */
public class ModeleAdherents extends AbstractTableModel{
    //Pour récupérer les enreg et les mettre dans le modele
adherents instanceAderhent = new adherents();
private ArrayList<adherents> lesDonnees = instanceAderhent.getLesEnrg();
// les en-tête de colonne
private final String[] lesTitres = {
    "Nom", "Sexe", "Phone Number", "Adresse mail", "Date de naissance", "Statut", "Matricule", "Login", "Password", "Id User", "Nationalité"};
    // Pour obtenir le numéro de ligne à partir du cod
    // pour obtenir le numéro de ligne à partir du code adherent
public int getNumLigne(int vMatricule){
    String matricule = "";
    int numLigne = 0;
    for (int i = 0; i < lesDonnees.size(); i++) {
        matricule = lesDonnees.get(i).getMatricule();
       if (matricule.equals(vMatricule)){
           numLigne =i;
       } 
    }
    return numLigne;
}
   

    public int getRowCount() {
        return lesDonnees.size();
    }


    public int getColumnCount() {
        
        return lesTitres.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            
            case 0:
                return lesDonnees.get(rowIndex).getNom();
             case 1:
                return lesDonnees.get(rowIndex).getSexe();
             case 2:
                return lesDonnees.get(rowIndex).getPhone_number();
             case 3:
                return lesDonnees.get(rowIndex).getAdresse_mail();
              case 4:
                return lesDonnees.get(rowIndex).getDate_naissance();
              case 5:
                return lesDonnees.get(rowIndex).getStatut();
              case 6:
                return lesDonnees.get(rowIndex).getMatricule();
              case 7:
                return lesDonnees.get(rowIndex).getLogin();
                 case 8:
                return lesDonnees.get(rowIndex).getPassword();
                 case 9:
                return lesDonnees.get(rowIndex).getId_user();
                 case 10:
                return lesDonnees.get(rowIndex).getNationalite();
                default:
                    return null;
          
        }
        
    }
     public  void lireRecupMOD(ArrayList<adherents> nouvelleDonnees) {
        lesDonnees = nouvelleDonnees;
    }
     
     public  void creerMOD(adherents l_adherent) {
        lesDonnees.add(l_adherent);
    }
     public  void supprimerMOD(int rowindex){
        lesDonnees.remove(rowindex);
    }
      public  void modifieMOD(int firstRow,int lastRow, adherents l_adherent){
          
        lesDonnees.set(firstRow,l_adherent);
    }
    public String getColumnName(int columnIndex) {
        return lesTitres[columnIndex];
    }
    public static void main(String[] args) {
       ModeleAdherents test = new ModeleAdherents();
      System.out.println("NB Adherent : " + test.getRowCount());
        System.out.println("nom du premier adherent : " + test.getValueAt(0, 0));
    }
   
}

