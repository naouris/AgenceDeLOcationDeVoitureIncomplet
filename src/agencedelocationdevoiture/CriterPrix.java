/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

/**
 *
 * @author wiemhjiri
 */
public class CriterPrix implements Critere{

    private float prix;
    
    @Override
    public boolean estSatisfaitPar(Voiture v) {
return prix>=v.getPrixLocation();
// à compléter

    }
    
}
