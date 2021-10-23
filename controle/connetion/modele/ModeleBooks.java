/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.connetion.modele;
//import com.sun.accessibility.internal.resources.accessibility;
import entite.Books;
import entite.adherents;
import java.util.ArrayList;
//import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
//import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle;
/**
/**
 *
 * @author lenovo
 */
public class ModeleBooks extends AbstractTableModel {
     //Pour récupérer les enreg et les mettre dans le modele
Books instanceBooks = new Books();
private  ArrayList<Books> lesDonnees = instanceBooks.getLesEnrg();
// les en-tête de colonne
private final String[] lesTitres = {
    "Titre", "Ateur", "Catégorie", "ISBN", "Nbre de Pages", "Date d'édition","Date d'enregistrement", "Nombre d'exemplaires"};
    // Pour obtenir le numéro de ligne à partir du cod
    // pour obtenir le numéro de ligne à partir du code adherent
public int getNumLigne(int vISBN){
    String ISBN = "";
    int numLigne = 0;
    for (int i = 0; i < lesDonnees.size(); i++) {
        ISBN = lesDonnees.get(i).getISBN();
       if (ISBN.equals(vISBN)){
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
                return lesDonnees.get(rowIndex).getTitre();
             case 1:
                return lesDonnees.get(rowIndex).getAuteur();
             case 2:
                return lesDonnees.get(rowIndex).getCategorie();
             case 3:
                return lesDonnees.get(rowIndex).getISBN();
              case 4:
                return lesDonnees.get(rowIndex).getNbre_pages();
              case 5:
                return lesDonnees.get(rowIndex).getDate_edition();
                case 6:
                return lesDonnees.get(rowIndex).getDate_enreg();
                 case 7:
                return lesDonnees.get(rowIndex).getNbre_ex();
                default:
                    return null;
          
        }
        
    }
     public  void creerMOD(Books leBooks) {
        lesDonnees.add(leBooks);
        fireTableRowsInserted
                (lesDonnees.size() -1, lesDonnees.size()-1);
    }
     public  void supprimerMOD(int rowindex){
        lesDonnees.remove(rowindex);
         fireTableRowsInserted(rowindex, rowindex);
    }
      public  void modifieMOD(int firstRow,int lastRow, Books leBooks){
          
        lesDonnees.set(firstRow,leBooks);
          //fireTableRowsInserted(firstRow, lastRow);
    }
      public void lireRecupMOD(ArrayList<Books> nouvelleDonnees){
          lesDonnees = nouvelleDonnees;
          //fireTableChanged();
      }
    public String getColumnName(int columnIndex) {
        return lesTitres[columnIndex];
    }
    public static void main(String[] args) {
       ModeleBooks test = new ModeleBooks();
      System.out.println("NB Livre : " + test.getRowCount());
        System.out.println("nom du premier Livre : " + test.getValueAt(0, 0));
    }

   

    
   
}
