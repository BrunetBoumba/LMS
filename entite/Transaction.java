/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import controle.connetion.ControleConnection;
import controle.connetion.controle.utilitaire.GestionDates;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projet_lms.RemisesEmprunt;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author lenovo
 */
public class Transaction {
   private Date date_emprunt;
    private Date date_retour;
    private String id_item;
    private String matricule;
    private int id_transaction;
      private int nombre_livre;
     private String categorie;
    private static Connection laConnexion = 
            ControleConnection.getLaConnetionStatique();
    private ArrayList<Books> lesEnrg = new ArrayList<>();
     
    private static Connection lConnexion = 
            ControleConnection.getLaConnetionStatique();
    private ArrayList<Transaction> lsEnrg = new ArrayList<>();
    // Constructeur 1 

    public Transaction() {
        lireRecupCRUD();
    }
    // Constructeur 2

    /**
     *
     * @param date_emprunt
     * @param date_retour
     * @param id_item
     * @param matricule
     * @param id_transaction
     * @param nbre_livre
     */
    public Transaction(Date date_emprunt, Date date_retour, String id_item, String matricule, int id_transaction,int nbre_livre) {
        this.date_emprunt = date_emprunt;
        this.date_retour = date_retour;
        this.id_item = id_item;
        this.id_transaction = id_transaction;
        this.matricule = matricule;
        this.nombre_livre = nbre_livre;
    }
    // Constructeur 3
    // Pour la gestion des transaction
    public Transaction(int vId_transaction) {
        
        id_transaction = vId_transaction;
    }
    // Accessuers
    
   
    public int getNombre_livre() {
        return nombre_livre;
    }

    public void setNombre_livre(int nombre_livre) {
        this.nombre_livre = nombre_livre;
    }

  

    public Date getDate_emprunt() {
        return date_emprunt;
    }

    public Date getDate_retour() {
        return date_retour;
    }

    public String getId_item() {
        return id_item;
    }

    public String getMatricule() {
        return matricule;
    }

    public int getId_transaction() {
        return id_transaction;
    }

    public static Connection getLaConnexion() {
        return laConnexion;
    }

    public ArrayList<Books> getLesEnrg() {
        return lesEnrg;
    }

    public ArrayList<Transaction> getLsEnrg() {
        return lsEnrg;
    }

    public void setLsEnrg(ArrayList<Transaction> lsEnrg) {
        this.lsEnrg = lsEnrg;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    
     public boolean creerCRUD(String vdate_emprunt, String vdate_retour, String vid_item, String vmatricule, int vid_transaction, int vnbre_livre) throws SQLException {
        boolean bCreation = false;
        String requete = null;
        
             
        try {
           String requete1;
              Statement state = laConnexion.createStatement();
             ResultSet rs= state.executeQuery("SELECT * " + "FROM books  WHERE ISBN = " + vid_item);
              while (rs.next()) {
                   int nbres = rs.getInt("Nbre_examplaire");
                           // rs.close();
                int tot;
                tot = nbres - vnbre_livre;
                if (tot > 0 ) {
                    rs= state.executeQuery("SELECT SUM(nombre_livre) AS nb " + "FROM transaction  WHERE matricule = " + vmatricule);
                    while (rs.next()) {
                       int nbre = rs.getInt("nb"); 
                        if (nbre >= 4  ) {
                             JOptionPane.showMessageDialog(null, "Votre nombre limite d'emprunt est atteint", "Attention", JOptionPane.ERROR_MESSAGE);
                        }else{
                         requete = "INSERT INTO transaction VALUES (?,?,?,?,?,?) ";
            PreparedStatement prepare = laConnexion.prepareStatement(requete);
            prepare.setString(1, vdate_emprunt);
            prepare.setString(2, vdate_retour);
            prepare.setString(3, vid_item);
            prepare.setString(4, vmatricule);
            prepare.setInt(5, vid_transaction);
             prepare.setInt(6, vnbre_livre);
              prepare.executeUpdate();
                 prepare.close();   
                 
                  requete1 = "UPDATE books SET Nbre_examplaire = " + tot +  "  WHERE ISBN = " + vid_item  ;
                     prepare = laConnexion.prepareStatement(requete1);
                     prepare.executeUpdate();
                      prepare.close();
                JOptionPane.showMessageDialog(null, "Ajout dans la BD effectué avec succès :");
            // ResultSet rs = state.executeQuery("SELECT COUNT(*) FROM transaction");
           // System.out.println(rs);
          
             
            //prepare.setString(7, vId_item);
            
                  
            bCreation = true;
                   
                        }
                    }
               
            }else{
                  JOptionPane.showMessageDialog(null, "Nombre de livre insuffisant = " + tot);  
                }
              }
                       
          
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ajout dans la DB non effectué : " + e.getMessage(), "Problème recontré", JOptionPane.ERROR_MESSAGE);

        }
        return bCreation;
    
    }

    public boolean lireRecupCRUD(String matriculej, String ISBNj) {
        boolean bCreation = false;
        try {

            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT * " + "FROM adherents ORDER BY nom ");
            while (rs.next()) {

                String vmatricule = rs.getString("matricule");
                if (matriculej.equals(vmatricule) && !ISBNj.equals("")) {
                    bCreation = true;
                    //rs.close();
                  //  rs = state.executeQuery("SELECT matricule " + "FROM transaction WHERE matricule = " + matriculej);
                   // int nbre = rs.getInt("nombre_livre");
                   // if (nbre > 4) {
                       // JOptionPane.showMessageDialog(null, "Désolé vous ne pouvez " + " plus emprunté", " > 4 livres", JOptionPane.ERROR_MESSAGE);

                    } else {
                       // rs.close();
                       // rs = state.executeQuery("SELECT * " + "FROM books  WHERE ISBN = " + ISBNj);
                       // int nbres = rs.getInt("Nbre_examplaire");
                       // int tot = nbres - nbre;
                       // if (tot < 0) {

                            //JOptionPane.showMessageDialog(null, "Désolé vous ne pouvez " + " pas emprunté", " le nombre de livre restant est " + nbres, JOptionPane.ERROR_MESSAGE);
                        }

                    }
                //}
                         //(nomj, sexej, phone_numberj,adresse_mailj,date_naissancej, statutj, matriculej,id_userj, loginj, passwordj, nationalitej));
             //}
              if (bCreation == false){
                     JOptionPane.showMessageDialog(null, "Ce matricule n'existe pas dans la base de données ou livre non choisi ", "Attention", JOptionPane.ERROR_MESSAGE);  
                   }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Probleme rencontré : " + e.getMessage(), "Résutat", JOptionPane.ERROR_MESSAGE);
         }
         return bCreation;
     } 
    
    
    
    public boolean lireRecupCRUD1(String matriculej, String ISBNj) {
        boolean bCreation = false;
       
        try {
             
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT * " + "FROM transaction WHERE matricule = " + matriculej);
            while (rs.next()) {
                String vmatricule = rs.getString("matricule");
                 String vISBN = rs.getString("ISBN");
                if (matriculej.equals(vmatricule) && ISBNj.equals(vISBN)) {
                    bCreation = true;
                   
                        }

                    }
                //}
                         //(nomj, sexej, phone_numberj,adresse_mailj,date_naissancej, statutj, matriculej,id_userj, loginj, passwordj, nationalitej));
             //}
              if (bCreation == false){
                     JOptionPane.showMessageDialog(null, "Ce matricule n'existe pas dans la base de données ou livre non existant ", "Attention", JOptionPane.ERROR_MESSAGE);  
                   }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Probleme rencontré : " + e.getMessage(), "Résutat", JOptionPane.ERROR_MESSAGE);
         }
         return bCreation;
     } 
    
     public boolean creerCRUD1( String vmatricule, String ISBN) throws SQLException {
        boolean bCreation = false;
        String requete = null;
        
             
        try {
            
            
           
            // ResultSet rs = state.executeQuery("SELECT COUNT(*) FROM transaction");
            // System.out.println(rs);
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT SUM(nombre_livre) AS nb,date_retour As date " + "FROM transaction  WHERE matricule = " + vmatricule + " AND  ISBN = '" + ISBN + "'");
            while (rs.next()) {

                int nbre = rs.getInt("nb");
                
                String mot = String.valueOf(nbre);
                RemisesEmprunt g = new RemisesEmprunt();
                g.getjTxt_nb().setText(mot);
                

                rs = state.executeQuery("SELECT * " + "FROM books  WHERE ISBN = " + ISBN);
                while (rs.next()) {

                    int nbres = rs.getInt("Nbre_examplaire");
                    // rs.close();
                    int tot;
                    tot = nbres + nbre;

                    requete = "DELETE FROM transaction" + " WHERE matricule = " + vmatricule + " AND  ISBN = '" + ISBN + "'";
                    int nbEnregegSup
                            = state.executeUpdate(requete);
                    //state.close();
                    if (nbEnregegSup == 0) {
                        JOptionPane.showMessageDialog(null, "Remise dans la BD non  effectué ", "Erreur", JOptionPane.ERROR_MESSAGE);
                    }
                    JOptionPane.showMessageDialog(null, "Remise dans la BD  effectué :) ");
                    //String vid_item = null;
                    String requete1 = "UPDATE books SET Nbre_examplaire = " + tot + "  WHERE ISBN = " + ISBN;
                    PreparedStatement prepare;
                    prepare = laConnexion.prepareStatement(requete1);
                    prepare.executeUpdate();
                    prepare.close();
                        // requete2 = "UPDATE transaction SET penelite = if(DATEDIFF(CURRENT_TIMESTAMP, date_retour) > 0, DATEDIFF(CURRENT_TIMESTAMP, date_retour) * 500,0)    " + tot +  "  WHERE ISBN = " + ISBN;
                   //prepare = laConnexion.prepareStatement(requete2);                    
                     //prepare.executeUpdate();
                     // prepare.close();  
                  }
                     
              }
                   
                            
          
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ajout dans la DB non effectué : " + e.getMessage(), "Problème recontré", JOptionPane.ERROR_MESSAGE);

        }
        return bCreation;
    
    }
    
    public Integer nombre () throws SQLException{
        Integer nbre = null;
          Statement state = laConnexion.createStatement();
          ResultSet rs= state.executeQuery("SELECT SUM(Nbre_examplaire ) AS nb " + "FROM books ");
                    while (rs.next()) {
                        nbre = rs.getInt("nb"); 
                    }
         return nbre;
    } 
     public Integer nombre1 () throws SQLException{
        Integer nbre = null;
          Statement state = laConnexion.createStatement();
          ResultSet rs= state.executeQuery("SELECT SUM(nombre_livre) AS nb " + "FROM transaction ");
                    while (rs.next()) {
                        nbre = rs.getInt("nb"); 
                    }
         return nbre;
    } 
    
    
          public ArrayList<Books> chercherCRUD(String items,String vISBN){
      
            String requete = "SELECT * FROM books"
                    + " WHERE " + items+ " LIKE '%" + vISBN + "%'";
                   
            try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery(requete);
                while (rs.next()) {
                   String titrej = rs.getString("titre");
                String auteurj = rs.getString("auteur");
                String categoriej = rs.getString("categorie");
                String ISBNj = rs.getString("ISBN");
                int nbre_pagesj = rs.getInt("nbre_pages");
                Date date_editionj = rs.getDate("date_edition");
                 String date_enregj = rs.getString("DateEnregistrement");
                 int vnbre_ex = rs.getInt("Nbre_examplaire");
                    lesEnrg.add(new Books(titrej, auteurj, categoriej, ISBNj, nbre_pagesj, date_editionj,date_enregj, vnbre_ex ));         
                }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Probleme rencontré : " + e.getMessage(), "Résutat", JOptionPane.ERROR_MESSAGE);
        }
            return lesEnrg;
    }
          private void lireRecupCRUD() {
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT * " + "FROM transaction "); // INNER JOIN books transaction.ISBN = books.ISBN  GROUP BY transaction.ISBN");;;
            while (rs.next()) { 
                Date vdate_emprunt = rs.getDate("date_emprunt");
                Date vdate_retour = rs.getDate("date_retour");
                String vid_item = rs.getString("ISBN");
                String vmatricule = rs.getString("matricule");
                 int vid_transaction = rs.getInt("id_transaction");
                 int vnombre_livre = rs.getInt("nombre_livre");
              
              //  int id_itemj = rs.getInt("id_item");
                lsEnrg.add(new Transaction(vdate_emprunt, vdate_retour, vid_item, vmatricule, vid_transaction, vnombre_livre));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Probleme rencontré : " + e.getMessage(), "Résutat", JOptionPane.ERROR_MESSAGE);
        }
    }

  
}
