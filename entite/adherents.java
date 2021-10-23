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

public class adherents extends User{
    
    
    //Propriete
    private  String nom;
    private String sexe;
    private int phone_number;
    private String adresse_mail;
    private String statut;
    private String matricule;
    private String login;
    private String password;
    private String nationalite;
    private Date date_naissance;        
   // Propriete pour etablir la connexion avec la BD
     private static Connection laConnexion = ControleConnection.getLaConnetionStatique();
     //Propriete de type arraylist aui contient les Enregistrement de la BD
     private final  ArrayList<adherents> lesEnrg = new ArrayList<>();
     //Getters de base 

    public adherents(String vMatricule) {
        this.matricule = vMatricule; //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public adherents(String nomj, String sexej, int phone_numberj, String adresse_mailj, String statutj, String matriculej, String loginj, String passwordj, String nationalitej, Date strDate, String id_userj) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
 

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getAdresse_mail() {
        return adresse_mail;
    }

    public String getStatut() {
        return statut;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getNationalite() {
        return nationalite;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public ArrayList<adherents> getLesEnrg() {
        return lesEnrg;
    }

   // public int getId_user() {
     //   return id_user;
  //  }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

   // public void setId_user(int id_user) {
     //   this.id_user = id_user;
 //   }
// Premier constructeur
      public adherents(int vPhone_number, String vNom, String vSexe, String vAdresse_mail,String vStatut,String vMatricule, String vLogin,String vPassword,String vNationalite, Date vDate_naissance, int vId_user) {
    super(vPhone_number);
    this.phone_number = vPhone_number;
    this.nom  = vNom;    
    this.sexe = vSexe;
    this.adresse_mail = vAdresse_mail;
    this.statut = vStatut;
     this.matricule = vMatricule;
    this.login = vLogin;
    this.password = vPassword;
    this.nationalite = vNationalite;
    this.date_naissance = vDate_naissance;
    this.id_user = vId_user;
    }
    public adherents(String vNom,String vSexe, int vPhone_number,String vAdresse_mail, String vStatut,String vMatricule, String vLogin,String vPassword,String vNationalite, Date vDate_naissance, int vId_user){
    //super(vId_user);
   // this.id_user = vId_user;
    this.nom = vNom;
    this.sexe = vSexe;
    phone_number = vPhone_number;
    this.adresse_mail = vAdresse_mail;
    this.statut = vStatut;
    this.matricule = vMatricule;
    this.login = vLogin;
    this.password = vPassword;
    this.nationalite = vNationalite;
    this.date_naissance = vDate_naissance;
    this.id_user = vId_user; 
    }
  

    public adherents() {
     
       lireRecupCRUD();
        
    }
     private void lireRecupCRUD(){
         try {
          
             Statement state = laConnexion.createStatement();
             ResultSet rs = state.executeQuery("SELECT * "  + "FROM adherents ORDER BY nom ");
             while (rs.next()){
                 String nomj = rs.getString("nom");
                 String sexej = rs.getString("sexe");
                 int  phone_numberj = rs.getInt("phone_number");
                 String adresse_mailj = rs.getString("adresse_mail");
                 Date date_naissancej = rs.getDate("date_naissance");
                  String statutj = rs.getString("statut");
                  String matriculej = rs.getString("matricule");
                  String loginj =  rs.getString("login");
                  String passwordj =  rs.getString("password");
                  int  id_userj =  rs.getInt("id_user");
                  String nationalitej =  rs.getString("nationalite");
                  lesEnrg.add(new adherents(phone_numberj, nomj, sexej, adresse_mailj,statutj, matriculej, loginj, passwordj, nationalitej, date_naissancej, id_userj ));         //(nomj, sexej, phone_numberj,adresse_mailj,date_naissancej, statutj, matriculej,id_userj, loginj, passwordj, nationalitej));
             }   
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Probleme rencontré : " + e.getMessage(), "Résutat", JOptionPane.ERROR_MESSAGE);
         }
     }
     public boolean creerCRUD (String vNom, String vSexe,int vPhone_number,  String vAdresse_mail,String vStatut,String vMatricule, String vLogin,String vPassword,String vNationalite, String vDate_naissance, int vId_user){
         boolean bcreation = false;
         String requete = null;
         try {
             
            requete = "INSERT INTO "
                 + "adherents  VALUES(?,?,?,?,?,?,?,?,?,?,?)"; //('"+vNom+"','"+vSexe+"','"+vPhone_number+"','"+vAdresse_mail+"','"+vDate_naissance+"','"+vStatut+"','"+vMatricule+"','"+vId_user+"','"+vLogin+"','"+vPassword+"','"+vNationalite+"')";
             PreparedStatement prepare = laConnexion.prepareStatement(requete);
                 prepare.setString(1, vNom);
                 prepare.setString(2, vSexe);
                 prepare.setInt(3, vPhone_number);
                 prepare.setString(4, vAdresse_mail);
                 prepare.setString(5, vDate_naissance);
                 prepare.setString(6,vStatut );
                 prepare.setString(7, vMatricule);
                 prepare.setInt(8, vId_user);
                 prepare.setString(9, vLogin);
                 prepare.setString(10, vPassword);
                 prepare.setString(11, vNationalite);
                 prepare.executeUpdate();
                 prepare.close();
                  bcreation = true;     
                    JOptionPane.showMessageDialog(null, "Ajout dans la BD effectué avec succès :");
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Ajout dans la BD non effectué :) " + e.getMessage(), "Problème rencontré", JOptionPane.ERROR_MESSAGE);
         }
        return bcreation;
     }
       public boolean modifierCRUD (String vNom, String vSexe,int vPhone_number,  String vAdresse_mail,String vStatut,String vMatricule, String vLogin,String vPassword,String vNationalite, String vDate_naissance, int vId_user){
         boolean bcreation = false;
         String requete = null;
         try {
             
            requete = "UPDATE adherents SET"            
                     + " nom = ?,"
                     + " sexe = ?,"
                     + " phone_number = ?,"
                     + " adresse_mail = ?,"
                     + " date_naissance = ?,"
                     + " statut = ?,"      
                     + " id_user = ?,"
                     + " login = ?,"
                     + " password = ?, "
                     + " nationalite = ?"
                     + " WHERE matricule = ?";
             PreparedStatement prepare = laConnexion.prepareStatement(requete);
                 prepare.setString(1, vNom);
                 prepare.setString(2, vSexe);
                 prepare.setInt(3, vPhone_number);
                 prepare.setString(4, vAdresse_mail);
                 prepare.setString(5, vDate_naissance);
                 prepare.setString(6,vStatut );
                 prepare.setInt(7, vId_user);
                 prepare.setString(8, vLogin);
                 prepare.setString(9, vPassword);
                 prepare.setString(10, vNationalite);
                  prepare.setString(11, vMatricule);
                 prepare.executeUpdate();
                 prepare.close();
                  bcreation = true;  
            JOptionPane.showMessageDialog(null, "Modifications dans la BD effectuées avec succès :");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Modification dans la BD non effectuées :) " + e.getMessage(), "Problème rencontré", JOptionPane.ERROR_MESSAGE);
        }
        return bcreation;
    }

    public boolean supprimerCRUD(String matricule) {
        boolean bsuppression = true;
        String requete = null;
        try {
            requete = "DELETE FROM adherents" + " WHERE matricule = '" + matricule + "'";
            Statement state = laConnexion.createStatement();
            int nbEnregegSup = state.executeUpdate(requete);
            state.executeUpdate(requete);
            if (nbEnregegSup == 0) {
                JOptionPane.showMessageDialog(null, "Suppression dans la BD non  effectué ");
            }
// "DELETE FROM adherent WHERE matricule="+ matricule;
            JOptionPane.showMessageDialog(null, "Suppression dans la BD  effectué :) ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Suppression dans la BD non effectué :) " + e.getMessage(), "Problème rencontré", JOptionPane.ERROR_MESSAGE);

        }
        return bsuppression;
    }
    public ArrayList<adherents> chercherCRUD(String items,String vmatricule){
      
            String requete = "SELECT * FROM adherents"
                    + " WHERE " + items+ " LIKE '%" + vmatricule + "%'";
                   
            try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery(requete);
                while (rs.next()) {
                    String nomj = rs.getString("nom");
                 String sexej = rs.getString("sexe");
                 int  phone_numberj = rs.getInt("phone_number");
                 String adresse_mailj = rs.getString("adresse_mail");
                 Date date_naissancej = rs.getDate("date_naissance");
                  String statutj = rs.getString("statut");
                  String matriculej = rs.getString("matricule");
                  String loginj =  rs.getString("login");
                  String passwordj =  rs.getString("password");
                  int  id_userj =  rs.getInt("id_user");
                  String nationalitej =  rs.getString("nationalite");
                    lesEnrg.add(new adherents(phone_numberj, nomj, sexej, adresse_mailj,statutj, matriculej, loginj, passwordj, nationalitej, date_naissancej, id_userj ));         
                }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Probleme rencontré : " + e.getMessage(), "Résutat", JOptionPane.ERROR_MESSAGE);
        }
            return lesEnrg;
    }

}
