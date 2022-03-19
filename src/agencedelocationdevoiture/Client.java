/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

import java.util.Comparator;

/**
 *
 * @author wiemhjiri
 */
public class Client{
    
private int code;
private String nom;
private String prenom;

    public Client(int code, String nom, String prenom) {
        
// à compléter
this.code=code;
this.nom=nom;
this.prenom=prenom;

    }


public int getCode() { return code;
}
public void setCode(int code) {
this.code = code;
}
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String getPrenom() {
return prenom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (this.code != other.code) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "code=" + code + ", nom=" + nom + ", prenom=" + prenom + '}';
    }


   
    

    
}
