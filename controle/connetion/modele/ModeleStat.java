/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.connetion.modele;
//import com.sun.accessibility.internal.resources.accessibility;
import entite.Books;
import entite.Transaction;
import entite.adherents;
import java.util.ArrayList;
//import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
//import jdk.javadoc.internal.doclets.formats.h
/**
 *
 * @author lenovo
 */
public class ModeleStat extends AbstractTableModel {
      //Pour récupérer les enreg et les mettre dans le modele
Transaction transaction_1 = new Transaction();
private  ArrayList<Transaction> lesDonnees = transaction_1.getLsEnrg();
// les en-tête de colonne
private final String[] lesTitres = {
    "Date emprunt ", "Date retour ","ISBN ","Matricule ", "id_Transaction", "Nombre livre"};
    // Pour obtenir le numéro de ligne à partir du cod
    // pour obtenir le numéro de ligne à partir du code adherent
public int getNumLigne(int vISBN){
    String ISBN = "";
    int numLigne = 0;
    for (int i = 0; i < lesDonnees.size(); i++) {
        ISBN = lesDonnees.get(i).getMatricule();
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
                return lesDonnees.get(rowIndex).getId_item();
             case 1:
                return lesDonnees.get(rowIndex).getNombre_livre();
             case 2:
                return lesDonnees.get(rowIndex).getCategorie();
             
             
              
                default:
                    return null;
          
        }
            
           
        }
}
