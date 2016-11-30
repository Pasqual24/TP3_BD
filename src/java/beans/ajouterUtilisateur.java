/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import classes.Membre;
import classes.MembreUtil;
import classes.Typemembre;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author kfiliatreault
 */
@ManagedBean
@RequestScoped
public class ajouterUtilisateur {

    private MembreUtil MembreUtil;
    private String nomUtil;
    private String email;
    private String Mdp;
    private String MdpConf;
    private Typemembre Type;
    private String message;
  
    /**
     * Creates a new instance of ajouterClient
     */
    public ajouterUtilisateur() {
        MembreUtil = new MembreUtil();
    }
    
    public String getMessage() {
        return message;
    }
    
    public void ajouterMembre()
    {
       
        MembreUtil.ajouterClient(nomUtil, email, Mdp, Type);
        message = "Le client a bien été ajouté!";
    }
    public Membre getMembre()
    {
        Membre unMem ;
        unMem=MembreUtil.getClient(nomUtil,Mdp);
        if(unMem == null)
        {
            
          message = "Aucun membre trouvé";
        }
        else
        {  
          message = "Le client a été trouvé!";
        }
        return unMem;
       
    }

   
    public void setNom(String nom) {
        this.nomUtil = nom;
    }
    public void setEmail(String Email) {
        this.email = Email;
    }
     public void setMdp(String Mdp) {
        this.Mdp = Mdp;
    }
    public void setMdpConf(String Mdp) {
        this.MdpConf = Mdp;
    }
     public void setType(Typemembre Type) {
        this.Type = Type;
    }
      public String getNom() {
        return this.nomUtil ;
    }
    public String getEmail() {
       return this.email;
    }
     public String getMdp() {
       return this.Mdp;
    }
  
     public Typemembre getType() {
        return this.Type;
    }

}
