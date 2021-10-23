/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author lenovo
 */
public abstract class User {
    int id_user;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    //Premier Constructeur
    public User(int vId_user) {
        
        id_user = vId_user;
    }

   //Constructeur  Pour la recherche

   // public User(int vId_user){
      //  id_user = vId_user;     
  // }

    public User() {
    }
    
}
