/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;


/**
 *
 * @author Princy-Grace
 */
public class Paramtres {
       private String nomUtilisateur;
       private String motDePasse;
       private String ServeurBD;
       private String driverSGBD;

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getServeurBD() {
        return ServeurBD;
    }

    public void setServeurBD(String ServeurBD) {
        this.ServeurBD = ServeurBD;
    }

    public String getDriverSGBD() {
        return driverSGBD;
    }

    public void setDriverSGBD(String driverSGBD) {
        this.driverSGBD = driverSGBD;
    }

 public Paramtres() {
        nomUtilisateur ="jules";
        motDePasse ="1937";
        driverSGBD="com.mysql.cj.jdbc.Driver";
        ServeurBD="jdbc:mysql://localhost:3306/bd_lms";
    }
             
   

    
}

    

