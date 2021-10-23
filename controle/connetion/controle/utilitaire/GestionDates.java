/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.connetion.controle.utilitaire;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author lenovo
 */
public class GestionDates {
    public static String dateEnChaineFR(Date laDate){
     // Choix de la Langue
    Locale   locale = Locale.FRANCE;
    // Définition du format utilisé
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", locale);
    String date = dateFormat.format(laDate);
    return date;   
    }
    public static String chaineDateFRversEN(String dateFR){
     String dateEN="";
     String vAnneeEN= dateFR.substring(6,10);
       String vMoisEN= dateFR.substring(3,5);
         String vJourEN= dateFR.substring(0,2);
         dateEN = vAnneeEN + "-" + vMoisEN + "-" + vJourEN;
         return dateEN;
         
    }
    public  static Date dateJavaEnDateSQL(Date laDate) {
        Date dateSQL = new java.sql.Date(laDate.getTime());
        return dateSQL;
    }

    public static Date chaineENversDateJava(String laDateChaineEN) 
    throws ParseException{
        SimpleDateFormat dateStandard = new SimpleDateFormat("yyyy-MM-dd");
        Date laDateDate = dateStandard.parse(laDateChaineEN);
        return laDateDate;
        
    }
    
}
