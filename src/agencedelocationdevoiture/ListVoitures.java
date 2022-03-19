/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author wiemhjiri
 */
public class ListVoitures {
    private List<Voiture> voitures;

    public ListVoitures(List<Voiture> voitures) { 
//à compléter
this.voitures=voitures;
    }
public ListVoitures() {
//à compléter
voitures=new ArrayList<>();
}
public List<Voiture> getVoitures() {
   return this.voitures;
//à compléter
}
public void setVoitures(List<Voiture> voitures) {
//à compléter
 this.voitures=voitures;
}
public void ajoutVoiture(Voiture v) throws VoitureException{
//à compléter
if (voitures.contains(v))
    throw new VoitureException("la voiture existe déja ");
voitures.add(v);

}

public void supprimeVoiture(Voiture vl) throws VoitureException{
// à compléter
if(!voitures.contains(vl))
        throw new VoitureException("la voiture n'existe ps");
voitures.remove(vl);
}

public int size(){
        return voitures.size();
}
public void affiche(){
    voitures.forEach(e->System.out.println(e));
}

    @Override
    public String toString() {
        return "ListVoitures{" + "voitures=" + voitures + '}';
    }

   

}
