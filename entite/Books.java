/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;
//Pour la connexion a la base de donnée
import controle.connetion.ControleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
// Pour les requete  SQL
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Pour la structure d'accueil des données
import java.util.ArrayList;
// Pour la gestion de la propriete date
import java.util.Date;
// Pour les boites de dialogue
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class Books {
    private String titre;
    private String auteur;
    private String categorie;
    private String ISBN;
    private int nbre_pages;
    private Date date_edition;
     private String date_enreg;
    private int nbre_ex;
    
    private static Connection laConnexion = ControleConnection.getLaConnetionStatique();
    private final ArrayList<Books> lesEnrg = new ArrayList<>();
    // Constructeur 1

    public Books(String titrej, String auteurj, String categoriej, String ISBNj, int nb, String strDate,String strDate1, int nbre_ex) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Books(String titrej, String auteurj, String categoriej) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNbre_ex() {
        return nbre_ex;
    }

    public void setNbre_ex(int nbre_ex) {
        this.nbre_ex = nbre_ex;
    }

   

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNbre_pages() {
        return nbre_pages;
    }

    public Date getDate_edition() {
        return date_edition;
    }

    public String getDate_enreg() {
        return date_enreg;
    }

    public void setDate_enreg(String date_enreg) {
        this.date_enreg = date_enreg;
    }

   
  

    public static Connection getLaConnexion() {
        return laConnexion;
    }

    public ArrayList<Books> getLesEnrg() {
        return lesEnrg;
    }
    
    // Mutateurs

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNbre_pages(int nbre_pages) {
        this.nbre_pages = nbre_pages;
    }

    public void setDate_edition(Date date_edition) {
        this.date_edition = date_edition;
    }

   

    public static void setLaConnexion(Connection laConnexion) {
        Books.laConnexion = laConnexion;
    }

    // Constructeur 2
    public Books(String vTitre, String vAuteur, String vCategorie, String ISBN, int vNbre_pages, Date vDate_edition,String vDate_enreg, int vnbre_ex) {
        this.nbre_pages = vNbre_pages;
        this.ISBN = ISBN;
        this.titre = vTitre;
        this.auteur = vAuteur;
        this.categorie = vCategorie;
        this.date_edition = vDate_edition;
         this.date_enreg = vDate_enreg;
        this.nbre_ex = vnbre_ex;
    }
    // Accesseur

    public Books() {
        // à activer des création de la  methodes 
        lireRecupCRUD();
    }
    
    public Books(String ISBN) {
       
        this.ISBN = ISBN;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private void lireRecupCRUD() {
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT * " + "FROM books ORDER BY titre");
            while (rs.next()) {
                String titrej = rs.getString("titre");
                String auteurj = rs.getString("auteur");
                String categoriej = rs.getString("categorie");
                String ISBNj = rs.getString("ISBN");
                int nbre_pagesj = rs.getInt("nbre_pages");
                Date date_editionj = rs.getDate("date_edition");
                 String date_enregj = rs.getString("DateEnregistrement");
                int nbre_ex = rs.getInt("Nbre_examplaire");
              //  int id_itemj = rs.getInt("id_item");
                lesEnrg.add(new Books(titrej, auteurj, categoriej, ISBNj, nbre_pagesj, date_editionj,date_enregj, nbre_ex));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Probleme rencontré : " + e.getMessage(), "Résutat", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean creerCRUD(String vTitre, String vAuteur, String vCategorie, String vISBN, int vNbre_pages, String vDate_edition,String vDate_enreg,int vnbre_ex) {
        boolean bCreation = false;
        String requete = null;
        try {
            requete = "INSERT INTO books VALUES (?,?,?,?,?,?,?,?) ";
            PreparedStatement prepare = laConnexion.prepareStatement(requete);
            prepare.setString(1, vTitre);
            prepare.setString(2, vAuteur);
            prepare.setString(3, vCategorie);
            prepare.setString(4, vISBN);
            prepare.setInt(5, vNbre_pages);
            prepare.setString(6,  vDate_edition);
            prepare.setString(7, vDate_enreg);
            prepare.setInt(8, vnbre_ex);
             JOptionPane.showMessageDialog(null, "Ajout dans la BD effectué avec succès :");
            //prepare.setString(7, vId_item);
             prepare.executeUpdate();
                 prepare.close();
            bCreation = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ajout dans la DB non effectué : " + e.getMessage(), "Problème recontré", JOptionPane.ERROR_MESSAGE);

        }
        return bCreation;
    }
     public boolean supprimerCRUD(String ISBN) {
           boolean bsuppression = true;
           String requete = null;
           try {              
                   requete = "DELETE FROM books" + " WHERE ISBN = '" + ISBN + "'";
               Statement state = laConnexion.createStatement();
               int nbEnregegSup = 
                       state.executeUpdate(requete);
               if (nbEnregegSup == 0) {
                    JOptionPane.showMessageDialog(null, "Suppression dans la BD non  effectué ");
               }
            JOptionPane.showMessageDialog(null, "Suppression dans la BD  effectué :) ");
// "DELETE FROM adherent WHERE matricule="+ matricule;
              
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Suppression dans la BD non effectué :) " + e.getMessage(), "Problème rencontré", JOptionPane.ERROR_MESSAGE);
               
           }
        return bsuppression;
    }
     
     public boolean modifierCRUD (String vTitre, String vAuteur, String vCategorie, String vISBN, int vNbre_pages, String vDate_edition,String vDate_enreg,int vnbre_ex){
         boolean bcreation = false;
         String requete = null;
         try {
             
            requete = "UPDATE books SET"            
                     + " titre = ?,"
                     + " auteur = ?,"
                     + " categorie = ?,"
                     + " nbre_pages = ?,"
                     + " date_edition = ?,"
                     + " DateEnregistrement = ?,"
                     + " Nbre_examplaire = ?"  
                     + " WHERE ISBN = ?";
             PreparedStatement prepare = laConnexion.prepareStatement(requete);
                 prepare.setString(1, vTitre);
                 prepare.setString(2, vAuteur);
                 prepare.setString(3, vCategorie);
                 prepare.setInt(4, vNbre_pages);
                 prepare.setString(5, vDate_edition);
                  prepare.setString(6, vDate_enreg);
                  prepare.setInt(7, vnbre_ex);
                 prepare.setString(8,vISBN );
                 
                 prepare.executeUpdate();
                 prepare.close();
                  bcreation = true;  
            JOptionPane.showMessageDialog(null, "Modifications dans la BD effectuées avec succès :");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Modification dans la BD non effectuées :) " + e.getMessage(), "Problème rencontré", JOptionPane.ERROR_MESSAGE);
        }
        return bcreation;
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

}
