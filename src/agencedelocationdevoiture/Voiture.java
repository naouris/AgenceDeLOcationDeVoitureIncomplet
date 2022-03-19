/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

import java.util.Objects;

/**
 *
 * @author wiemhjiri
 */
public class Voiture {
    
private int immariculation;
private String marque;
private float prixLocation;

    public Voiture(int immariculation, String marque) {
        this.immariculation = immariculation;
        this.marque = marque;
    }




public int getImmariculation() {
return immariculation;
}
public void setImmariculation(int immariculation) {
this.immariculation = immariculation;
}
public String getMarque() {
return marque;
}
public void setMarque(String marque) {
this.marque = marque;
}
public float getPrixLocation() {
return prixLocation;
}
public void setPrixLocation(float prixLocation) {
this.prixLocation = prixLocation;
}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.immariculation;
        hash = 67 * hash + Objects.hashCode(this.marque);
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
        final Voiture other = (Voiture) obj;
        if (this.immariculation != other.immariculation) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Voiture{" + "immariculation=" + immariculation + ", marque=" + marque + ", prixLocation=" + prixLocation + '}';
    }






}
